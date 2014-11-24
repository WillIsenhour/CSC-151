import java.util.*;
import java.io.*;
   

public class SavingsDemo
{
   public static void main(String[] args)
   {
      SavingsAccount mySavings = new SavingsAccount();
   
     
   }//end main
   
   
   public double askInterest()
   {
      Scanner keyboard = new Scanner(System.in);
            
      System.out.print("What is the interest rate? > ");
      
      double interest = keyboard.nextDouble();
      
      if (interest > 1)
      {
         return interest / 100.0;
      }        
      else
      {
         return interest;
      }
   }
   
   public double askBalance()
   {
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("What is the account balance? > ");
            
      return keyboard.nextDouble();
   }
   
   public int howManyMonths()
   {
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("How many months are you calculating interest for? > ");
      
      return keyboard.nextInt();
   }

}//end class