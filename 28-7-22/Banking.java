// to wtite the program for the showing the bank details of cutomer


import java.util.Scanner;       
class Banking 
{
	  public static void main(String args[])       //main method
   	{ 
     	int amount=50000;
        int account_Num=123456;
       	int account_Bal=2000;         
      	String account_Name="sandeep";
        String branch_Name="delhi";
	String bank_name="Kotak_mahindra_pvt";

        customer sk = new customer();                                                    //creating an object name sk
        sk.account_Info(account_Num,account_Name,account_Bal,branch_Name,bank_name);      //method calling by object sk
        sk.account_detail();                                                   
        sk.deposit_amount(amount);
        sk.account_detail();
        sk.withdrawamt(amount);
        sk.account_detail();
   	}
}
  class customer
 { 
	     public int account_Bal,account_Num;           
  	     public String account_Name,branch_Name,bank_name;                                // creating instance variable
  
     public void account_Info(int accountNumber,String accountName,int accountBalance,String branch,String bankname)  
    	{  
	  account_Num=accountNumber;
	  account_Name=accountName;
	  account_Bal=accountBalance;
	  branch_Name=branch;
          bank_name=bankname;
	}
     
	public void deposit_amount(int amount)                               //deposite method              
        {
         System.out.println("your deposite amount is "+amount);
	 account_Bal+=amount;  	
	}
	
  	public void withdrawamt(int amount)                                        //withdraw method
        {
        System.out.println("your withraw amount is  "+amount);
         account_Bal -= amount; 
        }
        
        public void account_detail()                                 //method to display the details 
        {
        System.out.println(" Hello!  " +account_Name);
        System.out.println("your account number is  " +account_Num+ "Branch Of "+branch_Name+ " \n balance is Rs."+account_Bal);
         System.out.println("Regards " +bank_name);

	}

} 
 