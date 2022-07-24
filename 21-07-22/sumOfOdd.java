//write a java program to print sum of odd numbers upto N?

import java.util.Scanner;
class sumOfOdds
  {
   public static void main (String args[])
   {
   Scanner obj = new Scanner(System.in);
   System.out.println("--------Enter odd number till you wanna add----------");
   int num;
   int sum = 0;
    num = obj.nextInt();
    for(int i=1;i<=num;i++)
        if(i%2!=0) 
          
           {
          sum += (i);
          }
           {
        System.out.println("the sum of the odd number is given----------" +sum); 
          }
 
     }

  } 
