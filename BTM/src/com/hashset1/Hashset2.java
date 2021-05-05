package com.hashset1;

import java.util.HashSet;

import com.treesetpackage.Mobile;

public class Hashset2 {
		public static void main(String[] args) 
		{
			System.out.println("start of java code");
			HashSet hs=new HashSet();
			Mobile m1=new Mobile("oppo",12345,5236.36);
			Mobile m2=new Mobile("oppo",12345,5236.36);
			Mobile m3=new Mobile("oppo",12345,5236.36);
			hs.add(m1);
			hs.add(m2);
			hs.add(m3);
			System.out.println("m1 HC="+m1.hashCode());
			System.out.println("m2 HC="+m2.hashCode());
			System.out.println("m3 HC="+m3.hashCode());
					
			System.out.println("size="+hs.size());
			for (Object ob:hs)
			{
				System.out.println(ob);
			}
		}
	}
