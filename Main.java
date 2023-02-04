package apps;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.*;


public class GameWall implements KeyListener {
	JFrame f;
	JLabel PlayerName,labelTimer, displayLabel, labelLog1, labelLog2, labelLog3;
	int x, x1, x2, x3;
	int y, y1, y2, y3;
	int finish;
	String name;
	int action;
	Timer timer;
	TimerTask task;
	GameWall(){
		f = new JFrame();
		f.setTitle("Game Wall");
		f.setBounds(100, 100, 1500, 800);
		f.setVisible(true);
		f.setLayout(null);
		f.add(new myCanvas());
		f.addKeyListener(this);	//add KeyListener to a frame

	   name=JOptionPane.showInputDialog(f,"Enter Name", JOptionPane.OK_CANCEL_OPTION);      
	    PlayerName = new JLabel();
	    PlayerName.setBounds(100,10,260,100);
	    PlayerName.setText("Player name: "+name);

		f.add(PlayerName);
		labelTimer = new JLabel();
		labelTimer.setBounds(300,10,260,100);
		f.add(labelTimer);
		
		timer = new Timer();
		task = new TimerTask() {
			int i = 20;
			public void run() {
				if (i >0) {
					System.out.println(i);
					i--;
					labelTimer.setText("Time: "+i);
					if (i ==0) {
						JOptionPane.showMessageDialog(f,"Game over");
					}
				}	
			}
		};
		timer.scheduleAtFixedRate(task, 0, 1000); 
		// LogsAnimation();
	}

	
    
	class myCanvas extends Canvas{

		public myCanvas() {
			x = 130;y= 350;x1= 500;y1= 80;x2= 700;y2= 80;x3= 1000;y3= 400;
			ImageIcon img = new ImageIcon("D:\\human.png");//create an image icon
			 f.setIconImage(img.getImage());
			 displayLabel = new JLabel("", img, JLabel.CENTER);
			 displayLabel.setBounds(x,y,60,100);
			 f.add(displayLabel);
			setBackground(Color.green);
			setBounds(100,80, 1350,650);
			
			
			ImageIcon imgLog = new ImageIcon("D:\\log.jpg");//create an image icon
			 f.setIconImage(imgLog.getImage());
			labelLog1 = new JLabel("", imgLog, JLabel.CENTER);
			labelLog1.setBounds(x1,y1,60,200);
			f.add(labelLog1);
			
			 ImageIcon imgLog2 = new ImageIcon("D:\\log.jpg");//create an image icon
			 f.setIconImage(imgLog2.getImage());
			labelLog2 = new JLabel("", imgLog2, JLabel.CENTER);
			labelLog2.setBounds(x2,y2,60,200);
			 f.add(labelLog2);
			 
			 ImageIcon imgLog3 = new ImageIcon("D:\\log.jpg");//create an image icon
			 f.setIconImage(imgLog2.getImage());
			labelLog3 = new JLabel("", imgLog3, JLabel.CENTER);
			labelLog3.setBounds(x3,y3,60,200);
			 f.add(labelLog3);
		}

	}
	

	 public void LogsAnimation() {
		
			for(y1 = 80; y1 <= 500; y1+=1) {
				if (y1 == 500) {
					 y1 = 80;
				 }
				labelLog1.setBounds(x1,y1,60,200);

				 
			};
			
			for(y2 = 80; y2 <= 500; y2+=1) {
				if (y2 == 500) {
					 y2 = 80;
				 }
				labelLog2.setBounds(x2,y2,60,200);

				 
			};
		}
		
	
	
	
	public void keyPressed(KeyEvent e ) {
		switch(e.getKeyCode()) {
		case KeyEvent.VK_DOWN:
			y +=10;
			 displayLabel.setBounds(x,y,60,100);
			 break;
		case KeyEvent.VK_UP:
			y -=10;
			 displayLabel.setBounds(x,y,60,100);
			 break;
		case KeyEvent.VK_LEFT:
			x -=10;
			 displayLabel.setBounds(x,y,60,100);
			 break;
		case KeyEvent.VK_RIGHT:
			x +=10;
			 displayLabel.setBounds(x,y,60,100);
			 if (x == 1390) {
				    JOptionPane.showMessageDialog(f,"YOU ARE THE WINNER");  
			 }
			break;
		default:
            System.out.println("NOT WORKING");
            break;
		}
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		new GameWall();

	}

}
