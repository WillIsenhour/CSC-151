// Blah

import java.util.*;
import java.io.*;
   
public class SavingsAccount
{
   private double interestRate,
                  accountBalance;
         
         
   public SavingsAccount()
   {
      //no arg constructor
   }

/*                     
   public SavingsAccount(double aB)
   {
      accountBalance = aB;
   }
*/   

   public SavingsAccount(double aB, double iR)
   {
      accountBalance = aB;
      interestRate = iR;
   }


   public double getBalance()
   {
      return accountBalance;
   }
   
   public double getInterestRate()
   {
      return interestRate;
   }
   
   public void setBalance(double b)
   {
      accountBalance = b;
   }
   
   public void setInterest(double i)
   {
      interestRate = i;
   }
   

   public void withdrawal(double w)
   {
      accountBalance -= w;
   }
   
   public void deposit(double d)
   {
      accountBalance += d;
   }
   
   public void addInterest()
   {
      accountBalance = (accountBalance * (interestRate/12)) + accountBalance;
   }
   
   


}//end class