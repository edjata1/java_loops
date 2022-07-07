import java.util.Scanner;

public class UntilFirstMatch3
{
   public static void main(String[] args)
   {
   
   boolean valid = false; 
   double input = 0; 
   
      while (!valid) { 
      
         Scanner in = new Scanner(System.in);
         System.out.print("Please enter a positive value < 100: "); 
         
         input = in.nextDouble(); 
      
         if (0 < input && input < 100) 
         { 
            valid = true; 
         } 
         else 
         { 
            System.out.println("Invalid input."); 
         } 
      }
   }
}