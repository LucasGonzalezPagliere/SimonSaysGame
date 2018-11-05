package Semon;

import java.awt.Graphics;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class NextTryGUI  {
	
	
	
	public NextTryGUI() throws IOException{
		JFrame frame = new JFrame("Test");
		frame.setSize(500,500);
		frame.setUndecorated(true);
	    frame.setContentPane(new JPanel() {
	        BufferedImage image = ImageIO.read(getClass().getResource("exmpsimon.png"));
	        public void paintComponent(Graphics g) {
	            super.paintComponent(g);
	            g.drawImage(image, 25, 22, 450, 452, this);
	        }
	    });
	    Shape shape = new Ellipse2D.Double(25,22,450,452);
	   // frame.setShape(shape);

	    frame.add(new JButton("Test Button"));

	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setSize(300, 300);
	    frame.setVisible(true);
	}
	}


