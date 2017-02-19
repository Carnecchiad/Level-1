package Package;
import java.util.Random;
import javax.swing.JOptionPane;
public class Lottery {
	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog("enter a number between 1 and 80");
		int ans = Integer.parseInt(answer);
		int encounter = 0;
		if(ans > 80 || ans < 1){
			System.out.println("are you serious?");
		}
		Random random = new Random();
		for(int i = 0; i < 1000000; i++){
			int x = random.nextInt(80) +1;
			if(x == ans){
				encounter++;
			}
		}
		System.out.println(encounter);
	}
	
}
