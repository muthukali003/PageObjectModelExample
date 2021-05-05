package com.practiceprogram;

import java.util.Scanner;

public class Exception2 {
	public static void main(String[] args) {
		try
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name");
		//System.out.println("enter the number");
		
	
	    // int a=sc.nextInt();
		String s=sc.next();
		
	   //  System.out.println("enter the number");
	     int intex=sc.nextInt();
	     char ch=s.charAt(intex);
	    System.out.println("ch-="+ch);
	   //  int b=sc.nextInt();
	  //   int sum=a/b;
	   //  System.out.println("the sum value is="+sum);
	     System.exit(0);
	    }
	//	catch(ArithmeticException e)
	//	{
		//System.out.println("exception is handled");
        //}
	finally
	{
		
		System.out.println("finally block will be executed");
	}
}
}
