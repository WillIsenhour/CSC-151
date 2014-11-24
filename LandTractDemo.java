public class LandTractDemo
{
   public static void main(String[] args)
   {
      LandTract lotOne = new LandTract("Lot 1", 20, 20);
      LandTract lotTwo = new LandTract("Lot 2", 40, 40);
      LandTract lotThree = new LandTract("Lot 3", 20, 20);
      
      System.out.println(lotOne.area());
      System.out.println(lotTwo.area());
      System.out.println(lotThree.area());
   
      System.out.println();   
   
      System.out.println(lotOne.toString());
      System.out.println(lotTwo.toString());
      System.out.println(lotThree.toString());
      
      if (lotOne.equals(lotThree))
      {
         System.out.println();
         System.out.println("Equal Lots Are Equal");
      }   
   
      if (!lotOne.equals(lotTwo))
      {
         System.out.println();
         System.out.println("Unequal Lots Are Not Equal");
      }   
   
   } // end main

} // end class