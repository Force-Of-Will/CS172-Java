//benjamin longwell
//CS172 SolarPanelTest.java 
//lab 10
//works in conjunction with the SolarPanel class
//creates and manipulates solar panel objects

class TestLab10{
   public static void main(String[] args){
   //creating a solar panel
   SolarPanel panelOne = new SolarPanel();
   
   panelOne.setOpenCircuitVoltage(20.0);
   panelOne.setNominalVoltage(12);
   panelOne.setCellType("Mono-crystalline");
   System.out.println(panelOne);
   
   panelOne.setOpenCircuitVoltage(150.0);
   
   System.out.println("The open circuit voltage of panel one is: " + panelOne.getOpenCircuitVoltage());
   
   panelOne.setNominalVoltage(-10);
   System.out.println("The nominal voltage of panel one is: " + panelOne.getNominalVoltage());
   
   //making a new solar panel using parameters
   SolarPanel panelTwo = new SolarPanel(40.0,24, "Mono-crystalline");
   System.out.println("The open circuit voltage of panel two is: " + panelOne.getOpenCircuitVoltage());
   System.out.println("The  nominal voltage of panel two is: " + panelOne.getNominalVoltage());
   System.out.println("The cell type of panel two is: " + panelOne.getCellType());
   
   //testing bad values on the 2nd solar panel
   panelTwo.setOpenCircuitVoltage(0.0);
   System.out.println("The open circuit voltage of panel two is: " + panelOne.getOpenCircuitVoltage());
   panelTwo.setCellType("Vinyl Polymer");
   System.out.println("The cell type of panel two is: " + panelOne.getCellType());
   System.out.println(panelTwo);
   
   }//of main

}//of class