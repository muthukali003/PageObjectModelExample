package com.treesetpackage;

public class Mobile implements Comparable{
	String brand;
	int imei;
	double price;
	public Mobile(String brand,int imei,double price)
	{
		this.brand=brand;
		this.imei=imei;
		this.price=price;
	}
	@Override
	public String toString()
	{
		return "Mobile[brand="+brand+","+"imei="+imei+",price="+price+"]";
	}
	@Override 
	public int compareTo(Object o)
	{
		Mobile mt=(Mobile)o;
		System.out.println(this.imei+"-"+mt.imei);
		return this.imei-mt.imei;
	}
	

}
