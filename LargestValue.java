import java.util.Scanner;

public class LargestValue
{
   public static void main(String[] args)
   {
   
   Scanner in = new Scanner(System.in);

   System.out.print("Large value: ");
   double largest = in.nextDouble();

      while (in.hasNextDouble())
      {
      
         double input = in.nextDouble();
      
         if (input > largest)
      
         {
      
            largest = input;
      
         }
      
      }
   }
}