import java.util.Scanner;

public class SmallestValue
{
   public static void main(String[] args)
   {
   

   Scanner in = new Scanner(System.in);

   System.out.print("Small value: ");
   double smallest = in.nextDouble();
   
      while (in.hasNextDouble())
      
      {
      
         double input = in.nextDouble();
      
         if (input < smallest)
      
         {
      
            smallest = input;
      
         }
      }
   }
}   