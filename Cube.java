// stuff
   
public class Cube 
{
   // fields
   private double length,
                  width,
                  height;
                  
   // constructors
                     
   public Cube()
   {
      /// no arg constructor
      length = 1.0;
      width = 1.0;
      height = 1.0;
   }
   
   public Cube(double s)
   {
      setLength(s);
      setWidth(s);
      setHeight(s);
   }
   
   public Cube(double l, double w, double h)
   {
      setLength(l);
      setWidth(w);
      setHeight(h);
   }

   
   //setters
   
   public void setLength(double l)
   {
      length = l;
   }
   
   public void setWidth(double w)
   {
      width = w;
   }
   
   public void setHeight(double h)
   {
      height = h;
   }


   //getters

   public double getLength()
   {
      return length;
   }

   public double getWidth()
   {
      return width;
   }

   public double getHeight()
   {
      return height;
   }

   
   // interesting stuff
   
   public double volume()
   {
      return length * width * height;
   }
   
   public void printAttributes()
   {
      System.out.println("Length: " + length);
      System.out.println("Width: " + width);
      System.out.println("Height: " + height);
      System.out.println("Volume: " + volume());
      System.out.println("");
   }

}// end class