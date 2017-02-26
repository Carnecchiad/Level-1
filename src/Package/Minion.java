package Package;

public class Minion {
	private String name; 
	private int eyes; 
	private String color; 
	private String master;
	Minion(String name, int eyes, String color,String master){
		this.name = name;
		this.eyes = eyes;
		this.color = color;
		
		
	}
	String getMaster(){
		return master ;
	}
	String getColor(){
		return color;
	}
	String getName(){
		return name;
	}
	int getEyes(){
		return eyes;
	}
	void setMaster(String m){
		this.master = m;
	}
}
