/**
@author Empress Djata
@version v1
*/
public class FirstMatch
{
   public static void main(String[] args)
   {
   
   String str = "Max had a little lamb";
   boolean found = false;
   char ch = '?';
   int pos = 0;
   while (!found && pos < str.length())
   {   ch = str.charAt(pos);  
      if (ch == 'x')   
      {      
         found = true;   
       }   
       else   
       {      
       pos++;   
       
       }
       }
       if (found)
       {   
       System.out.println("Found at " + pos);
       }
       else
       {   
       System.out.println("Not found");  
       }  
   
   }
}