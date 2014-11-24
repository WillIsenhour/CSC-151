import java.util.*;
import java.io.*;

public class FahrenheitToCelsius
{

   public static void main(String[] args)
   {
      double c;
   
      for (int i = 0; i <= 20; i++)
      {         
         System.out.printf("Degrees F: %d\tDegrees C: %.2f\n", i, celsiusConversion(i) );
      }
   
   }

   public static double celsiusConversion(int f)
   {
      final double CONVERSION_RATIO = 0.55556;
      final int    ADJUST_FOR_ZERO = 32;   
      return CONVERSION_RATIO * (f - ADJUST_FOR_ZERO);      
   }
   

}