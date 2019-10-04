//Benjamin Longwell
//CS 172
//Program2.java
//Aug. 28th 2018
//Print the volume of a cylinder given height and diameter
public class Program2{
   public static void main(String[] args){
      
      double height, diameter, volume;
      height = 2.0;
      diameter = 1.0;
      
      volume = ((Math.PI) * (diameter / 2) * (diameter / 2) * (height));
      
      System.out.println("The height is " + height + "and the diameter is " + diameter + ".");
      System.out.println("The volume is " + volume + "."); 
      
   }//of main
   
}//of class