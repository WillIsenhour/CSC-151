
public class Vehicle
{
   private String vType;
   private String vMake;
   private String vYear;
   private int    vBasePrice;
   private int    vDoors;

   public Vehicle()
   {
      // Do nothing constructor
   }
   
   public Vehicle(String type, String make, String year, int basePrice, int doors)
   {
      setType(type);
      setMake(make);
      setYear(year);
      setBasePrice(basePrice);
      setDoors(doors);
   }
   
   public void setType(String t)
   {
      vType = t;
   }
   
   public void setMake(String m)
   {
      vMake = m;
   }
   
   public void setYear(String y)
   {
      vYear = y;
   }
   
   public void setBasePrice(int b)
   {
      vBasePrice = b;
   }

   public void setDoors(int d)
   {
      vDoors = d;
   }   
   
   public String getType()
   {
      return vType;
   }
   
   public String getMake()
   {
      return vMake;
   }
   
   public String getYear()
   {
      return vYear;     
   }
   
   public int getBasePrice()
   {
      return vBasePrice;
   }
   
   public int getDoors()
   {
      return vDoors;
   }
   
   public int getFinalPrice()
   {
      if (vDoors > 2)
      {
         return vBasePrice + 2500;
      }
      else
      {
         return vBasePrice;
      }
   }

} //end class