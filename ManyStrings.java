//CS 172
//ManyStrings.java
//Section 2 Lab
//Written By: Benjamin Longwell
//9/11/2018
//Performs different operations on strings
//Input: Strings from Scanner
//Output: Different verisons of strings
import java.util.Scanner;
class ManyStrings{
   public static void main(String[] args){
   Scanner scan = new Scanner(System.in);
   String input, input2;
   
   System.out.println("Give me a string.");
   input = scan.nextLine();
   input = input.trim();
   
   System.out.println("The length of your sting is " + input.length());
   System.out.println("The first word is \"" + input.substring(0, input.indexOf(" "))+"\"");
   System.out.println("The uppercase version is:" + input.toUpperCase());
   
   System.out.println("Give me another string.");
   input2 = scan.nextLine();
   
   input2 = input2.replace(" " , "");
   System.out.println(input2.substring(0, input2.length() / 2));
   System.out.println(input2.replace('e','a'));
   System.out.println(input2.charAt(input2.length() -1));
   
   if(input2.indexOf('m') == -1) {
      System.out.println("String has no m");
      }//of if
   else {
      System.out.println("String has m");
      }//of else
      
   System.out.println(input2.replace("o", ""));
   
   if(input2.length() % 2 == 1){
      System.out.println("length of string is odd");
      }//of if
   else {
      System.out.println("length of string is even");
      }//of else
      
   
   }//of main
}//of class