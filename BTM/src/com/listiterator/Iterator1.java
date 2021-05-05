package com.listiterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import com.treesetpackage.Mobile;

public class Iterator1
	{
		public static void main(String[] args) 
		{
			System.out.println("start of java code");
			ArrayList al= new ArrayList();
			al.add(new Mobile("apple",1122334455,50000));
			al.add(new Mobile("lg",99887766,8000));
		//	al.add(new Bike(150,75,80000));
		//	al.add(new Bike(350,35,250000));
			System.out.println("size="+al.size());
			
			System.out.println("using iterator method");
			Iterator ref=al.iterator();
			while(ref.hasNext())
			{
				Object ob=ref.next();
				System.out.println(ob);
			}
			
			System.out.println("using ListIterator method");
			ListIterator ref2=al.listIterator();
			while(ref2.hasNext())
			{
				Object ob=ref2.next();
				System.out.println(ob);
			}
			System.out.println("using previous loop");
			while(ref2.hasPrevious())
			{
				Object ob=ref2.previous();
				System.out.println(ob);
			}
			
			System.out.println("using foreach loop");
			for(Object ob:al)
			{
				System.out.println(ob);
			}
			System.out.println("end of java code");
		}
	}
