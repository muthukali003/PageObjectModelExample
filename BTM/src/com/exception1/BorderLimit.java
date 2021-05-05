package com.exception1;

public class BorderLimit {
	void border1(int border) throws BorderCrossException
	{
	if(border<=100) 
	{
		System.out.println("border should be the within 100km");
	}
	else
	{
		throw new BorderCrossException();
	}
}

		
	}



