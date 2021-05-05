package com.practiceprogram;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception1 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int a=sc.nextInt();
		System.out.println("enter the second number");
		int b=sc.nextInt();
		try
		{
		int c=a/b;
		System.exit(0);
		System.out.println(c);
		}
		catch(InputMismatchException e)
		{
			System.out.println("mismatch is handled");
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmaticException is handled");
			
		}
		catch(Exception e)
		{
			System.out.println("exception is handled");
			
		}
		finally
		{
			System.out.println("finally block is executed");
		}
		
		System.out.println("end of java code");
		
	}

}
