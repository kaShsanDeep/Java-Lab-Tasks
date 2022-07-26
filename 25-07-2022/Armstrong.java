// to check the user input is rmgstrong or not 

import java.util.Scanner;
public class Armstrong                                 //class name 
{           

    public static void main(String[] args)             //main method 
	{    
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number to check");   
       int x = sc.nextInt();                             //user integer type input
       int num, rem, result = 0;              
       num = x;
        while (num != 0)                                 //while num is not equal to 0
	{
         rem = num % 10;                                   //find the reminder 
         result += Math.pow(rem, 3);                       //for cube and storing value of it
         num /= 10;                                         //eleminate the value of num
        }

        if(result == x)                                      //comparing
            System.out.println("--------"+x+ "-----------"+ " \n is an Armstrong number.");
        else
            System.out.println("--------"+x+"---------" + "\n is not an Armstrong number.");
    }
}