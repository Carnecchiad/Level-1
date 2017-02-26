package Package;

import static org.junit.Assert.*;

import org.junit.Test;
import org.omg.Messaging.SyncScopeHelper;

public class introToTests {

	@Test
	public void test() {
		assertEquals(7,add(3,4));
		assertEquals("Hi bob",giveGreeting("bob"));
		assertEquals("hi bob!!!",scream("bob"));
		assertTrue(isWeekend("Saturday"));
		assertFalse(isWeekend("Tuesday"));
		assertEquals("A",getGrade(95));
		assertEquals("B",getGrade(85));
		assertEquals("C",getGrade(75));
		assertEquals("D",getGrade(65));
		assertEquals("F",getGrade(55));
		assertEquals("stuffstuffstuff",repeatString("stuff",3));
		assertEquals("stuff-stuff-stuff",repeatStringWithSeparator("stuff",3,"-"));
	}
	int add(int x, int y){
		return x + y;
	}
	String giveGreeting(String s){
		return "Hi " + s;
	}
	String scream(String s){
		return "hi " + s + "!!!";
	}
	boolean isWeekend(String day){
		if(day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday")){
			return true;
		}
		return false;
	}
	String getGrade(int grade){
		if(grade >89){
			return("A");
		}
		if(grade > 79 && grade < 89){
			return("B");
		}
		if(grade > 69 && grade < 79){
			return("C");
		}
		if(grade > 59 && grade < 69){
			return("D");
		}
		if(grade < 59){
			return("F");
		}
		return("Error");
	}
	String repeatString(String s, int num){
		String fin = "";
		for(int i = 0; i < num; i++){
			fin += s;
		}
		return(fin);
	}
	String repeatStringWithSeparator(String s, int num, String sep){
		String fin = "";
		for (int i = 0; i < num-1; i++) {
			fin+=s;
			fin+=sep;
		}
		fin+=s;
		return(fin);
	}
	
	}

