public class Application
{
   public static void main(String[] args)
   {
      Stuff.display();
   
      System.out.println(Stuff.name);
      
      Stuff stuffOne = new Stuff();
      Stuff stuffTwo = new Stuff();
      Stuff stuffThree = new Stuff();
      
      System.out.println(Stuff.count);
      
      Stuff stuffFour = new Stuff(10);
   
   }//end main

}//end class