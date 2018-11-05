package Semon;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.SwingConstants;
import javax.swing.SpringLayout;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SimonGUI {
	
	public static ArrayList<Integer> Key = new ArrayList<Integer>();
	public static ArrayList<Integer> User = new ArrayList<Integer>();
	
	JFrame frame;
	private JButton NewButton;
	private JButton Close;
	public static JLabel label;
	public static int level = 0;
	private JButton btnGreen;
	private JButton btnRed;
	private JButton btnYellow;
	private JButton btnBlue;
	  public static String levelString = "" + level;
	  public static JLabel GREENFLASH;
	  public static JLabel REDFLASH;
	  public static JLabel YELLOWFLASH;
	  public static JLabel BLUEFLASH;
	  String topscorer = "none";
	  int topscore =0;
	  private JButton scores;
	public SimonGUI(){
			
			
	
		frame = new JFrame("Simon Says");
		//frame.getContentPane().setEnabled(false);
		frame.setBounds(500, 200, 500, 500);
		frame.setSize(500,500);
		frame.setAlwaysOnTop(false);
		frame.setUndecorated(true);
		frame.setResizable(false);
	
        //frame.getContentPane().setLayout(null);
        
		
		
		
		
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    //frame.setUndecorated(true);
		
		Shape shape = new Ellipse2D.Double(25,22,450,452);
		 frame.getContentPane().setLayout(null);
		 
		 
		 //CLOSE BUTTON
		 Close = new JButton("");
		 Close.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent arg0) {
		 		frame.dispose();
		 	}
		 });
		 Close.setBounds(279, 244, 49, 38);
		 
		 Close.setOpaque(false);
		 Close.setContentAreaFilled(false);
		 Close.setBorderPainted(false);
		 frame.getContentPane().add(Close);
		     
		     
		     
		     //NEW GAME BUTTON
		     NewButton = new JButton("");
		     NewButton.addActionListener(new NewGameAction());
		     NewButton.setBounds(171, 244, 49, 38);
		     frame.getContentPane().add(NewButton);
		     NewButton.setOpaque(false);
		     NewButton.setContentAreaFilled(false);
		     NewButton.setBorderPainted(false);
		     
		     
		     
		     //LEVEL LABEL
		   
		     
		     
		     //GREEN (0)
		     btnGreen = new JButton("");
		     btnGreen.addMouseListener(new MouseAdapter() {
		     	@Override
		     	public void mousePressed(MouseEvent arg0) {
		     		GREENFLASH.setVisible(true);
		     	}
		     	@Override
		     	public void mouseReleased(MouseEvent arg0) {
		     		GREENFLASH.setVisible(false);
		     	}
		     });
		     btnGreen.addActionListener(new ActionListener() {
		     	public void actionPerformed(ActionEvent arg0) {
		     		User.add(0);
		     		if(User.size()==Key.size())
		     			GameRun();
		     	}
		     });
		     btnGreen.setBounds(48, 22, 183, 211);
		     frame.getContentPane().add(btnGreen);
		     btnGreen.setOpaque(false);
		     btnGreen.setContentAreaFilled(false);
		     btnGreen.setBorderPainted(false);
		     
		     //RED(1)
		     btnRed = new JButton("");
		     btnRed.addMouseListener(new MouseAdapter() {
		     	@Override
		     	public void mousePressed(MouseEvent arg0) {
		     		REDFLASH.setVisible(true);
		     	}
		     	@Override
		     	public void mouseReleased(MouseEvent arg0) {
		     		REDFLASH.setVisible(false);
		     	}
		     });
		     btnRed.addActionListener(new ActionListener() {
		     	public void actionPerformed(ActionEvent arg0) {
		     		User.add(1);
		     		if(User.size()==Key.size())
		     			GameRun();

		     	}
		     });
		     btnRed.setBounds(279, 51, 211, 171);
		     frame.getContentPane().add(btnRed);
		     btnRed.setOpaque(false);
		     btnRed.setContentAreaFilled(false);
		     btnRed.setBorderPainted(false);
		     
		     
		     //YELLOW(2)
		     btnYellow = new JButton("");
		     btnYellow.addMouseListener(new MouseAdapter() {
		     	@Override
		     	public void mousePressed(MouseEvent arg0) {
		     		YELLOWFLASH.setVisible(true);
		     	}
		     	@Override
		     	public void mouseReleased(MouseEvent arg0) {
		     		YELLOWFLASH.setVisible(false);
		     	}
		     });
		     btnYellow.addActionListener(new ActionListener() {
		     	public void actionPerformed(ActionEvent arg0) {
		     		User.add(2);
		     		if(User.size()==Key.size())
		     			GameRun();

		     	}
		     });
		     
		     scores = new JButton("");
		     scores.addActionListener(new ActionListener() {
		     	public void actionPerformed(ActionEvent arg0) {
		     		JOptionPane.showMessageDialog(null, "Top Score: " + topscorer  + " " + topscore + "\n" + "Credits:" + "\n" + "Game Made By Lucas Gonzalez." + "\n" +  "Simon Says Game invented by whoever the hell invented it");
		     	}
		     });
		     scores.setBounds(230, 226, 39, 56);
		     scores.setOpaque(false);
		     scores.setContentAreaFilled(false);
		     scores.setBorderPainted(false);
		     frame.getContentPane().add(scores);
		     btnYellow.setBounds(48, 287, 172, 187);
		     frame.getContentPane().add(btnYellow);
		     btnYellow.setOpaque(false);
		     btnYellow.setContentAreaFilled(false);
		     btnYellow.setBorderPainted(false);
		     
		     //BLUE(3)
		     btnBlue = new JButton("");
		     btnBlue.addMouseListener(new MouseAdapter() {
		     	@Override
		     	public void mousePressed(MouseEvent arg0) {
		     	BLUEFLASH.setVisible(true);
		     	}
		     	@Override
		     	public void mouseReleased(MouseEvent arg0) {
		     		BLUEFLASH.setVisible(false);
		     	}
		     });
		     btnBlue.addActionListener(new ActionListener() {
		     	public void actionPerformed(ActionEvent arg0) {
		     		User.add(3);
		     		if(User.size()==Key.size())
		     			GameRun();

		     	}
		     });
		     btnBlue.setBounds(279, 287, 176, 175);
		     btnBlue.setOpaque(false);
		     btnBlue.setContentAreaFilled(false);
		     btnBlue.setBorderPainted(false);
		     
		     
		     
		     
		     frame.getContentPane().add(btnBlue);
		     
		     GREENFLASH = new JLabel("New label");
		     GREENFLASH.setIcon(new ImageIcon(SimonGUI.class.getResource("/Semon/SIMONLIGHTGreen.png")));
		     GREENFLASH.setBounds(84, 102, 105, 86);
		     GREENFLASH.setVisible(false);
		     frame.getContentPane().add(GREENFLASH);
		     
		     REDFLASH = new JLabel("New label");
		     REDFLASH.setIcon(new ImageIcon(SimonGUI.class.getResource("/Semon/SIMONLIGHTRed.png")));
		     REDFLASH.setBounds(315, 99, 105, 92);
		     REDFLASH.setVisible(false);
		     frame.getContentPane().add(REDFLASH);
		     
		     YELLOWFLASH = new JLabel("New label");
		     YELLOWFLASH.setIcon(new ImageIcon(SimonGUI.class.getResource("/Semon/SIMONLIGHTYellow.png")));
		     YELLOWFLASH.setBounds(95, 316, 94, 86);
		     YELLOWFLASH.setVisible(false);
		     frame.getContentPane().add(YELLOWFLASH);
		     
		     BLUEFLASH = new JLabel("New label");
		     BLUEFLASH.setIcon(new ImageIcon(SimonGUI.class.getResource("/Semon/SIMONLIGHTBlue.png")));
		     BLUEFLASH.setBounds(315, 320, 105, 79);
		     BLUEFLASH.setVisible(false);
		     
		     
		     frame.getContentPane().add(BLUEFLASH);
		     label = new JLabel(levelString);
		     label.setForeground(Color.white);
		     label.setVerticalAlignment(SwingConstants.BOTTOM);
		     label.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		     label.setHorizontalAlignment(SwingConstants.RIGHT);
		     label.setBounds(219, 287, 57, 20);
		     frame.getContentPane().add(label);
		    
		    
		    
		    
		    
		     JLabel contentPane_1 = new JLabel();
		     contentPane_1.setBounds(10, 11, 480, 478);
		     contentPane_1.setHorizontalAlignment(0);
		     contentPane_1.setIcon(new ImageIcon(SimonGUI.class.getResource("/Pic/exmpsimon.png")));
		     contentPane_1.setLayout(new SpringLayout());
		     frame.getContentPane().add(contentPane_1);

		
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		
     frame.setShape(shape);
        
	
	//frame.setLocationRelativeTo(null);
	
	
	
	frame.setVisible(true);
		
	}
	public void GameRun(){
		boolean DidYouWin = true;
		level++;
		
		for(int i =0; i<Key.size(); i++){
			if(Key.get(i) != User.get(i)){
				
				if(level>topscore){
				topscore = level;
				topscorer = JOptionPane.showInputDialog("Insert your username: ");
				
				
				i = Key.size();
				DidYouWin = false;
				int randomMessage =  (int) ((int)5*Math.random());
				
				if(randomMessage == 0){
					JOptionPane.showMessageDialog(null,"You Lose! Learn your colors!" + "\n" +  "Score: " + level);
				}
				else if(randomMessage == 1){
					JOptionPane.showMessageDialog(null,"It was yellow moron!! You Lose!!" + "\n" +"Score: " + level);
				}
				else if(randomMessage == 2){
					JOptionPane.showMessageDialog(null,"Nice try, but you did pretty terrible!" + "\n" +"Score: " + level);
				}
				else if(randomMessage == 3){
					JOptionPane.showMessageDialog(null,"So close, yet so so far. You'll never get past level 5" + "\n" +"Score: " + level);
				}
				else if(randomMessage == 4){
					JOptionPane.showMessageDialog(null,"My grandma can get farther than that" + "\n" +"Score: " + level);
				}
			}
		}
		
		}
	   if(DidYouWin){
		   JOptionPane.showMessageDialog(null,"Hit 'New' to continue" + "\n" + "Level:" + level);
	   }
		}
 	}
    
