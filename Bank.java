import java.util.*;
import java.io.*;

public class Bank 
{
   public static void main(String[] args) throws FileNotFoundException
   {

      File accountFile       = new File("AcctInfo.txt");
      Scanner inputFile      = new Scanner(accountFile);
      PrintWriter outputFile = new PrintWriter("AcctSummary.txt");
      
      while (inputFile.hasNext())
      {
         double total = 0.0;

         //Collect account information
         String acctNumber  = inputFile.nextLine();
         String acctType    = inputFile.nextLine();
         String custName    = inputFile.nextLine();
         String custType    = inputFile.nextLine();
         String balance_str = inputFile.nextLine();
         String space       = inputFile.nextLine();
         
         outputFile.println("Account Number:\t "  + acctNumber);
         outputFile.println("Account Type:\t "    + acctType);
         outputFile.println("Customer Name:\t "   + custName);
         outputFile.println("Customer Type:\t "   + custType);
         
         //Converts balance_str into a number
         double balance = Double.parseDouble(balance_str);
         outputFile.printf("Account Balance: $%.2f", balance);
         
         //Adds a space after each account block because DAYUM
         outputFile.println();
         outputFile.println();
         
         total = total + balance;

      }      
      
      outputFile.printf("Total of all balances: $%.2f", total);
      outputFile.close();
      inputFile.close();
   
   }//end main

}//end class