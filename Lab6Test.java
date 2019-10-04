//Benjamin Longwell
//10/16/18
//CS 172
//Lab6Test.java application that takes in Methods and outputs information accordingly
class Lab6Test{
   public static void main(String[] args){
   
      Lab6Methods.printOddNumbers(100);
      System.out.println();
      Lab6Methods.printOddNumbers(25);
      System.out.println();
      
      System.out.println("The lastname and first name, respectively are: ");
      System.out.println(Lab6Methods.formatName("Benjamin Longwell"));
      System.out.println(Lab6Methods.formatName("Shaun Cooper"));
      
      System.out.println("These funcitons tell whether or not a string contains lowercase letters.");      
      if(Lab6Methods.hasLower("shsagfhjsgfsdf")){
         System.out.println("This sentence has lowercase.");
      }//of else
      else {
         System.out.println("This sentence has no lowercase.");
      }//of else
      
      if(Lab6Methods.hasLower("AAB")){
         System.out.println("This sentence has lowercase.");
      }//of if
      else {
         System.out.print("This sentence has no lowercase.");
      }
      
      System.out.println();
      System.out.println("Here is a table with 10 minimum, 100 maximum, and 10 increment relating Fahrenheit, Celcius, and Kelvin.");
      Lab6Methods.temperatures(10, 100, 10);
     
   }//of main
}//of class