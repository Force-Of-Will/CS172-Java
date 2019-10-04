//Test7.java, lab2
//CS172-3
//Written BY Benjamin Longwell
//10/20/18
//this program prints out specific information about different randomly-generated arrays using methods found in lab7.java
//Input: no input from user
//output: different methods from Lab7.java performed on random;y-generated matrices


class Test7{

   public static void main(String[] args){
   
      int[] array1 = new int[25];
      
      for(int i = 0; i < array1.length; i++) {
         array1[i] = (int)(Math.random() *100);
         }//of for
         
      System.out.println("This is the new array, each element is printed below.");
      Lab7.printIntArray(array1);
      
      System.out.println("this is the same array, but with 5 elements on each line:");
      //FIXME
      Lab7.printIntArray(array1, 5);
      
      int[] array2 = new int[50];
      for(int i = 0; i < array2.length; i++) {
         array2[i] = (int)(Math.random() *1001);
         }//of for
      System.out.println();
      System.out.println("This is array 2, with 10 elements on each line:");   
      Lab7.printIntArray(array2, 10);
      
      System.out.println();
      
      System.out.println("Here are all the even elements in array 1:");      
      Lab7.evenElements(array1);
      System.out.println();
      System.out.println("Here are all the even elements in array 2:");
      Lab7.evenElements(array2);
      
      int[] array3 = new int[25];
      for(int i = 0; i < array3.length; i++){
         array3[i] = array1[i];      
      }//of for
      
      if(Lab7.compareArrays(array3, array1)){
         System.out.println("Array1 and Array3 are the same.");
         }
      else {
         System.out.println("Array1 and Array3 are NOT the same.");
         }
      
      array3[24] = array3[24]+1;
      
      if(Lab7.compareArrays(array3, array1)){
         System.out.println("Array1 and Array3 are the same.");
         }
      else {
         System.out.println("Array1 and Array3 are NOT the same.");
         }
         
      if(Lab7.compareArrays(array2, array3)){
         System.out.println("Array3 and Array2 are the same.");
         }
      else {
         System.out.println("Array3 and Array2 are NOT the same.");
         }
         
      System.out.print("This is the maximum value found in array1: ");
      System.out.printf("%5d\n",Lab7.findMax(array1));
      
      System.out.print("This is the maximum value found in array2: ");
      System.out.printf("%5d\n",Lab7.findMax(array2));
         
   }//of main


}//of class