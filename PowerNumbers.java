/**
   This program prints a table of powers of x.
*/
public class PowerNumbers{
   public static void main(String[] args)
   {  

for (int n = 2; n <= 3; n++){   int p = 1;   
for (int i = 1; i <= 3; i++)   {      p = p * n;      System.out.printf("%6d", p);   }   

System.out.println();}
System.out.println();
}
}