import java.util.*;
import java.io.*;

public class Data
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      double[] values = new double[10];
      
      values[0] = 1.0;
      values[1] = 2.0;
      values[2] = values[0] + values[1];
      values[3] = 4.0;
      values[4] = 5.0;
      values[5] = 20.0;
      values[6] = 7.0;
      values[7] = -5.0;
      values[8] = 9.0;
      values[9] = 10.0;

/*      
      for (int i = 0; i < values.length; i++)
      {
         System.out.println(values[i]);
      }
*/  
   
      System.out.println(highestValue(values));
      System.out.println(lowestValue(values));
   
      parallelDemo();
      
      arrayListDemo();
   
   }//end main
   
   
   public static double totalArray(double[] arr)
   {
      double total = 0.0;
   
      for (int i = 0; i < arr.length; i++)
      {
         total += arr[i];
      }
      
      return total;      
   
   }//end totalArray
   
   
   public static double highestValue(double[] arr)
   {
      double highest = arr[0];
   
      for (int i = 0; i < arr.length; i++)
      {
         if (arr[i] > highest)
         {
            highest = arr[i];
         }
      }   
      
      return highest;
   }
   
   public static double lowestValue(double[] arr)
   {
      double lowest = arr[0];
   
      for (int i = 0; i < arr.length; i++)
      {
         if (arr[i] < lowest)
         {
            lowest = arr[i];
         }
      }   
      
      return lowest;
   }
   
   //parallel methods
   public static void parallelDemo()
   {
      //make two arrays 
      String[] names = {"Larry", "Moe", "Curly"};
      double[] grades = {75, 85, 65};
      
      //letter grades
      char[] letterGrade = new char[grades.length];
      
      //for loop output
      for (int i = 0; i < names.length; i++)
      {
         if (grades[i] >= 90)
         {
            letterGrade[i] = 'A';
         }
         else if (grades[i] >= 80)
         {
            letterGrade[i] = 'B';
         }
         else if (grades[i] >= 70)
         {
            letterGrade[i] = 'C';
         }
         else if (grades[i] >= 60)
         {
            letterGrade[i] = 'D';
         }
         else
         {
            letterGrade[i] = 'F';
         }
         
         //print names and letter grades
         
         System.out.println(names[i] + " " + letterGrade[i]);

      }
      
   }//end parallelDemo()
   
   
   public static void arrayListDemo()
   {
      ArrayList<Integer> num = new ArrayList<Integer>();
      
      num.add(2);
      num.add(4);
      num.add(8);
   
      for(int i = 0; i < num.size(); i++)
      {
         System.out.println(num.get(i));
      }
      
      num.remove(0);

      for(int i = 0; i < num.size(); i++)
      {
         System.out.println(num.get(i));
      }
   
   }

}//end class
