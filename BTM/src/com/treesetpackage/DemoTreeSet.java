package com.treesetpackage;

import java.util.TreeSet;

public class DemoTreeSet {
	public static void main(String[] args)
	{
		Mobile m1=new Mobile("Apple",253,550000.00);
		Mobile m2=new Mobile("Samsung",123,250000.00);
		Mobile m3=new Mobile("redmi",25,230000.00);
		Mobile m4=new Mobile("vivo",540,900000.00);
		Mobile m5=new Mobile("oppo",124,330000.00);
		Mobile m6=new Mobile("moto",256,110000.00);
		Mobile m7=new Mobile("nokia",12,120000.00);
		TreeSet ts=new TreeSet();
		ts.add(m1);
		ts.add(m2);
		ts.add(m3);
		ts.add(m4);
		ts.add(m5);
		ts.add(m6);
		ts.add(m7);
		for(Object ob:ts)
		{
			System.out.println(ob);
		}

	}

}
