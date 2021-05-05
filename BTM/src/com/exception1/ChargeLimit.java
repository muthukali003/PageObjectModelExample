package com.exception1;

public class ChargeLimit {
	void charging(int charge)throws OverChargeException
	{
		if(charge<=100)
		{
			System.out.println("good to use mobile");
		}
		else
		{
		throw new OverChargeException();
	}
	}

}
