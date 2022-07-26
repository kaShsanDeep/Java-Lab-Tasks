//making a calculator for


import java.util.Scanner;
class Calc
{
  public static void main (String args[] )
  {
   Scanner sc = new Scanner(System.in);
   System.out.println("=======enter the 1st number=======");
   double firstnumber = sc.nextDouble();
   System.out.println("=======choose the operator=======\n ======== +,-,/,%,========");
   char operator;
   operator = sc.next().charAt(0);
   
   System.out.println("=======enter the 2nd number=======");
   double secondnumber = sc.nextDouble();
 
    switch(operator)
      {
     case '+' :
          {   
         System.out.println("=====your answer is======\n" +(firstnumber+secondnumber));
         break;     
           }
       case '-' :
            {   
         System.out.println("=====your answer is====\n" +(firstnumber-secondnumber));
         break;
             }

         case '/' :
            {   
         System.out.println("=====your answer is=====\n" +(firstnumber/secondnumber));
         break;
             }
         case '*' :
            {   
         System.out.println("=====your answer is====\n" +(firstnumber*secondnumber));
         break;
             }
         case '%' :
             {
         System.out.println("=====your answer is===\n" +(firstnumber%secondnumber));   
         break;
              }

         default :
            {   
         System.out.println("selct proparly");
         return;
             }


       }  



   }



