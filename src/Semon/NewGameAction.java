package Semon;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewGameAction implements ActionListener {

	
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		Thread t = new Thread( new RunnableForFlashes());
		
		int AmountOfRandos = 4 + SimonGUI.level;
		
		SimonGUI.Key.clear();
		SimonGUI.User.clear();
		
		String levelStringTwo = "" +SimonGUI.level;
		SimonGUI.label.setText(levelStringTwo);
		
		for(int i = 0; i<AmountOfRandos; i++){
			
			SimonGUI.Key.add((int) ((int)4*Math.random()));
			
		}
		
		t.start();
		System.out.println(SimonGUI.Key);
	}

	
	
	
}
