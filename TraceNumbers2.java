class TraceNumbers2
{

   public static void main(String[] args)
   {
   int n = 1796;
   int count = 0;
   while (n > 0)
   {   
      
      System.out.println("Initial Number " + n);  

      int digit = n % 10; 
      System.out.println("Number " + n);  
      System.out.println("Outside loop Digit " + digit);
         System.out.println("-------------------------- ");

      if (digit == 6 || digit == 7)   
      {      
         System.out.println("Digit " + digit);
         System.out.println("Count " + count);
                  System.out.println("-------------------------- ");

         count++;  
         System.out.println("Count " + count);
 
         System.out.println("-------------------------- ");

      }   
      n = n / 10;
      System.out.println("Number outside if: " + n);
   }
      System.out.println("End:" + count);
   }

}