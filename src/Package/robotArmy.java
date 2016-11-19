package Package;
public class robotArmy {
	public static void main(String[] asd){
		//1. create a new human
		Human Dante = new Human("Dante");
		Robot[] r = new Robot[50];
		//2. create a new Robot army of good and evil robots.

		for(int i = 0; i < 50; i++){
			if(i%2 == 0){
				r[i] = new Robot("Robot",true);
			}
			else{
				r[i] = new Robot("Robot",false);
			}
			
		}
		
		//3. command your robot army to destroy a human
		for(int i = 0; i<50;i++){
			r[i].destroy(Dante);
		}
	}
}


/**
 * Human Class
 */
class Human {
	String name;
	boolean isAlive;
	
	public Human(String name){
		this.name = name;
		this.isAlive = true;
	}
	public String getName() {
		return name;
	}
	public void die(){
		isAlive = false;
	}
}


/**
 * Robot Class
 */
class Robot {
	boolean isEvil;
	String name;
	
	public Robot(String name, boolean isEvil){
		this.name = name;
		this.isEvil = isEvil;
	}
	
	public void destroy(Human man){
		if(isEvil){
			System.out.println("Beep Boop Pew! Oh no! the robot " + name + " blasted " + man.getName() + "'s head off!");
			man.die();
		}
		else{
			System.out.println("No!! The robot " + name + " loves " +man.getName());
		}
	}
}


