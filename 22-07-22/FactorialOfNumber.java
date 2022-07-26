//java code to find the factorial off a given integer 

import java.util.Scanner;                //loading scanner class
class FactorialOFNumber {
   public static void main(String []args)    //main method
  {
     Scanner  obj = new Scanner(System.in);     //creating new object for scanner 
     System.out.println("Enter the no");         //print statement
     int x = obj.nextInt();                       //for integer type user input
     int sum = 0;                                 //initialising the integer variable sum 
     for(int i=1;i<=x;i++)                          //for "i" increment till "x"
        if(i<=x)                                 //condition 
         { 
          sum += (i);                            //sum of all series
         }
       {
      System.out.println("Factorial for the number \n--------" +x +"----------\n---is---\n" + "" +sum);   //print statement
       }
 
   }
}