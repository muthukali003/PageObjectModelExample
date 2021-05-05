package com.practiceprogram;
class Demo{
@Override
protected void finalize()
{
	System.out.println("it is destroyed by the garbage collector");
}
}

public class Garbage1
{
	public static void main(String[] args) {
		System.out.println("start of java code");
		Demo d1=new Demo();
		d1=new Demo();
	//	d1=null;
		System.gc();
		System.out.println("end of java code");
	}
}
