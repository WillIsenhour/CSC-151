//pg 267 2&3

import java.util.*;
import java.io.*;

public class DistanceTraveled
{
   public static void main(String[] args) throws IOException
   {
      Scanner keyboard = new Scanner(System.in);
      PrintWriter outputFile = new PrintWriter("Distances.txt");
      
      int   speed,
            time,
            distance;
            
      System.out.print("Enter the speed traveled in MPH > ");
      speed = keyboard.nextInt();
      
      while(speed < 1) //validation, such as it is.
      {
         System.out.println("Invalid entry.");
         System.out.print("Enter the speed traveled in MPH > ");
         speed = keyboard.nextInt();         
      }
      
      System.out.print("Enter the travel time in hours > ");
      time = keyboard.nextInt();
      
      while(time < 1) //validation, such as it is.
      {
         System.out.println("Invalid entry.");
         System.out.print("Enter the travel time in hours > ");
         time = keyboard.nextInt();         
      }

      outputFile.println("Hours\t|\tDistance Traveled");      
      outputFile.println("---------------------------------");
      
      for (int i=1; i < time; i++)
      {
         distance = speed * i;
         outputFile.println(i + "\t|\t" + distance);      
      }
      
      outputFile.close();
   
   }//end main

}// end class