// Phone Book - pg.495 no.16

import java.util.*;

public class PhoneBookEntry
{
   private String name;
   private String phone;
   
   public PhoneBookEntry()
   {
      dataEntry();         
   }//end constructor

   public void dataEntry()
   {
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Enter contact name: ");      
      name = keyboard.nextLine();
      
      System.out.print("Enter " + name + "'s phone number: ");      
      phone = keyboard.nextLine();
   
      System.out.println("");
      
   }//end dataEntry

   
   public String toString()
   {
      return "Name: " + getName() + "\nPhone Number: " + getPhone() + "\n";
   }

   // Getters and Setters

   public void setName(String n)
   {
      name = n;
   }
   
   public void setPhone(String p)
   {
      phone = p;
   }

   public String getName()
   {
      return name;   
   }
   
   public String getPhone()
   {
      return phone;
   }

   // end Getters and Setters


}//end class