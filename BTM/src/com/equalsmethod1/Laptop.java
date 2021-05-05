package com.equalsmethod1;

public class Laptop {
		String brand;
		int id;
		int imei;
	 Laptop(String brand,int id,int imei)
	{
	     this.brand=brand;
	     this.id=id;
	     this.imei=imei;
	}
	     public boolean equals(Object ob)
	     {
	    	 if(ob instanceof Laptop)
	    	 {
	    		 Laptop ll=(Laptop)ob;
	    	     return this.imei==ll.imei;
	    	 }
	    	   else
	    	   {
	    		   return false;
	    	 
	            }
	    	
	     }
	     public String toString() 
		 {
			 return brand+" "+id+" "+imei;
		 }
	}

