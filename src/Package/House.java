package Package;
import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;
public class House {
	
 int height;
 int roofWidth;
 int grassWidth;
 String color;

 

 
 

	void draw(Robot r){
		
		if(color.equalsIgnoreCase("RED")){
			r.setPenColor(Color.RED);
		}
		r.penDown();
		r.setSpeed(10);
		r.move(height);
		r.turn(90);
		r.move(roofWidth);
		r.turn(90);
		r.move(height);
		r.turn(-90);
		r.move(grassWidth);
		r.turn(-90);
	}
	
	public House(int height, int roofWidth, int grassWidth,String color){
		
		this.color = color;
		this.height = height;
		this.roofWidth = roofWidth;
		this.grassWidth = grassWidth;
	}
	
	
	public static void main(String[] args) {
		Random rand = new Random();
		House[] houses = new House[10];
		for(int i = 0; i<10; i++){
			houses[i] = new House(rand.nextInt(100),rand.nextInt(100),rand.nextInt(100),"RED");
		}
		Robot r = new Robot("vic");
		r.moveTo(50, 550);
		for(int i = 0; i < 10; i++){
			houses[i].draw(r);
		}
		
	}
}
