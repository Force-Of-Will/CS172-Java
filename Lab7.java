//Program Name:Lab7.java
//CS172 - 3
//Benjamin Longwell
//10/20/18
//This program serves as an applet containing methods for Test7.java
//input:from Test7.java
//output: returns or prints different things according to different parameters found in Test7.java

class Lab7{

   public static void printIntArray(int nums[]){
      for(int i = 0; i< nums.length; i++){
         System.out.printf("%5d\n", nums[i]);   
      }//of for
   
   }//of printIntArray
   
   public static void printIntArray(int nums[], int n){
      int count = 1;
      for(int i = 0; i < nums.length; i++){
         if(n <=1){
            System.out.printf("%5d\n", nums[i]);
         }//of if
         else{
            System.out.printf("%5d", nums[i]);
            if(count%n == 0){
               System.out.println();
               count = 0;
            }//of if
         
         }//of else
        count++;
      }//of for
   
   }//of printIntArray
   
   public static boolean compareArrays(int a[], int b[]){
      if(a.length != b.length)
         return false;
      for(int i = 0; i < a.length; i++) {
         if(a[i] != b[i])
            return false;      
      }//of for
      return true;   
   }//of compareArrays
   
   public static void evenElements(int a[]){
      for(int i = 0; i < a.length; i++){
         if(a[i]%2 == 0)
            System.out.printf("%5d\n", a[i]);      
      }//of for   
   }//of evenElements
   
   public static int findMax(int a[]){
      int max;
      max = a[0];
      for(int i = 1; i < a.length; i++){
         if(a[i] > max)
            max = a[i];      
      }//of for
      
      return max;
   
   }//of findMax

}//of class