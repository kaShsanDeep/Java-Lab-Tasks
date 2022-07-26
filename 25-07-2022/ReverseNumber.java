// to write the code for reversing a number for any integer 

import java.util.Scanner;       
public class ReverseNumber 
{  
      public static void main(String [] args)   
      {
       Scanner sc = new Scanner(System.in);                          //scanner object for user input
      System.out.println("Enter the number to be reversed");	      //print statement 
      int x = sc.nextInt();                                            //user input integer value
       {  
           int rev = 0;              //initiate the reverse value
            while(x != 0)             //while wiil run till "number" is not equal to 0
             {  
            int rem = x % 10;          //to store find the reminder  
            rev= rev * 10 + rem;         //to store the reverse
            x = x/10;                    //to eleminate the quotient
             }  
            System.out.println("reverse number is " + rev);  
	}  
     }  
}