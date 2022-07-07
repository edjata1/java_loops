/**
@Empress Djata
@version 1
@Class Work
*/
class Cesium90HalfLife{
   public static void main(String[] args)
   {
      int year = 0;
      double percentage = 100;
      while (percentage > 1)
      {
         year = year + 30;
         percentage = percentage * .05;
         System.out.println(year);
         System.out.println(percentage);

      }
      System.out.println(year + " " + percentage);

   }
}