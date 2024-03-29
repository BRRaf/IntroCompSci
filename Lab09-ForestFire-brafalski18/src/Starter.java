import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

/*Created by Ben Rafalski, this program creates a randomly generated series of different colored squares. 
* When the green squares are clicked on, they will simulate a 'fire' by turning all nearby green squares 
* red and then grey
*
*/

public class Starter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Forest Fire");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ForestPanel forest = new ForestPanel();
		forest.setPreferredSize(new Dimension(1024,768));
		
		frame.getContentPane().add(forest);
		
		frame.pack();
		frame.setVisible(true);
		
		
		
		
		Timer t = new Timer(1000, forest);
	}

}
