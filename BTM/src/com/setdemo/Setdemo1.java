package com.setdemo;

import java.util.HashSet;

import com.treesetpackage.Mobile;

public class Setdemo1 {
	public static void main(String[] args) {
		{
			HashSet hs=new HashSet();
			Mobile m1=new Mobile("oppo",1234,5236.36);
			Mobile m2=new Mobile("oppo",1234,5236.36);
			hs.add(m1);
			hs.add(m2);
			for(Object ob:hs) {
				System.out.println(ob);
			}
			
		}
	}

}
