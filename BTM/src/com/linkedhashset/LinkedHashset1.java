package com.linkedhashset;

import java.util.LinkedHashSet;

public class LinkedHashset1 {
		public static void main(String[] args) 
		{
			System.out.println("start of java code");
			//HashSet hs=new HashSet();
			LinkedHashSet hs=new LinkedHashSet();
			hs.add("B");
			hs.add("B");
			hs.add("b");
			hs.add("D");
			hs.add("B");
			hs.add("S");
			hs.add("t");
			hs.add("N");
			hs.add("D");
			hs.add("A");
			System.out.println("size="+hs.size());
			
			for (Object ob:hs)
			{
				System.out.println(ob);
			}
		}
	}

