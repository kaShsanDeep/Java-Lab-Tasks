// making a program to find which days it is for practicing of switch concept purpose only
// all the copy rights  is for @sanDeep kaSh


import java.util.Scanner;
class Days
{
  public static void main(String args[])
   {
   Scanner sk = new Scanner(System.in);
   System.out.println("Enter the number for day");
   char x;
   x = sk.next().charAt(0); 
     
   switch(x)
     {
      case '1' :
         {
         System.out.println("this is the Day of **Monday**");
         break; 
         }
        
      case '2' :
          {
           System.out.println("this is the Day of **Tuesday**");
          break;
            } 
      case '3' :
           {
           System.out.println("this is the Day of **Wednesday**");
           }


      case '4' :
          {
           System.out.println("this is the Day of **Thursday**");
          break;
            } 

       case '5' :
          {
           System.out.println("this is the Day of **friday**");
          break;
            } 

       case '6' :
          {
           System.out.println("this is the weekend   **saturday**");
          break;
            }
       case '7' :
          {
           System.out.println("this is the weekend   **sunday**");
          break;
             }
  
       default :
       {
       System.out.println("this day is not valid");
       return;
        }


       }
 


    }
}