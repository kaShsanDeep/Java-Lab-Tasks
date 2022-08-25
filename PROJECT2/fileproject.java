package com.laproject;
import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
public class fileproject {

	
	public static void main (String args[]) {
		 
		
		 fileproject obj = new fileproject();
		 obj.create1();
		 obj.writer();
		 obj.reader();
	}
	
	
	public void create1() {
		 
			try {
			  File sk = new File("C:\\Users\\Akash\\Desktop\\java programms\\hello.txt");
			  
			 if(sk.createNewFile()) {
				 System.out.println("file created  "+sk.getName());
			 						}
			 	else 		{
				 System.out.println(" not created ");
			 			}
				
			}
			catch (Exception e) {
				System.out.println("**ERROR in creating**");
			 			}	
			
			}		
       
	
	  public void  writer() {
		  
		  Scanner ss= new Scanner(System.in);
		  System.out.println("write your data here below ");
		 String insertdata = ss.nextLine();
	      try {
		  FileWriter ob = new FileWriter("C:\\Users\\Akash\\Desktop\\java programms\\hello.txt");
		  ob.write(insertdata);
		  ob.close();
		  System.out.println("data writed succesfully");
	      }catch (Exception e) {
	    	  System.out.println("**ERROR in writing**");
	      }
	   ss.close();
	   
	  }
	  
	public   void reader() {
		 try {
		File rd = new File("C:\\Users\\Akash\\Desktop\\java programms\\hello.txt");
		Scanner ss1 = new Scanner(rd);
		System.out.println("data inside the file is :  ");
	
		if(ss1.hasNextLine()) {
			
			
			String da = ss1.nextLine();
			System.out.println(da);
		  
		}
		
		
		  ss1.close();
		  }
		
		catch (FileNotFoundException e) {
		System.out.println("file not found");		}
		}
		
		
	}
	  
	  
	
	
	
	
	
	
