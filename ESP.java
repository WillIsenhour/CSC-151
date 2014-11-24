import java.util.*;

// In this program a series
// of integers are used to
// reference a list of colors.
// They are as follows:
//
// 1 = Red
// 2 = Green
// 3 = Orange
// 4 = Yellow

public class ESP
{

   public static void main(String[] args)
   {
      int[] answers = populateAnswers();
      int correctAnswers = 0;
      
      System.out.println("This program is designed to test the limits of");
      System.out.println("Your precognitive abilities and your connection");
      System.out.println("to the spirit world.");
      System.out.println("");
      System.out.println("The spirits that have been contacted by this software");
      System.out.println("have already chosen a sequence of ten colors,");
      System.out.println("use the powers of your mind to determine what they are...");
      System.out.println("");
      
      for (int i = 0; i < 10; i ++)
      {
         int guess = getGuess();
         if(guessWasCorrect( guess, answers[i]))
         {
            correctAnswers++;
         }
      }//end for
      
      summarize(correctAnswers);
      
   }//end main
   
   
   // ---=== Here be Methods ===---
   
   
   public static int[] populateAnswers()
   {
      int[] answArray = new int[10];
      Random rand = new Random();
      
      for (int i = 0; i < 10; i++)
      {
         answArray[i] = rand.nextInt(4) + 1;
      }
      
      return answArray;
   }//end populateAnswers
   
   
   public static int getGuess()
   {
      int g = 0;
      boolean valid = false;
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Clear your mind...");
      System.out.println("Choices: 1 - Red, 2- Green, 3 - Orange, 4 - Yellow.");
      System.out.println("");
      
      do
      {
         System.out.print("Enter your choice =} ");
         if(!keyboard.hasNextInt() || !keyboard.hasNext())
         {
            System.out.println("You have not entered a number. The spirits are most displeased.");
            keyboard.nextLine();
         }
         else
         {
            g = keyboard.nextInt();
            
            if(g >= 1 && g <= 4)
            {
               valid = true;
            }
            else
            {
               System.out.println("What you have entered was not one of your choices. Try again.");
               keyboard.nextLine();
            }//end if
            
         }//end if
         
      }while(valid == false); // end do/while
      
      return g;
      
   }//end getGuess
   
   
   public static boolean guessWasCorrect(int g, int a)
   {
      boolean correct;
      
      System.out.println("You have chosen " + giveColor(g) + ".");
      System.out.println("The spirits have chosen " + giveColor(a) + ".");
      
      if (g == a)
      {
         correct = true;
         System.out.println("Your choice was correct.");
      }
      else
      {
         correct = false;
         System.out.println("Your choice was not correct.");
      }
      System.out.println("");
      
      return correct;
      
   }//end guessWasCorrect
   
   
   public static String giveColor(int i)
   {
      String color = "";
      
      switch(i)
      {
         case 1: color = "Red";
            break;
         case 2: color = "Green";
            break;
         case 3: color = "Orange";
            break;
         case 4: color = "Yellow";
            break;
      }
      return color;
      
   }//end giveColor
   
   
   public static void summarize(int i)
   {
      score(i);
      
      switch(i)
      {
         case 0:
         case 1:
         case 2:
         case 3:
         System.out.println("Alas, you do not have the gift.");
         System.out.println("Perhaps a career in a less esoteric field");
         System.out.println("such as Java programming would better suited");
         System.out.println("your particular talents...");
            break;
            
         case 5:
         case 4:
         System.out.println("Uncanny...");
         System.out.println("Your capacity for precognition definitely");
         System.out.println("falls above the norm, however the spirits will");
         System.out.println("need more evidence before they're convinced.");
            break;
         
         case 6:
         case 7:
         System.out.println("Impressive.");
         System.out.println("Scoring this high means you're either highly gifted,");
         System.out.println("or a remarkable cheat.");
         System.out.println("The Spirits are notoriously skeptical.");
            break;
         
         default:
         System.out.println("Remarkable!");
         System.out.println("The unseen is clearly an open book to you.");
         System.out.println("This begs the question, why are you wasting time");
         System.out.println("here when you could be playing the stock market");
         System.out.println("or brokering peace in the middle east?");
            break;
      }//end switch
      
   }// end summarize
   
   
   public static void score(int i)
   {
      if (i == 1)
      {
         System.out.println("In ten attempts, you chose correctly only " + i + " time.\n");
      }
      else
      {
         System.out.println("In ten attempts, you chose correctly " + i + " times.\n");
      }
   }//end score 
     
   
}//end class