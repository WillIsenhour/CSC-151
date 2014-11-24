import java.util.*;

public class SumOfNumbers
{
   public static void main(String[] args)
   {
      int number;
      int total = 0;
      Scanner keyboard = new Scanner(System.in);
   
      System.out.print("Enter a positive integer > ");
      number = keyboard.nextInt();
      
      while(number < 1)
      {
         System.out.println("OMG STAHP");
         System.out.print("Try again > ");
         number = keyboard.nextInt();
      }
      
      for( int i=1; i < number + 1; i++)
      {
         total += i;
         System.out.println("Total is: " + total + ".");
      }
   
      System.out.print("The running total of " + number + " is " + total + ".");
   
   }
}