/**
@author Empress Djata
@version 1
*/
import java.util.Scanner;

class ReverseOrderWord
{

   public static void main(String[] args)
   {
   
   //String s = "Empress";
   Scanner in = new Scanner(System.in);
   System.out.print("Enter a word: ");
   
   String s = in.next();
   String r = "";
   int i = 0;
   
   while (i < s.length())
   {
      char c = s.charAt(i);
      r = c + r;
      i++;
      System.out.println(r);
   }
   System.out.println(r);  
   }
}