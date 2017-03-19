package Package;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;
public class WhackMole implements ActionListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	int score;
	void drawButtons(int r){
		JButton[] button = new JButton[24];
		frame.add(panel);
		frame.setVisible(true);
		for (int i = 0; i < 24; i++) {
			button[i] = new JButton();
			panel.add(button[i]);
			
			button[i].addActionListener(this);
			frame.setSize(300, 400);
		}
		button[r].setText("Mole");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//		frame.pack();
	}
	public static void main(String[] args) {
		Random Random = new Random();
		WhackMole eli = new WhackMole();
		eli.drawButtons(Random.nextInt(24));
	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if(!buttonPressed.getText().equals("Mole")){
			Random Random = new Random();
			speak("Dork");
			frame.removeAll();
			frame = new JFrame();
			drawButtons(Random.nextInt(24));
		}
		if(buttonPressed.getText().equals("Mole")){
			score++;
		}
	}
	void speak(String words) {
		try {
		Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
		e.printStackTrace();
		}
		}
}



