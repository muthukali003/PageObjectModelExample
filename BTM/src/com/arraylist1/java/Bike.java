package com.arraylist1.java;

public class Bike {
		int cc;
		double milage;
		double price;
		public Bike(int cc,double milage,double price)
		{
			this.cc=cc;
			this.milage=milage;
			this.price=price;
		}
		@Override
		public String toString()
		{
			return "Bike [cc="+cc+","+"milage="+milage+","+"price="+price+"]";
			
		}

	}

