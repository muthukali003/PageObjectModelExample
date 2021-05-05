package com.collectionexample;

public class Program1 {
	public static void main(String[] args)
	{
	 Computer [] ctr=new Computer[5];
	 Computer c1=new Computer(4,2,"yourcomputer",500);
	 ctr[0]=c1;
	 ctr[1]=new Computer(4,4,"friendscomputer",1000);
	 ctr[2]=new Computer(3,4,"mycomputer",2563);
	 ctr[3]=new Computer(2,5,"theircomputer",2563);
	 ctr[4]=new Computer(1,2,"thiscomputer",256);
	 
	 for(int i=0;i<ctr.length;i++)
	 {
		 System.out.println(ctr[i]);
	//	 System.out.println(ctr[i].hashCode());
		 
	 }
	 }
	 
	}

