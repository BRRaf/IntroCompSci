import java.awt.event.ActionEvent;

import java.util.Random;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.Timer;

public class CBController implements ActionListener {
	
	ActionListener control;
	private CBView view;
	private CBModel model;
	Timer t;
	Random random;
	int r;
	
	public CBController() {
		view = new CBView(this);
		model = new CBModel();
		random = new Random();
		r = 0;
		
	}
	
	
	public CBView getView() {
		return view;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		if (e.getSource() == view.getTimer2()) {
			r = random.nextInt(4);
			while (((r == 0) && (view.sqpanel.getCpupiece1().getX() + 50 < 450)) && ((r == 1) && (view.sqpanel.getCpupiece1().getX() - 50 > 0)) && ((r == 3) && (view.sqpanel.getCpupiece2().getY() + 50 > 450)) && ((r == 2) && (view.sqpanel.getCpupiece2().getY() - 50 > 0))){ 
				r = random.nextInt(4);
			}
			if (r == 3) {
			view.sqpanel.MoveDown( view.sqpanel.getCpupiece1());
			} else if (r == 2 ) {
				view.sqpanel.MoveUp( view.sqpanel.getCpupiece1());
			}
			else if (r == 1 ) {
				view.sqpanel.MoveLeft( view.sqpanel.getCpupiece1());
			}else if (r == 0 ) {
				view.sqpanel.MoveRight( view.sqpanel.getCpupiece1());
			}
		}	
	
		if (e.getSource() == view.getTimer3()) {
			r = random.nextInt(4);
			while (((r == 0) && (view.sqpanel.getCpupiece3().getX() + 50 < 450)) && ((r == 1) && (view.sqpanel.getCpupiece3().getX() - 50 > 0)) && ((r == 3) && (view.sqpanel.getCpupiece2().getY() + 50 > 450)) && ((r == 2) && (view.sqpanel.getCpupiece2().getY() - 50 > 0))){ 
				r = random.nextInt(4);
			}
			if (r == 3) {
			view.sqpanel.MoveDown( view.sqpanel.getCpupiece3());
			} else if (r == 2 ) {
				view.sqpanel.MoveUp( view.sqpanel.getCpupiece3());
			}
			else if (r == 1 ) {
				view.sqpanel.MoveLeft( view.sqpanel.getCpupiece3());
			}else if (r == 0 ) {
				view.sqpanel.MoveRight( view.sqpanel.getCpupiece3());
			}
		}	
		
		
	if (e.getSource() == view.getTimer1()) {
			r = random.nextInt(4);
			while (((r == 0) && (view.sqpanel.getCpupiece2().getX() + 50 < 450)) && ((r == 1) && (view.sqpanel.getCpupiece2().getX() - 50 > 0)) && ((r == 3) && (view.sqpanel.getCpupiece2().getY() + 50 > 450)) && ((r == 2) && (view.sqpanel.getCpupiece2().getY() - 50 > 0))){ 
				r = random.nextInt(4);
			}
			if (r == 3) {
			view.sqpanel.MoveDown( view.sqpanel.getCpupiece2());
			} else if (r == 2 ) {
				view.sqpanel.MoveUp( view.sqpanel.getCpupiece2());
			}
			else if (r == 1 ) {
				view.sqpanel.MoveLeft( view.sqpanel.getCpupiece2());
			}else if (r == 0 ) {
				view.sqpanel.MoveRight( view.sqpanel.getCpupiece2());
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		if (e.getSource() == view.getButtons().getMoveup()) {
			view.sqpanel.MoveUp(view.sqpanel.getPlayerpiece());
		}
		
		if (e.getSource() == view.getButtons().getMovedown()) {
			view.sqpanel.MoveDown( view.sqpanel.getPlayerpiece() );
		}
		if (e.getSource() == view.getButtons().getMoveleft()) {
			view.sqpanel.MoveLeft( view.sqpanel.getPlayerpiece());
		}
		if (e.getSource() == view.getButtons().getMoveright()) {
			view.sqpanel.MoveRight( view.sqpanel.getPlayerpiece());
		}
		
	}
	
}
