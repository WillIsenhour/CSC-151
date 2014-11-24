import java.util.*;

public class PhoneDemo
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("How many contacts will you add? ");
      int contacts = keyboard.nextInt();
      
      ArrayList<PhoneBookEntry> phoneBook = new ArrayList<PhoneBookEntry>();
      
      for (int i = 0; i < contacts; i++)
      {
         phoneBook.add(new PhoneBookEntry());
      }
   
      for (int j = 0; j < phoneBook.size(); j++)
      {
         PhoneBookEntry temp = phoneBook.get(j);
         System.out.println(temp.toString());
      } 
   
   }//end main

}//end class