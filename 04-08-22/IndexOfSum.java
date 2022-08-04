/* to Write a java program to Read array of integers and a 
 target from the user and the return indices of the two numbers such they add 
 upto the target */

import java.util.Scanner;
class IndexOfSum {
	public static void main(String args[])
           {
           
	  System.out.println("   Enter the length of array   ");
          Scanner sk = new Scanner(System.in);                             //creating scanner obj
          int size = sk.nextInt();
	  int ar[]= new int[size];
          System.out.println("   Enter elements  ");	
          for(int i=0;i<size;i++)                                                          //to store element in array
              {                 
	      ar[i]= sk.nextInt();                                                      
	       }
 	       System.out.println("Enter the Sum ");
		int target = sk.nextInt();

                search obj = new search();                   //creating object
                obj.Sum(ar,size,target);                       // calling method using object
        
       sk.close();	                                         //closing scanner object
	}


}
class search
{
	public void Sum(int ar[],int size,int target)                   //parametere assiging in method sum
        {
	int lenght = size;
        for(int i=0;i<lenght;i++)                           //to traversing the array
	  {
	  for(int j=i+1;j<lenght;j++)
 	       {
		if(target == ar[i]+ar[j])                             // comparing if sum of two elements
                         {
                    System.out.println("these are Index from array :["+i+","+j+"]");
                             } 
                  }	
            }
        }
}