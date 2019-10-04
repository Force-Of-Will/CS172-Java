//Benjamin Longwell
//CS172
//Lab 8 SolarPanel.java
//works in conjunction with SolarPanelTest
//Class that represents a solar panel

public class SolarPanel{

   private double openCircuitVoltage;
   private int nominalVoltage;
   private String cellType;
   
   SolarPanel(){
      openCircuitVoltage = 40.0;
      nominalVoltage = 12;
      cellType = "Mono-crystalline";
   }//default constructor
   
    SolarPanel(double myDouble, int myInt, String myString){
      openCircuitVoltage = myDouble;
      nominalVoltage = myInt;
      cellType = myString;
   }//parameter constructor
   
   //Mutators
   
     public void setOpenCircuitVoltage(double myDouble1){
      if(myDouble1 >= 0.0 && myDouble1 <= 100.0){
         openCircuitVoltage = myDouble1;
      }
      else openCircuitVoltage = 40.0;
     }
     
     public void setNominalVoltage(int myInt1){
      if(myInt1 == 12 || myInt1 == 24){
         nominalVoltage = myInt1;
      }
      else nominalVoltage = 12;
     }
     
     public void setCellType(String myString1){
      if(myString1.equals("Mono-crystalline") || myString1.equals("Poly-crystalline")){
         cellType = myString1;
      }
      else cellType = "Mono-crystalline";
     }     
     
      
   //Accessors
   
   public double getOpenCircuitVoltage(){
      return openCircuitVoltage;
   }
   public int getNominalVoltage(){
      return nominalVoltage;
   }
   public String getCellType(){
      return cellType;
   }
   
   //toString
   public String toString(){
      String S;
      S = String.format("Voc = %5f V Nom = %3d V cellType = %20s", openCircuitVoltage, nominalVoltage,cellType);
      return S;
   }
   
}