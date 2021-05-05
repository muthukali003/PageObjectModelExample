package com.exception1;

public class Mainclass1 {
	public static void main(String[] args) {
		BorderLimit b=new BorderLimit();
		try
		{
			b.border1(50);
		}
		catch(BorderCrossException e)
		{
			e.printStackTrace();
		}
	}
	

}
