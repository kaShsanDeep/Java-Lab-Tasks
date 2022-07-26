// writing a code to perform a pattern of "*" for n times using java

import java.util.Scanner;             //loading scanner class for  user input 
class StarPattern
{
     public static void main(String args[])        
     {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter  the no");     //print statement to knoow the value
	int num = sc.nextInt();                  // to have integer type of inputs 
	
	for(int i=1;i<=num;i++)                  //using nested for loop  here and i will count till "num" if i is less then num then nested for loop will start
	 {
	  for(int j=1;j<=i;j++)                 
	    {
           System.out.print('*');               
	    }
	    System.out.println("");              // to print output to next line
	  }

     }

}