/**
@author Empress Djata
@version v1
*/
import java.util.Scanner;

public class AdjacentValuesCreditCards
{
   public static void main(String[] args)
   {
   
   Scanner in = new Scanner(System.in);
   System.out.print("Enter value: ");
      
      double input = in.nextDouble();
      while (in.hasNextDouble())
      {
         double previous = input;
         input = in.nextDouble();
         if (input == previous) 
         { 
      
            System.out.println("Duplicate input"); 
      
         }
      
      }
   }
   
}