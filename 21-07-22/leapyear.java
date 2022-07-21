//to check the leap year for 1947 to 2022

class leapYear
{

   public static void main (String [] args)
   {
   int year;                                //defining variable called year
   for (year=1947; year<=2022;year++)      //assiging the conditions to the variable
     if(year%4==0)                         // after every 4 years the reminder will be 0
      {
      System.out.println(year+"this is leap year");   //to print the statement 
      }
    

   }



}