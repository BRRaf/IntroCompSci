import java.awt.Dimension;

import java.io.*;
import java.net.URL;
import javax.sound.sampled.*;
import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class View {
	JFrame frame;
	JPanel main;
	PaintPanel paint;
	Timer t;
	Controller control;
	
	View(Controller c){
		control = c;
		frame = new JFrame("Turkey Dinner");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		paint = new PaintPanel();
		paint.setPreferredSize(new Dimension(700,600));
		
		frame.getContentPane().add(paint);
		
		frame.pack();
		frame.setVisible(true);
		
		t = new Timer(10, paint );
		t.start();
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Controller control = new Controller();
	}

}
