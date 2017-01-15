package Package;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JFrame;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.IO;

public class WindowThing implements KeyListener{
	Scanner s = new Scanner(System.in);
	boolean b = false;
	Random rand = new Random();
	JFrame window = new JFrame();
		public static void main(String[] args) {
			WindowThing w = new WindowThing();
			
			w.run();
			
		
		
		}
		void run(){
			
			window.setSize(400, 400);
			window.addKeyListener(this);
			window.setDefaultCloseOperation(window.EXIT_ON_CLOSE);
			window.setVisible(b);
			while(true){
				String x = s.next();
				System.out.println("While Loop");
				if(x.equals("p")){
					if(!window.isVisible()){
						window.setVisible(true);
						System.out.println("isVisible");
					}
					else if(window.isVisible()){
						window.setVisible(false);
					}
				}
				System.out.println("equals p");
			}
		}
		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void keyPressed(KeyEvent e) {
			if(e.getKeyCode() == KeyEvent.VK_ENTER){
				window.setSize(rand.nextInt(3000), 0);
			}
			if(e.getKeyCode() == KeyEvent.VK_SPACE){
				
				
			
				
			}
		}
		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		
}
