//Benjamin Longwell
//11-9-18
//Clock.java
//class that represents a clock, given hour minutes and seconds and performs calculations accordingly
package clock;

public class Clock {
	//instance variables
	
	private int hour;
	private int minute;
	private int second;
	
	Clock(){
		hour =1;
		minute = 0;
		second =0;
	}
	
	//getters
	public int getHour() {
		return hour;
	}
	public int getMinute() {
		return minute;
	}
	public int getSecond() {
		return second;
	}
	
	//setters
	public void setSecond(int mySecond) {
		if(mySecond < 60)
			second = mySecond;
	}
	public void setMinute(int myMinute) {
		if(myMinute < 60)
				minute = myMinute;
	}
	public void setHour(int myHour) {
		if(myHour <= 12)
			hour = myHour;
	}
	
	//tick
	public void tick() {
		second++;
		if(second == 60) {
			second = 0;
			minute++;
		}
		if(minute == 60) {
			minute = 0;
			hour++;
		}
		if(hour == 13) {
			hour = 0;		
		}
		
	}//of tick
	
	public String toString() {
		String S;
		S= String.format("%02d:%02d:%02d",hour,minute,second);
		return S;
	}// of toString
	
	public boolean equals(Clock myClock) {
		if((this.getHour() == myClock.getHour()) && (this.getMinute() == myClock.getMinute()) && (this.getSecond() == myClock.getSecond())) {
			return true;
		}
		return false;
	}//of myClock
}
