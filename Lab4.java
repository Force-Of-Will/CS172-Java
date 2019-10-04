//Benjamin Longwell
//9/21/18
//Lab4.java
//Completes a list of problems using different forms of for loops.
import java.util.Scanner;
class Lab4{
   public static void main(String[] args){
   
      //Problem #1- Print all odd number from 1 to 99(inclusive)
      //
      System.out.println("This is problem # 1\n");
      int i;
      for(i = 0; i <=99; i++){
         if((i%2)==1){
         System.out.println(i);
         }
      }//of for
      
      //Problem #2- input number from user
      //write two nested for loops to display a triangle made of asterisks
      //the number the user types determines the number of lines in the triangle
      //if the user typed 5, a right triangle with 5 lines would print
      int j;
      int userNum;
      Scanner scan = new Scanner(System.in);
      System.out.println();
      System.out.println("Problem 2- Prints a triangle given specific user input");
      System.out.println("Give me a number-- this is the number of rows your triangle will have...");
      userNum = scan.nextInt();
      if(userNum < 1|| userNum > 50){
         System.out.println("Invalid input");
      }//of if
      else{
         for(i = 0; i < userNum; i++){
            for(j = 0; j<=i; j++){
            System.out.print("*");
            }//of ForJ
            System.out.println("");
         }//ofForI
      }//of else
      scan.nextLine();
      
      //Problem 3
      //Input a string from the user (use nextLine) Then, write a for loop that prints is backwards
      System.out.println();
      System.out.println("Problem 3- prints a string backwards.");
      String userString;
      System.out.println("Give me a string");
      userString = scan.nextLine();
      System.out.println("Your string backwards is:");
      for(i = userString.length() -1; i >=0; i--){
         System.out.print(userString.charAt(i));
      }//of for
      
      //Problem 4
      //Write a loop that will input 10 integer values from the user and keep track of the highest value
      //when the loop is over, print the highest value
      int temp;
      int max = 0;
      System.out.println();
      System.out.println("");
      System.out.println("Problem 4- prints the max of 10 numbers.");
      System.out.println("You will give me 10 numbers, and I will tell you which one is the largest.");
      for(i=1; i<=10; i++){
      System.out.println("Give me the " + i + " number.");
      temp = scan.nextInt();
      if(temp > max){
      max = temp;
      }//of if
      }//of for
      System.out.println("The max number you inupt was " + max + ".");
      scan.nextLine(); 
      
      //Problem 5
      //inputs a string from the user using nextLine()
      //uses a for loop to count how many times a vowel is found in the String
      //When the loop is done, print the number of times a vowel is found. Case does NOT matter
      userString = "";
      String tempString;
      int a = 0;
      int e = 0;
      int i1 = 0;
      int o = 0;
      int u = 0;     
      System.out.println();
      System.out.println("Problem 5-counts how many vowels are in a string and prints the number of vowels in the string.");
      System.out.println("Give me a string");
      userString = scan.nextLine();
      tempString = userString.toLowerCase(); 
      for(i = 0; i < userString.length(); i++){
         if(tempString.charAt(i) == 'a')
            a++;
         else if(tempString.charAt(i) == 'e')
            e++;
         else if(tempString.charAt(i) == 'i')
            i1++; 
         else if(tempString.charAt(i) =='o')
            o++;
         else if(tempString.charAt(i) == 'u')
            u++;
      }//of for
      System.out.println("The string contained:");
      System.out.printf("%d\t A's\n", a);
      System.out.printf("%d\t E's\n", e);
      System.out.printf("%d\t I's\n", i1);
      System.out.printf("%d\t O's\n", o);
      System.out.printf("%d\t U's\n", u);
      
      //Problem 6
      //using 2 nested for loops, displays a table of numbers and their squares from 1 to 80
      System.out.println();
      System.out.println("This is Problem 6, which displays a table of numbers and their respective squares.");
      int count;
      int count2;
      System.out.printf("Num\tSquare\tNum\tSquare\tNum\tSquare\tNum\tSquare\n");
      for(count =1; count < 80; count=count+20){
         for(count2 = 1; count2 < 4; count2 = count2+20){      
            System.out.printf(""+(count)+"\t\t"+((int)Math.pow(count, 2))+"\t\t\t");
         
         }//of for (inside) 
      
      
      }//of for(outside)
      System.out.println();
      
     
     //Problem 7
     //using two nested for looops, prints 1-50 and their respective factors 
     System.out.println();
     System.out.println("This is Problem 7, which displays a table of numbers 1-50 and their respective factors.");
     System.out.printf("Number \t\tFactors\n");
     System.out.printf("______ \t\t_______\n");
     for(int num = 1; num <=50; num ++){
      System.out.printf("%2d\t\t\t\t",num);
      for(int factor = 1; factor <= num; factor ++){
         if(num%factor ==0){
         System.out.printf("%3d",factor);
         
         }//of if
         if(num == factor){
         System.out.println();
         }
      
      }//of for (factor)
     
     }//of for(num)
      
   }//of main

}//of class