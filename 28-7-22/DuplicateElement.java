// to find the duplicate element 

import java.util.Scanner;
public class DuplicateElement 
{    
	public static void main(String[] args) 
	{ 
        Scanner sc = new Scanner(System.in);
         System.out.println("Entre the length of the array");               //print statement
        int len = sc.nextInt();                                            //to get the length via user input           
	int [] ar = new int[len];   
         int count =0;                                                        //count initialisation                    
        System.out.println("enter array values");
          for(int i=0;i < ar.length; i++)                                       //array values traverse from index 0 to length
            {
              ar[i]=sc.nextInt();                                                //array inputs
 		}
       
        System.out.println("Duplicate elements in given array");    
        for(int i = 0; i < ar.length; i++)                                 //nested loop if i is less then length 
	{                                                                     //execute the nested for loop 
            for(int j = i+1; j < ar.length; j++) 
		{  
                if(ar[i] == ar[j])                          //comparing both array elements 
                    ++count;  
       		} 
            
    	 } 
        System.out.println(count);
 
    }  
}