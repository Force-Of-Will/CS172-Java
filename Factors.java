//Benjamin Longwell
//9/18/18
//CS172
//Factors.java
//Given a number, prints out all factors of the number
import java.util.*;
class Factors {
   public static void main(String[] args) {
   
      int num;
      
      Scanner scan = new Scanner(System.in);
      
      System.out.println("Enter an integer");
      
      num = scan.nextInt();
      System.out.println("The factors of " + num + " are:");
                         
      for (int x = 1; x <= num; x++)
         if (num % x == 0){
            System.out.print(x + ",");
            }//of if
            
         
         }// end main
}// end class