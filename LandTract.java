
public class LandTract
{
   private String name;
   private double length,
                  width;

   public LandTract()
   {
      //do nothing constructor
   }
   
   public LandTract(String n, double l, double w)
   {
      setName(n);
      setLength(l);
      setWidth(w);
   }
   
   public void setName(String w)
   {
      name = w;   
   }
   
   public void setLength(double n)
   {
      length = n;
   }
   
   public void setWidth(double n)
   {
      width = n;
   }
   
   public String getName()
   {
      return name;
   }
   
   public double getLength()
   {
      return length;
   }
   
   public double getWidth()
   {
      return width;
   }
   
   public double area()
   {
      return length * width;
   }
   
   public String toString()
   {
      return   "The tract of land called " + name + " is " + length + " units long by " + width + 
               " units wide, and has an area of " + this.area() + " square units.";
   }
   
   public boolean equals(Object obj)
   {
      if (obj instanceof LandTract)
      {
         LandTract test = (LandTract) obj;
         return ( test.getLength() == this.getLength() ) && ( test.getWidth() == this.getWidth() );
      }
      else
      {
         return false;
      }
   }   
   
} //end class