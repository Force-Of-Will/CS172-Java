//Benjamin Longwell
//CS 172
//Lab 5 (Getting Input Grom a File)
//10/1/18
import java.util.*;
import java.io.*;
class lab5{

   public static void main(String args[]) throws IOException{
   
      String S;
      String lastname, firstname;
      int n1, n2, n3;
      int index;
      Scanner scan = new Scanner(System.in);
      double avg = 0.0;
      
      double highestAv = 0.0;
      String lnfnHighestAv ="";
      
      String highestGmLN = "";
      String highestGmFN = "";
      double highestGm = 0.0;
      String lnfnHighestGm = "";
      
      System.out.println("What file do you want to read form?");
      String fileName = scan.nextLine();
      
      Scanner fileScan = new Scanner(new File(fileName));
      
      while(fileScan.hasNext()){
         //Sets S to the current line in the document
         S = fileScan.nextLine();
         //System.out.println(S);
         
         //sets indices, changes S, and assigns values to n1, n2, n3, lastname, and firstname
         index = S.lastIndexOf(' ');//gets last index of space
         n3 = Integer.parseInt(S.substring(index+1));
         S = S.substring(0,index);//truncates string
         
         index = S.lastIndexOf(' ');//gets the last index of space
         n2 = Integer.parseInt(S.substring(index+1));
         S = S.substring(0,index);//truncates string
         
         index = S.lastIndexOf(' ');//gets the last index of space
         n1 = Integer.parseInt(S.substring(index+1));
         S = S.substring(0, index);//truncates string
         
         index = S.lastIndexOf(',');//gets the last index of the comma
         firstname = S.substring(index+1);
         S = S.substring(0,index);//truncates string
         
         index = 0;
         lastname = S;
         
         //tests for highest game score
         if(n1 > highestGm){
            highestGm = (double)n1;
            lnfnHighestGm = (lastname + ", " +firstname);
         }// of if
         else if(n2 > highestGm){
            highestGm = (double)n2;
            lnfnHighestGm = (lastname + ", " +firstname);
         }//of else if
         else if(n3 > highestGm){
            highestGm = (double)n3;
            lnfnHighestGm = (lastname + ", " +firstname);
         }//of else if
         
         //calculates the average
         avg = (n1 + n2 + n3) / 3.0;
         
         //tests for highest average
         if(avg > highestAv){
            highestAv = avg;
            lnfnHighestAv = (lastname + ", " +firstname);      
         }//of if
        
      }//of while
      
      //System.out.println(highestGm);
      //prints new line and highest average / game score
      System.out.println();
      System.out.printf("Player with the highest average: \t%-25s\tAverage:\t%-3d\n", lnfnHighestAv, (int)(Math.round(highestAv)) );
      System.out.printf("Player with the highest game: \t\t%-25s\tGame:\t\t%-3d\n", lnfnHighestGm, (int)highestGm );
      }//of main

}//of class