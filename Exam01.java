// Will Isenhour
// CSC 151 Exam 01
// 9-29-2014

import java.util.*;
   
public class Exam01
{

   public static void main(String[] args)
   {
      
      System.out.println("Calculate the discount on a day's shopping.\n");

      do
      {
         int      day = dayOfTheWeek();
         double   total = moneySpent();
         calculateDiscount(day, total);

         System.out.print("Enter 'quit' to exit, or anything else to proceed > ");
         
      }while (execute());
      
   }//end main   
   
   
// --== METHODS, FOOL ==--

   
   public static boolean execute()
   {
      Scanner keyboard = new Scanner(System.in);
      boolean go = true;
      String choice;

      choice = keyboard.next();
      
      if (choice.equalsIgnoreCase("quit"))
      {
         go = false;
      }
      
      System.out.println("");
      return go; 
              
   }//end execute
   
   
   public static int dayOfTheWeek()
   {
      Scanner keyboard = new Scanner(System.in);
      boolean valid = false;
      int d = 0;
   
      System.out.println("1 - Sunday");
      System.out.println("2 - Monday");
      System.out.println("3 - Tuesday");
      System.out.println("4 - Wednesday");
      System.out.println("5 - Thursday");
      System.out.println("6 - Friday");
      System.out.println("7 - Saturday");
      System.out.println("");
   
      do
      {   
         System.out.print("Enter a day of the week to calculate for > ");
         
         if(!keyboard.hasNextInt())
         {
            System.out.println("You must enter a valid choice for day of the week.");
            keyboard.next();
         }
         else
         {
            d = keyboard.nextInt();
         }      
         
         if(d < 1 || d > 7)
         {
            System.out.println("What you have entered was not one of your choices. Try again.");
         }
         else
         {
            valid = true;
         }
   
      }while (valid == false); // end do/while
      
      return d;
      
   }//end dayOfTheWeek
   
   
   public static double moneySpent()
   {
      Scanner keyboard = new Scanner(System.in);
      boolean valid = false;
      double m = 0.0;
      
      do
      {   
         System.out.print("What was the total for the groceries? > ");
         
         if(!keyboard.hasNextDouble())
         {
            System.out.println("You did not enter a number.");
            keyboard.next();
         }
         else
         {
            m = keyboard.nextDouble();
         }      
         
         if(m < 1)
         {
            System.out.println("The total bill must be greater than one dollar.");
         }
         else
         {
            valid = true;
         }
   
      }while (valid == false); // end do/while
      
      return m;
   
   }//end moneySpent
   
   
   public static void calculateDiscount(int d, double m)
   {
      double   couponTotal = 0,
               couponRate = 0;
      int      couponMultiplier = 1;
      boolean  display = true;
      
      if (d == 5)
      {
         couponMultiplier = 2;
      }
      
   
      if (m < 10)
      {
         System.out.println("You did not spend enough to earn a coupon.\n");
         display = false;         
      }
      else if (m >= 10 && m < 60)
      {
         couponRate = 0.08;   
      }
      else if (m >= 60 && m < 150)
      {
         couponRate = 0.1;
      }
      else
      {
         couponRate = 0.12;
      }
   
      if (display == true)
      {
         displayCoupon(m, couponMultiplier, couponRate);
      }
   
   }//end calculateDiscount
   
   
   public static void displayCoupon(double total, int multi, double rate)
   {
      double couponValue = (total * rate) * multi;
   
      if (multi == 2)
      {
         System.out.println("*** IT'S DOUBLE COUPON THURSDAY ***");
      }      
      System.out.printf("On a total bill of $%.2f, you have earned a coupon worth $%.2f!", total, couponValue);
      System.out.println("");
      System.out.println("");
      
   }//end displayCoupon
   

}//end class