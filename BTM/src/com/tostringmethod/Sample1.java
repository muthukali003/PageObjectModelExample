package com.tostringmethod;
 class Sample2 {
	    @Override
		public String toString()
		{
			return "12345";
		}
}
class Sample1
{
	public static void main(String[] args) {
		Sample2 s1=new Sample2();
		System.out.println(s1);
		System.out.println(s1.toString());
	}
}

//fullyQuallifiedClassName@hexadecimalno
//fullyQuallifiedClassName@hexadecimalno
//com.tostringmethod.Sample2@7852e922
//com.hashcodemethod1.Hashcode2@7852e922
//hash=2018699554


