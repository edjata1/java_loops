class Seconds{

   public static void main(String[] args)
   {
   
   int first = 1;
   int second = 1;
   
      while (second <= 10)
      {
      System.out.println("Initial Second: " + second);
      
      int temp = first + second;
      System.out.println("Temp: " + temp + " First: " + first + " Second: " + second);
      
      first = second;
      System.out.println("Temp: " + temp + " First: " + first + " Second: " + second);

      second = temp;
      System.out.println("Temp: " + temp + " First: " + first + " Second: " + second);

      }
      
   }


}