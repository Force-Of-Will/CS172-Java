//Benjamin Longwell
//11-9-18
//clockTest.java
//performs output based on the Clock class
package clock;

public class clockTest {
	public static void main(String[] args) {
		
		Clock c = new Clock();
		System.out.println(c.toString());
		
		c.tick();
		
		System.out.println(c.toString());
		System.out.println("The hour is: " + c.getHour() + " o'clock");
		
		c.setHour(12);
		c.setMinute(59);
		c.setSecond(59);
		System.out.println("It is currently " + c.toString());
		
		c.tick();
		System.out.println("Now it is " +c.toString());
		
		c.setSecond(41);
		System.out.println("We are " + c.getSecond() + " second(s) into the minute");
		c.setMinute(21);
		System.out.println("We are " + c.getMinute() + " minute(s) into the hour");
		c.setHour(6);
		System.out.println("The hour is: " + c.getHour() + " o'clock.");
		
		Clock c1 = new Clock();
		if (c1.equals(c))
			System.out.println("The times " + c.toString() + " and " + c1.toString() + " are equal.");
		else
			System.out.println("The times " + c.toString() + " and " + c1.toString() + " are NOT equal.");
		
		c1.setMinute(c.getMinute());
		c1.setHour(c.getHour());
		c1.setSecond(c.getSecond());
		
		if (c1.equals(c1))
			System.out.println("The times " + c.toString() + " and " + c1.toString() + " are equal.");
		else
			System.out.println("The times " + c.toString() + " and " + c1.toString() + " are NOT equal.");
		
		
		
	}//of main
}//of class
