package Package;
public class Dog {
	
	int numTeeth;
	String name;
	boolean hair;
	
	void nameDog(String name){
		this.name = name;
	}
	void setTeeth(int numTeeth){
		this.numTeeth = numTeeth;
	}
	void setHair(boolean hair){
		this.hair = hair;
	}
	void talkAboutDog(){
		System.out.println("Your dog's name is " + name + " it has " + numTeeth + " teeth, does it have hair: " + hair );
	}
	
	public Dog(){
		
	}
}

