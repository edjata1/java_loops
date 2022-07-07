/**
@author Empress Djata
@version v1
*/
import java.util.Scanner;

public class CheckBirthYear
{
   public static void main(String[] args)
   {
   
   //int birthYear = in.nextInt();
   System.out.print("Enter another value: ");
   Scanner in = new Scanner(System.in);
   int birthYear = in.nextInt();
   
      while((birthYear <= 1900)||(birthYear >= 2010))
      {
         System.out.print("Invalid value for year. Enter another value: ");
         birthYear = in.nextInt();

      }
   }

}   