/**
@author Empress Djata
@version v1
*/
class BankWhileLoop{

   public static void main(String[] args)
   {
   
   final double RATE = 5;
   final int TARGET = 20_000;
   
   int year = 0;
   double balance = 10_000;
   
      while(balance < TARGET)
      {
         year++;
         //interest is declared here inside the loop
         double interest = balance * RATE / 100;
         balance = balance + interest;
         //test print statement
         System.out.println(year + " years, balance: " + balance);     
      }//interest is no longer declared here
      //print final statement
      System.out.println("Your balance: " + balance + " in " + year + " years");
   }
}