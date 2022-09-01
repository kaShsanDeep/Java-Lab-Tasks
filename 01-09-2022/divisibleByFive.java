package com.laproject;
import java.util.stream.Stream; 
import java.util.Scanner;
import static java.lang.System.*;


public class divisibleByFive {


		public static void main(String [] args) {
			out.println("enter the range  till you want to have the numbers devisible of 5 ");
			Scanner sk= new Scanner(System.in);
			int vl =sk.nextInt();
			Stream.iterate(1,i->++i)  //to iterate the statement with increase one
			.limit(vl)                 //set the limit till set value
			.filter(i->i%5==0)          //filter the value with condition
			.forEach(out::println);			 //to print the value 

			sk.close();
			
			
		}

	} 
