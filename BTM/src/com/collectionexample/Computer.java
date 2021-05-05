package com.collectionexample;

public class Computer {
	int ram;
	int noOfProcessors;
	String name;
	int hardDiskMemory;
	Computer(int ram,int noOfProcessors,String name,int hardDiskMemory)
	{
		this.ram=ram;
		this.noOfProcessors=noOfProcessors;
		this.name=name;
		this.hardDiskMemory=hardDiskMemory;
	}
     @Override
	public String toString()
	{
	    return "ram="+ram+" "+"noOfProcessors="+noOfProcessors+" "+"name="+name
				+" "+"hardDiskMemory="+hardDiskMemory;
	//	return "Computer[ram="+ram+" "+"noOfProcessors="+noOfProcessors+" "
		//	+"name="+name+" "+"hardDiskMemory="+hardDiskMemory]";
    	// return "Computer[ram="+ram+",noOfProcessors="+noOfProcessors+","
    	 //		+ "name="+name+",hardDiskMemory="+hardDiskMemory+"]";
    	 		
	}
/*	@Override
	public int hashCode()
	{
		return 20;
	}*/

}
/*Computer[ram=4,noOfProcessors=2,name=yourcomputer,hardDiskMemory=500
Computer[ram=4,noOfProcessors=4,name=friendscomputer,hardDiskMemory=1000
Computer[ram=3,noOfProcessors=4,name=mycomputer,hardDiskMemory=2563
Computer[ram=2,noOfProcessors=5,name=theircomputer,hardDiskMemory=2563
Computer[ram=1,noOfProcessors=2,name=thiscomputer,hardDiskMemory=256
*/
/*Computer[ram=4 noOfProcessors=2 name=yourcomputer hardDiskMemory=500
Computer[ram=4 noOfProcessors=4 name=friendscomputer hardDiskMemory=1000
Computer[ram=3 noOfProcessors=4 name=mycomputer hardDiskMemory=2563
Computer[ram=2 noOfProcessors=5 name=theircomputer hardDiskMemory=2563
Computer[ram=1 noOfProcessors=2 name=thiscomputer hardDiskMemory=256*/

/*Computer[ram=4,noOfProcessors=2,name=yourcomputer,hardDiskMemory=500]
Computer[ram=4,noOfProcessors=4,name=friendscomputer,hardDiskMemory=1000]
Computer[ram=3,noOfProcessors=4,name=mycomputer,hardDiskMemory=2563]
Computer[ram=2,noOfProcessors=5,name=theircomputer,hardDiskMemory=2563]
Computer[ram=1,noOfProcessors=2,name=thiscomputer,hardDiskMemory=256]*/

/*ram=4 noOfProcessors=2 name=yourcomputer hardDiskMemory=500
ram=4 noOfProcessors=4 name=friendscomputer hardDiskMemory=1000
ram=3 noOfProcessors=4 name=mycomputer hardDiskMemory=2563
ram=2 noOfProcessors=5 name=theircomputer hardDiskMemory=2563
ram=1 noOfProcessors=2 name=thiscomputer hardDiskMemory=256*/
