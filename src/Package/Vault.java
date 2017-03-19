package Package;

import java.util.Random;

public class Vault {
	int code;
	static Random Random = new Random();
	Vault(int x){
		this.code = x;
	} 
	boolean tryCode(int x){
		if(x == this.code){
			return true;
		}
	return false;
	}
	public static void main(String[] args) {
		Vault v = new Vault(Random.nextInt(1000000));
		Bond b = new Bond();
		
		
		System.out.println(b.findCode(v));
	}
}
class Bond{
	
	Bond(){
		
	}
	int findCode(Vault v){
		for(int i = 0; i<1000000; i++){
		if(v.tryCode(i)){
			return i;
		}
		}
		
		return 1-(1*2);
	}
}
