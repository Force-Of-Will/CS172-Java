//Benjamin Longwell
//11-6-18
//Car.java
//A Class that represents a car.
//works in conjunction with carTest.java
public class Car {	
	private String make;
	private String model;
	private int year;
	//constructor
	Car(String myMake, String myModel, int myYear){
		make = myMake;
		model = myModel;
		year = myYear;
	}
	//getters
	public int getYear() {
		return year;	
	}
	public String getMake() {
		return make;		
	}
	public String getModel() {
		return model;
	}
	//setters
	public void setYear(int myYear) {
		year = myYear;
	}
	public void setMake(String myMake) {
		make = myMake;
	}
	public void setModel(String myModel) {
		model = myModel;
	}
	//toSTring
	public String toString() {
		return("" + year+ " " + make + " " + model);		
	}
		
		
	
}
