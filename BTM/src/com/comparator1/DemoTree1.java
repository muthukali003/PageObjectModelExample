package com.comparator1;

import java.util.Comparator;
import java.util.TreeSet;

public class DemoTree1
{
			public static void main(String[] args)
			{
				Laptop l1=new Laptop(14,8.3,"abc");
				Laptop l2=new Laptop(52,125.366,"try");
				Laptop l3=new Laptop(85,8.2,"java");
				Laptop l4=new Laptop(5,8563.2,"sql");
				Laptop l5=new Laptop(28,13.5,"testing");

				TreeSet ts=new TreeSet();
				ts.add(l1);
				ts.add(l2);
				ts.add(l3);
				ts.add(l4);
				ts.add(l5);
				System.out.println("first treeset output");

				for(Object ob:ts)
				{
					System.out.println(ob);
				}
				TreeSet ts2=new TreeSet(new SortBaseOnRam());
				ts2.add(l1);
				ts2.add(l2);
				ts2.add(l3);
				ts2.add(l4);
				ts2.add(l5);
				System.out.println("second treeset output");

				for(Object ob:ts2)
				{
					System.out.println(ob);
				}
				TreeSet ts3=new TreeSet(new SortBaseOnVersion());
				ts3.add(l1);
				ts3.add(l2);
				ts3.add(l3);
				ts3.add(l4);
				ts3.add(l5);
				System.out.println("third treeset output");
				for(Object ob:ts3)
				{
					System.out.println(ob);
				}

			}

}