package com.arraylist1.java;

public class Marker {
		String colour;
		double price;
		public Marker(String colour,double price)
		{
			this.colour=colour;
			this.price=price;
		}
		@Override
		public String toString()
		{
			return "Marker [colour="+colour+","+"price="+price+"]";
		}

	}


