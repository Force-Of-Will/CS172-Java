//Benjamin Longwell
//CS 172
//Lab6Methods.java
//Uses an application (Lab6Test) to complete different methods and outputs accordingly.
class Lab6Methods{

   public static void printOddNumbers(int max){
   //prints the odd numbers less than or equal to max
      int n = 1, count = 0;
      while (n <=max){
         System.out.printf("%5d", n);
         n = n + 2;
         count++;
         System.out.print((count%10 == 0) ? "\n" : "" );
   
      }//of while
   }//of printOddNumbers
   
   public static String formatName(String name){
      //returns a string with the format : lastname, firstname
      String lastname = "";
      String firstname = "";
      int index;
      index = name.lastIndexOf(' ');
      lastname = name.substring(index + 1);
      firstname = name.substring(0, index);
      return("" + lastname + ", " + firstname);
   }//of format name
   
   public static boolean hasLower(String text){
      //returns true if a passed string contains lowercase letters, false otherwise
      for(int i = 0; i < text.length(); i++){
         if(text.toLowerCase().charAt(i) == text.charAt(i)){
            return true;
         }//of if
      }//of for
      return false;
   }//of hasLower
   
   public static void temperatures(int minTemp, int maxTemp, int increment){
      //prints a table relating Fahrenheit, celcius, and kelvin
      System.out.printf("Fahrenheit\tCelcius\tKelvin\n");
      System.out.printf("__________\t_______\t______\n");
      for(int i = minTemp; i <= maxTemp; i = i + increment){
         System.out.printf("%10d\t%5.2f\t%6.2f\n", i, ((i-32.0)*5.0/9.0),(((i-32.0)*5.0/9.0)+273.15));
      }//of for
   }//of temperatures


}//of class
