import java.awt.Dimension;

import java.io.*;
import java.net.URL;
import javax.sound.sampled.*;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

// To play sound using Clip, the process need to be alive.
// Hence, we use a Swing application.
public class Starter extends JFrame {
	
	
   // Constructor
   public Starter() {
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setTitle("Image Town");
      this.setSize(800, 600);
      this.setVisible(true);
      JPanel mainPanel = new PaintPanel();
      mainPanel.setPreferredSize((new Dimension(800,600)));
      this.getContentPane().add(mainPanel);
      this.pack();
		
      this.setVisible(true);
   }

   public static void main(String[] args) {
     
   }
}