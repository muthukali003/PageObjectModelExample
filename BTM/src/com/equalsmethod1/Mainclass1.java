package com.equalsmethod1;

public class  Mainclass1 
{
    public static void main(String[] args) {
    	Laptop l1=new Laptop("hp",123,234);
    	Laptop l2=new Laptop("hp",123,234);
    	System.out.println(l1==l2);
    	boolean res=l1.equals(l2);
    	System.out.println(res);
    	System.out.println(l1);
    	System.out.println(l2);

	}
}
	
