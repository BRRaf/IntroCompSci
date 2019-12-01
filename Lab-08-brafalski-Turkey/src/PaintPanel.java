import java.awt.Graphics;
import java.net.URL;
import javax.sound.sampled.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Random;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;
import javax.imageio.ImageIO;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import java.io.File;
import java.io.IOException;


public class PaintPanel extends JPanel implements ActionListener, MouseListener{

	private BufferedImage background;
	private BufferedImage turkey;
	
	private ArrayList<Turkey> turkeylist;
	private int randomcorner;
	private Random rand;
	private Turkey turk;
	private int mouseY;
	private int mouseX;
	private Clip clip;
	
	
	
	public PaintPanel() {
		try {
			background = ImageIO.read(new File("Thanksgiving.jpg"));
			turkey = ImageIO.read(new File("Turkey.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		turkeylist = new ArrayList<Turkey>();
		 randomcorner = 0;
		 rand = new Random();
		 addMouseListener(this);
		 
		 try {
	         // Open an audio input stream.           
	          File soundFile = new File("Turkey.aif"); //you could also get the sound file with an URL
	          AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);              
	         // Get a sound clip resource.
	          clip = AudioSystem.getClip();
	         // Open audio clip and load samples from the audio input stream.
	         clip.open(audioIn);
	         
	         
	        
	         
	      } catch (UnsupportedAudioFileException e) {
	         e.printStackTrace();
	      } catch (IOException e) {
	         e.printStackTrace();
	      } catch (LineUnavailableException e) {
	         e.printStackTrace();
	      }
		
	}
	
	public void paintComponent(Graphics page) {
		super.paintComponent(page);
		
        page.drawImage(background, 0, 0, null);
        
        for (int i = 0; i < turkeylist.size(); i++) {
        
        	page.drawImage(turkeylist.get(i).getTurkey(), turkeylist.get(i).getX(), turkeylist.get(i).getY(), null);
        }

        
	}
	
	public void paintTurkey(Graphics page) {
		super.paintComponent(page);
		page.drawImage(turkey, 0, 0, null);
	}
	
	public BufferedImage getaBackground() {
		return background;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
		 clip.stop(); 
    	 clip.setMicrosecondPosition(0);
    	 clip.start();
		
		randomcorner = rand.nextInt(4);
		System.out.println(randomcorner);
		if (randomcorner == 0) {
			turk = new Turkey(0,0,0);
			turk.setEndx(e.getX());
			turk.setEndy(e.getY());
			turkeylist.add(turk);
			
		}
		else if (randomcorner == 1) {
			turk = new Turkey(650, 0, 1);
			turk.setEndx(e.getX());
			turk.setEndy(e.getY());
			turkeylist.add(turk);
			
		} else if (randomcorner == 2) {
			turk = new Turkey(650, 550, 2);
			turk.setEndx(e.getX());
			turk.setEndy(e.getY());
			turkeylist.add(turk);
		} else if (randomcorner == 3) {
			turk = new Turkey(0, 550, 3);
			turk.setEndx(e.getX());
			turk.setEndy(e.getY());
			turkeylist.add(turk);
		}
		
		
		repaint();
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
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		for (int i = 0; i < turkeylist.size(); i++) {
			turkeylist.get(i).animate();
			repaint();
		}
		
	}
}
