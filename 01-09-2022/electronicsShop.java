package com.laproject;

import java.util.ArrayList;   //import an array
import java.util.Scanner;     //importing scanner class
import static java.lang.System.*; //import system class

public class electronicsShop {

	public static void main(String[] args) {
		
		Scanner ss = new Scanner(System.in);         //to create object for input value
		out.println("enter the price above which you wanna search product ");
		int vl = ss.nextInt();                 //taking integer value 
		electronics sk1 = new electronics(01,10000,2211,"realme 2 pro","xiome");  //creating objects using cunstroctor
		electronics  sk2 = new electronics(02,25000,1010,"nokia android","nokia");
		electronics  sk3 = new electronics(03,55000,12123,"i phone","apple");
		electronics  sk4 = new electronics(04,5000,101,"iris watch","iris");
		electronics  sk5 = new electronics(05,15000,00002,"wahing mahine","samsung");
		electronics  sk6 = new electronics(06,60000,01544,"LED TV","Xiomi");
	
	
		ArrayList<electronics> al = new ArrayList<electronics>();
		al.add(sk1);       //adding objects to the array list
		al.add(sk2);
		al.add(sk3);
		al.add(sk4);
		al.add(sk5);
		al.add(sk6);
		
		
		
		al.stream()           
		.filter(i->i.ePrice>vl)  //to filter the value of given condition
		.forEach(i->{out.println(i.eCompany+" "+i.eName+" Rs: "+i.ePrice);  }); //output the statement
		
		ss.close();  //scanner object close 
	}

}


