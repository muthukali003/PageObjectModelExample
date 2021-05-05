package com.priorityqueue1;

public class Laptop implements Comparable{
			int ram;
			double version;
			String serialnum;
			public Laptop(int ram,double version,String serialnum)
			{
				this.ram=ram;
				this.version=version;
				this.serialnum=serialnum;
			}
			@Override
			public String toString()
			{
				return "ram="+ram+" "+"version="+version+" "+"serialnum="+serialnum;
			}
			@Override 
			public int compareTo(Object o)
			{
				Laptop l1=(Laptop)o;
			//System.out.println(this.imei+"-"+mt.imei);
			//	return this.ram-l1.ram;
			//	return (int)((this.version-l1.version)*1000);
				Laptop lt=(Laptop)o;
				String first=this.serialnum;
				String second=lt.serialnum;
				int value=first.compareTo(second);
				return value;
			}
			

		}


