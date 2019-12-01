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
      this.setTitle("Test Sound Clip");
      this.setSize(300, 200);
      this.setVisible(true);
      JPanel mainPanel = new JPanel();
      mainPanel.setPreferredSize((new Dimension(300,200)));
      this.getContentPane().add(mainPanel);
      JButton button = new JButton();
      button.setText("Press me");
      mainPanel.add(button);
      
      try {
         // Open an audio input stream.           
          File soundFile = new File("Turkey.aif"); //you could also get the sound file with an URL
          AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);              
         // Get a sound clip resource.
         Clip clip = AudioSystem.getClip();
         // Open audio clip and load samples from the audio input stream.
         clip.open(audioIn);
         
         
         button.addActionListener( e -> {
        	 clip.stop(); 
        	 clip.setMicrosecondPosition(0);
        	 clip.start();

         });
         
      } catch (UnsupportedAudioFileException e) {
         e.printStackTrace();
      } catch (IOException e) {
         e.printStackTrace();
      } catch (LineUnavailableException e) {
         e.printStackTrace();
      }
      this.pack();
		
      this.setVisible(true);
   }

   public static void main(String[] args) {
      new Starter();
   }
}