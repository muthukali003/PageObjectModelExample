package com.exception1;

public class Exception12 extends Exception {
	public static void main(String[] args) {
		WightingScale w=new WightingScale();
		try
		{
			w.measureweight(45);
		}
		catch(OverWeightException e)
		{
			e.printStackTrace();
		}
	}
}
