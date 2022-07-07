/**
@author Empress Djata
@version 1
*/

class Counter
{

   public static void main(String[] args)
   {
      int sum = 0;
      for(int counter = 5; counter <= 10; counter++)
      {
      System.out.println("counter: " + counter);
      System.out.println("sum: " + sum);

      System.out.println("____________" );
   
      sum = sum + counter;
      System.out.println("____________");      
      System.out.println("counter: " + counter);
      System.out.println("sum: " + sum);
      System.out.println("____________");
      }
   }
}