package Package;

import java.util.Random;
import javax.swing.JOptionPane;

public class AnotherLottery {
	public static void main(String[] args) {
		//
		 int times = 0;
		//
	 Random random = new Random();
		// for(int i = 0; i < 1000000; i++){
		// int y = random.nextInt(80) + 1;
		// int x = random.nextInt(80) +1;
		// if(y == x){
		// encounter++;
		// }
		// }
		// System.out.println(encounter);
//		int[] r = { 2, 3, 3, 36, 6 };
//		
//			if (contains(4, r)) {
//				System.out.println("hi");
//			}
//			
		int array[] = new int[6];
	for (int i = 0; i < 6; i++) {
		String s = JOptionPane.showInputDialog("pick a number");
		array[i] = Integer.parseInt(s);
	}
		int randArray[] = new int[6];
	
		
		
	while(!jones(array,randArray)){	
	for (int i = 0; i < 6; i++) {
		randArray[i] = random.nextInt(80);
	}
	times++;
	
	
	}
	
	
	if(jones(array,randArray)){
	System.out.println(times);
	}
	}
	protected static boolean contains(int i, int[] array) {
		for (int x = 0; x < array.length; x++) {
			if (i == array[x]) {
				return true;

			}
		}
		return false;
	}


protected static boolean jones(int[] array2, int[] array) {
	for (int i = 0; i < array.length; i++) {
		if(!contains(array2[i],array)){
			return false;
		}
	}
	return true;
}
}