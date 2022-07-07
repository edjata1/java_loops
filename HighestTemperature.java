import java.util.Scanner;

public class HighestTemperature
{
   public static void main(String[] args)
   {
   double highestTemperature;
   
   Scanner in = new Scanner(System.in);
   highestTemperature = in.nextDouble();
   
   int highestMonth = 1;
   
   for (int currentMonth = 2; currentMonth <= 12; currentMonth++)
   
   {
   
      double nextValue = in.nextDouble();
   
      if (nextValue > highestTemperature) 
   
      {
   
         highestTemperature = nextValue;
   
         highestMonth = currentMonth;
   
      }
   
   }
   
   System.out.println(highestMonth);
   }
}