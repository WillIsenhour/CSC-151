import java.util.*;
import java.io.*;

public class FileReadDemo 
{
   public static void main(String[] args) throws FileNotFoundException
   {
      File accountFile =  new File("AcctInfo.txt");
      Scanner inputFile = new Scanner(accountFile);
      
      while (inputFile.hasNext())
      {
         String line = inputFile.nextLine();
         System.out.println(line);         
      }      
   
   }//end main

}//end class