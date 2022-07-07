class TraceNumber{

   public static void main(String[] args)
   {
   
   int number = 1729;
   int sum = 0;
   while (number > 0 )
   {
      int digit = number % 10;
      sum = sum + digit;
      number = number / 10;
      System.out.println("digit: " + digit + " sum " + sum + ", number " + number);

   }
   
      System.out.println("sum " + sum + ", number " + number);
      
      }


}