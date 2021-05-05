package com.arraylist1.java;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArraylistClass1 {

		public static void main(String[] args) 
		{
			System.out.println("start of java code");
			ArrayList al=new ArrayList();
		//	LinkedList al=new LinkedList();
			al.add(new Mobile("apple",11223344,50000));
			al.add(new Mobile("Samsung",22334455,25000));
			al.add(new Bike(150,50,90000));
			al.add(new Bike(250,30,100000));
			al.add(new Marker("black",25));
			al.add(new Marker("red",10));
			System.out.println("size="+al.size());
			for (int i = 0; i < al.size(); i++) 
			{
				Object ob=al.get(i);
				System.out.println(ob);
			}
			System.out.println("displaying subclass properties");
			for (int i = 0; i <al.size(); i++) 
			{
				Object ob=al.get(i);
				if(ob instanceof Mobile)//to avoid classcastexception
				{
					Mobile mb=(Mobile)ob;
					System.out.println("brand="+mb.brand);
					System.out.println("emei="+mb.imei);
					System.out.println("price="+mb.price);
				}
				else if(ob instanceof Bike)
				{
					Bike bt=(Bike)ob;
					System.out.println("cc="+bt.cc);
					System.out.println("milage="+bt.milage);
					System.out.println("price="+bt.price);
					}
				else if(ob instanceof Marker)
				{
					Marker mk=(Marker)ob;
					System.out.println("colour="+mk.colour);
					System.out.println("price="+mk.price);
				}
			}
			System.out.println("end of java code");
	   }
	}

