package com.comparator1;

import java.util.Comparator;

public class SortBaseOnVersion implements Comparator {


		@Override
		public int compare(Object o1, Object o2) {
			Laptop lt1=(Laptop)o1;
			Laptop lt2=(Laptop)o2;
			return (int)((lt1.version-lt2.version)*1000);
		}

}
