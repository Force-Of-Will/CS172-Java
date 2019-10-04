//Benjamin Longwell
//11/29/18
//CS172
//Lab11.java
//crates and tests multiple recursive algorithms
class Lab11{
   public static void main(String[] args){
   printLettersForward('h');
   printLettersForward('i');
   System.out.println("This is 10 to the 2: ");
   System.out.println(powerOfTen(2));
   System.out.println("This is 10 to the -1: ");
   System.out.println(powerOfTen(-1));
   System.out.println("This is 10 to the 3: ");
   System.out.println(powerOfTen(3));
   stringByWords("Cows eat grass.");
   stringByWords("Cats eat tuna.");   
   }//of main
   
      public static void printLettersForward(char C) {
         System.out.println(C);
         int initial = (int)C;
         if (C != initial) {
            printLettersForward((char) (C + 1));
            }
         }
            
      public static double powerOfTen(int a){
      //error case
      
      //base case
      if(a == 0) return 1;
      //recursive step
      if(a > 0) return (10.0 * powerOfTen(a-1));
      if(a < 0) return (0.1 * powerOfTen(a+1));
      return 0.0;
   }
   
   public static void stringByWords(String S){
      //error case
      if(S.length() == 0) return;      
      //base case
      if(S.indexOf(' ') == -1) System.out.println(S);       
      //recursive step
      if(S.indexOf(' ') != -1){
         System.out.println(S.substring(0, S.indexOf(' ')));
         stringByWords(S.substring(S.indexOf(' ')+1, (S.length())));
      }   
   }//of stringByWords
}//of class