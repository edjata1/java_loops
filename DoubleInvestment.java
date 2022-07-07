/**
@author Empress Djata
@version v1
*/
public class DoubleInvestment
{
   public static void main(String[] args)
   {
      final double RATE = 5;
      final double INITIAL_BALANCE = 10_000;
      final double TARGET = 2 * INITIAL_BALANCE;
      
      double balance = INITIAL_BALANCE;
      int year = 0;
      
      //Count the years required for the investment to double 
      
      System.out.println("Target is: " + TARGET);
      
      while (balance < TARGET)
      {
         System.out.println("year before increase: " + year + ", balance: " + balance);
         
         year++;
         System.out.println("year after increase: " + year);
         
         double interest = balance * RATE / 100;
         System.out.println("year arfter interest: " + interest);
         
         balance = balance + interest; 
      }
      
      System.out.println("The investment doubled after " + year + " years." );

   }
}