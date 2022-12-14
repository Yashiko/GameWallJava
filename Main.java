package Canvas;

import java.awt.*;
import java.awt.event.*;



public class Main implements KeyListener {
	Frame f;
	Canvas c;
	Image img;
	Label l;
	public Main() {

		f = new Frame("Canvas Example");
		l = new Label("GameWall");
		
		//Closing Frame Window
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
		 
		f.add(new myCanvas()); //adding canvas to frame
		f.setSize(1000, 600);
		f.setLayout(null);
		f.setVisible(true);
		f.setTitle("GameWall");
		f.addKeyListener(this);	//add KeyListener to a frame
		///l.setSize(100, 100);
		//l.setLocation(100,100);

		//l.setVisible(true);
	}
	
		class myCanvas extends Canvas{
		String Picture = "D:\\human.png";
		
		Image img;
		public myCanvas() {
			setBackground(Color.GREEN);
			setBounds(100,10, 800,400);	
		}
		
		public void paint(Graphics g) {
			int x;
			int y;
			// add Image
		 	Toolkit t=Toolkit.getDefaultToolkit();  //iskvieciau toolkit cass metoda, butina pries darant
	        img = t.getImage(Picture);  
	    
	        g.drawImage(img, 5,100,this);
	       // img.setSize(1000,1000);
		}
		
	}
	
	// controlling girl moves	
		 public void movingImage(int x, int y) {
			 
		 }
		
		public void keyPressed(KeyEvent e ) {
			
			switch(e.getKeyCode()) {
			case KeyEvent.VK_DOWN:
				
				f.setTitle("Gasascascsd");
				break; 
			case KeyEvent.VK_UP:
				//f.setTitle("Gasascascsd");
			
				break;
			case KeyEvent.VK_LEFT:
				//f.setTitle("Gasascascsd");
			
				break;
			case KeyEvent.VK_RIGHT:
				//f.setTitle("Gasascascsd");
			
				break;
			default:
	            System.out.println("NOT WORKING");
	            break;
			}
		}
	

	
	public static void main(String[] args) {
		new Main();
		
     
	;
		
	}

}
