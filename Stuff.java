import java.util.*;
import java.io.*;

public class Stuff  
{

   public static String name = "I'm a static variable";

   public static int count = 0;

   public int ID;

   public Stuff()
   {
      count++;
      ID = count;
      System.out.println(ID);
      
   }//end constructor
   
   
   public Stuff(int i)
   {
      this();      
      this.ID = i;   
      System.out.println("new constructor " + ID);
      
   }//end constructor
   
   
   public static void display()
   {
      System.out.println("Static Method Output");
   
   }//end display
   

}//end class