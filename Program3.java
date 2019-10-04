//Benjamin Longwell
//CS 172
//Program3.java
//Aug. 28th 2018
//Print the estimated sales tax and total purchase price of a new fridge
import java.util.*;
public class Program3{
   public static void main(String[] args){
      double price, salesTaxPercent, salesTax, total;
      
      Scanner scan = new Scanner(System.in);
      
      System.out.println("What is the price of the refrigerator?");
      price = (scan.nextDouble())*1.0;
      
      System.out.println("What is sales tax percentage in your state?");
      salesTaxPercent = (scan.nextDouble()*1.0);
      
      salesTax = (price * (salesTaxPercent / 100));
      total = price + salesTax;
      
      System.out.printf("Refrigerator price $%8.2f\n",price);
      System.out.printf("Sales Tax          $%8.2f\n", salesTax);
      System.out.printf("Total              $%8.2f\n", total);
      
      
      
      
            
   }//of main
   
}//of class