// to write the table of n numbers using java


import java.util.Scanner;                                        
class table
{ 
    public static void main(String args[])                              
    {                           
        Scanner sk = new Scanner(System.in);                                         // creating object for scanner                                                          
        System.out.println("Enter a number for which you want to print the table");
        int x= sk.nextInt();                                                         //assign a integer type method                                                        
        int y= 10;
        for(int i=1;i<=y;i++)                                                         // we assign the condition of int value of "i" will increment till "y"
        {
            System.out.println(x+"X" +i+ "=" +(x*i));      
           
        }
        sk.close();                                                   
     }
}