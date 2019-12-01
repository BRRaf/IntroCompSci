import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener{
	private Model myModel;
	private View myView;
	
	public Controller(){
		myModel = new Model(this);
		myView = new View(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		//Check to see if the source of the button click is the right button
		
		if(arg0.getSource()==myView.getButtonPanel().getRightButton()){
			myModel.increaseX(10);
		}
		
		if(arg0.getSource()==myView.getButtonPanel().getLeftButton()){
			myModel.increaseX(-10);
		}
		
		if(arg0.getSource()==myView.getButtonPanel().getUpButton()){
			myModel.increaseY(-10);
		}
		
		//Check to see if the source of the button click is the down button
		if(arg0.getSource()==myView.getButtonPanel().getDownButton()){
			myModel.sincreaseY(10);
		}
		myView.updateCirclePostion(myModel.getXValue(), myModel.getYValue());
		
		if(arg0.getSource()==myView.getButtonPanel().sRightButton()){
			myModel.sincreasesX(10);
		}
		
		if(arg0.getSource()==myView.getButtonPanel().sLeftButton()){
			myModel.sincreasesX(-10);
		}
		
		if(arg0.getSource()==myView.getButtonPanel().sUpButton()){
			myModel.sincreaseY(-10);
		}
		
		if(arg0.getSource()==myView.getButtonPanel().sDownButton()){
			myModel.sincreaseY(10);
		}
		
	}

}