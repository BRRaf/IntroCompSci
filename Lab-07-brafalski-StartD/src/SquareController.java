import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SquareController implements ActionListener {
	private SquareStarter View;
	private SquarePanel sqpanel;
	
	public SquareController()  {
		View = new SquareStarter(this);
		sqpanel = View.getSqPanel();
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated meethod stub
		
		if (arg0.getSource() == View.getButtonPanel().getRegbutton()) {
			Random rand = new Random();
			int random = 0;
			random = rand.nextInt(101);
			
			
			Square[] mySquares = sqpanel.getmySquare();
			
			Square temp = sqpanel.pullRandomSquare(random);
			
			while(temp.getVisible() == true) {
				random = rand.nextInt(100);
				temp = mySquares[random];
			}
			
			if (temp.getVisible() == false) {
				temp.setVisible(true);
				temp.setColor(temp.getOgColor());
			}
		} else {
		
		Random rand = new Random();
		int random = 0;
		random = rand.nextInt(101);
		
		
		Square[] mySquares = sqpanel.getmySquare();
		
		Square temp = sqpanel.pullRandomSquare(random);
		
		while(temp.getVisible() == false) {
			random = rand.nextInt(100);
			temp = mySquares[random];
		}
		
		if (temp.getVisible() == true) {
			temp.setVisible(false);
			temp.setColor(Color.white);
		}
	
		
		sqpanel.setmySquare(mySquares);
		}
	}
}
