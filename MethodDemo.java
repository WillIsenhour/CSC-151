//Bork bork bork bork bork
   
import java.util.*;
import java.io.*;

public class MethodDemo
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Enter a value to double > ");
      int userInput = keyboard.nextInt();
      System.out.println("Got " + userInput + ".");
      System.out.println("It's value doubled is: " + doubler(userInput) + ".");
   }//end main
   
   public static int doubler(int i)
   {
      int result = i*2;
      return result;
   }//end doubler
   
}//end class