package Semon;

public class RunnableForFlashes implements Runnable {

	
	
	
	boolean loop = true;
	boolean finish = true;
	
	int i = 0;
	
	
	@Override
	public void run() {
		
		while(loop)
			while(finish){
				
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					System.out.println("penis");
					e.printStackTrace();
				}
				
				SimonGUI.GREENFLASH.setVisible(false);
				SimonGUI.REDFLASH.setVisible(false);
				SimonGUI.YELLOWFLASH.setVisible(false);
				SimonGUI.BLUEFLASH.setVisible(false);
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println("penis");
					e.printStackTrace();
				}
				
				
				if(SimonGUI.Key.get(i)==0){
					SimonGUI.GREENFLASH.setVisible(true);
				}
				else if(SimonGUI.Key.get(i)==1){
					SimonGUI.REDFLASH.setVisible(true);
				}
                else if(SimonGUI.Key.get(i)==2){
                	SimonGUI.YELLOWFLASH.setVisible(true);
				}
                else if(SimonGUI.Key.get(i)==3){
                	SimonGUI.BLUEFLASH.setVisible(true);
                }
                else{
                	SimonGUI.GREENFLASH.setVisible(false);
    				SimonGUI.REDFLASH.setVisible(false);
    				SimonGUI.YELLOWFLASH.setVisible(false);
    				SimonGUI.BLUEFLASH.setVisible(false);
                }
				
				i++;
				
				if(i == SimonGUI.Key.size()+1)
					finish = false;
				
			}
		
	}

}
