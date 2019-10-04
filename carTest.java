//Benjamin Longwell
//11-6-18
//Lab 9
//carTest.java
//Takes in the make model and year of a car and prints it out using methods found in Car.java
public class carTest {
	public static void main(String[] args) {
		Car myCar = new Car("Honda", "Odyssey", 2012);
		Car myCar1 = new Car("Make", "Model", 2000);
		Car myCar2 = new Car("Make2", "Model2", 1990);
		
		//prints the first car
		System.out.println(myCar.toString());
		
		//changes the second car and prints it out
		myCar1.setMake("Toyota");
		myCar1.setYear(2001);
		System.out.println(myCar1.toString());
		
		//changes myCar2 to match myCar using both the accesssors and the mutators
		myCar2.setModel(myCar.getModel());
		myCar2.setMake(myCar.getMake());
		myCar2.setYear(myCar.getYear());
		System.out.println(myCar2.toString());
	}
}
