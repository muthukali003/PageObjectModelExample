package com.arraylist1.java;

public class Mobile {
	String brand;
	int imei;
	double price;
	public Mobile(String brand, int emei, double price)
	{
		this.brand=brand;
		this.imei=imei;
		this.price=price;
	}
	@Override
	public String toString()
	{
		return "Mobile [brand="+brand+","+"imei="+imei+","+"price="+price+"]";
	}
	@Override
	public int hashCode()
	{
	 return imei;	
	}
	@Override
	public boolean equals(Object ob)
	{
		Mobile mb=(Mobile)ob;
		return this.imei==mb.imei;
	}
	}

