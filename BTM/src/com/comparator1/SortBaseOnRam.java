package com.comparator1;

import java.util.Comparator;

public class SortBaseOnRam implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		Laptop lt1=(Laptop)o1;
		Laptop lt2=(Laptop)o2;
		return lt1.ram-lt2.ram;
	}

}
