import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Random;

public class Controller implements ActionListener, MouseListener {
	
	ActionListener control;
	private View view;
	private PaintPanel paint;
	private ArrayList<Turkey> turkeylist;
	private int randomcorner;
	private Random rand;
	private Turkey turkey;
	
	public Controller() {
		super();
		view = new View(this);
		turkeylist = new ArrayList<Turkey>();
		 randomcorner = 0;
		 rand = new Random();
		 
		 
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
		rand = new Random(3);
		System.out.println(rand);
		randomcorner = rand.nextInt(3);
		if (randomcorner == 0) {
			turkey = new Turkey(0,0,0);
			turkeylist.add(turkey);
		}
		else if (randomcorner == 1) {
			turkey = new Turkey(700, 0, 1);
			turkeylist.add(turkey);
			
		} else if (randomcorner == 2) {
			turkey = new Turkey(700, 0, 2);
			turkeylist.add(turkey);
		} else if (randomcorner == 3) {
			turkey = new Turkey(700, 0, 3);
			turkeylist.add(turkey);
		}
		
		
		
		
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
