import java.util.Scanner;

public class TwoNumbers
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      // Keep prompting the user until the input is correct

      int a;
      int b;
      
      do
      {
      System.out.println(
         "Enter two positive integers, the first smaller than the second.");
      System.out.print("First: ");
       a = in.nextInt();
      System.out.print("Second: ");
       b = in.nextInt();
      }
      while( a <= 0 || b < a);

      // Only print this when the input is correct
      
      System.out.println("You entered " + a + " and " + b);
   }
}