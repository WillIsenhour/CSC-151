// skidoosh

public class CubeDemo
{
   public static void main(String[] args)
   {
   
      Cube c = new Cube();
      Cube rubiks = new Cube(5, 5, 5);
      Cube weightedCompanion = new Cube(10, 10, 10);
      Cube perfect = new Cube(3);
   
      c.printAttributes();
      rubiks.printAttributes();
      weightedCompanion.printAttributes();   
      
      c.setWidth(20);
      c.printAttributes();
      
      perfect.printAttributes();   
   
   }//end main

}//end class