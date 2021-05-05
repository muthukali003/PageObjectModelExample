package com.exception1;

public class WightingScale {
 void measureweight(int weight) throws OverWeightException
 
  {
	 if(weight<=50)
	 {
	 System.out.println("it will give the currect weight");
  }
	 else
	 {
		  throw new OverWeightException();
	 }
  }
}
