/* 
   Will Isenhour 11.16.14
   The purpose of this program is still to earn a good grade in CSC 151.
*/

import java.util.*; // Scanner
import java.io.*;   // PrintWriter

public class CarDealership3 
{

public static ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

   public static void main(String[] args) throws FileNotFoundException
   {   
      vehicles = populateArrayList();   
      outputInfo();  
   } //end main
   
// ---=== METHODS ===---

   public static ArrayList populateArrayList() throws FileNotFoundException
   {
      ArrayList<Vehicle> popArrayList = new ArrayList<Vehicle>();
      Scanner fileBeingRead = new Scanner(new File("VehicleInformation.txt"));

      for (int i = 0; i < 7; i++)
      {
         String nType;
         String nMake;
         String nYear;
         int    nBasePrice;
         int    nDoors;
         
         nType =        fileBeingRead.nextLine();  // type
         nMake =        fileBeingRead.nextLine();  // make
         nYear =        fileBeingRead.nextLine();  // year
         nBasePrice =   fileBeingRead.nextInt();  // price
         nDoors =       fileBeingRead.nextInt();  // doors
         
         fileBeingRead.nextLine(); // Advances cursor to next block of content
         fileBeingRead.nextLine(); //
         
         popArrayList.add(new Vehicle(nType, nMake, nYear, nBasePrice, nDoors));         
      }
      
      return popArrayList;
      
   } // end populateArrayList()
   
   
   public static void outputInfo() throws FileNotFoundException
   {
      PrintWriter fileOutput = new PrintWriter("Project3Output.txt");
      int totalPrice = 0;
      int averagePrice = 0;
   
      for (int i = 0; i < vehicles.size(); i++)
      {
         fileOutput.println("Type: " + vehicles.get(i).getType());
         fileOutput.println("Make: " + vehicles.get(i).getMake());
         fileOutput.println("Year: " + vehicles.get(i).getYear());
         fileOutput.println("Base Price: " + vehicles.get(i).getBasePrice());
         fileOutput.println("No. of Doors: " + vehicles.get(i).getDoors());
         fileOutput.println("Total Price: " + vehicles.get(i).getFinalPrice());         
         fileOutput.println("");
      }   
      
      for (int i = 0; i < vehicles.size(); i++)
      {
         totalPrice += vehicles.get(i).getFinalPrice();
      }

      averagePrice = totalPrice / vehicles.size();
      
      fileOutput.println("Total price of all vehicles: " + totalPrice);
      fileOutput.println("Average price of all vehicles: " + averagePrice);
         
      fileOutput.close();
   
   } // end outputInfo()

}//end class