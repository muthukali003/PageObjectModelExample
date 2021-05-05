package com.exception1;

public class Mainclass2 {
	public static void main(String[] args) {
		ChargeLimit c=new ChargeLimit();
		try
		{
			c.charging(80);
		}
		catch(OverChargeException e)
		{
			e.printStackTrace();
		}
	}

}
