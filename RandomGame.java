// Pg 270 17&18

import java.util.*;

public class RandomGame
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      Random randomNumbers = new Random();
      
      int   input,
            guesses = 0,
            number;
            
      number = randomNumbers.nextInt(25) + 1; // btw 1 and 25
      
      do
      {
         System.out.print("Pick a number between 1 and 25 > ");
         
         input = keyboard.nextInt();
         
         while(input < 1 || input > 25)
         {
            System.out.println("Invalid input.");
            System.out.print("Pick a number between 1 and 25 > ");
            input = keyboard.nextInt();            
         }
         
         guesses++;
         
         if (input > number)
         {
            System.out.println("You guessed too high.");
         }
         else if (input < number)
         {
            System.out.println("You guessed too low.");
         }
         else
         {
            System.out.println("Correct!");
            System.out.println("You got the correct answer in " + guesses + " guesses.");
         }
         
      }
      while (input != number);
      
   } // end main

} // end class