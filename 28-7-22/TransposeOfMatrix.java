// To make the Transpose  of user defined Matrix  




import java.util.Scanner;
public class transpose
{
	public static void main(String args [])
         {
         System.out.println("Enter the Norows and columns");
	 int i,j;                                                                 //initialising integer i and j	 
 	 Scanner sc = new Scanner(System.in);                                    // creating object "sc" for user inputs
	 int row = sc.nextInt();                                                
	 int column = sc.nextInt();
	 int ar[][]= new int[row][column];                                      
	 System.out.println("Enter elements of matrix");                         //geting elements of array
          for(i=0;i<row;i++)                                          
           {
            for(j=0;j<column;j++)
              {
               ar[i][j]= sc.nextInt(); 
              }
          }
         System.out.println("user defined matrix");                                        
           for(i=0;i<row;i++)                                                       // using a nested for loop if the outer loop satify the inner loop will execute
           {                                                                   
             for(j=0;j<column;j++)
            {
           System.out.print(ar[i][j]+" ");                                //print matrix arrays  in row and column respectivly
            }
         System.out.println(" ");
             }
           System.out.println("The transpose matrix");                           //Printing Transpose Matrix
                  
            for (i=0;i<column;i++)                                           //changed the  columns and row elements 
            {
         for(j=0;j<row;j++)
           {
           System.out.print(ar[j][i]+" ");           
           }
         System.out.println(" ");
       }
}
}