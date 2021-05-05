package filehandling.com;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class JavaMock implements Serializable
{
 String name;
 int ratings;
 String email;
 JavaMock(String name,int ratings,String email)
 {
 this.name=name;
 this.ratings=ratings;
 this.email=email;
 }
}
public class Program5
{
	public static void main(String[] args) {
		JavaMock j1=new JavaMock("your name",2,"your mail");
		String location="D:/New/MockData.txt";
		File f1=new File(location);
		FileOutputStream fout=null;
		ObjectOutputStream out=null;
		try
		{
			fout=new FileOutputStream(f1);
			out=new ObjectOutputStream(fout);
			out.writeObject(j1);
			System.out.println("object converted and transfered");
		}

catch(Exception e)
{
	e.printStackTrace();
}
finally
{
	try
	{
		fout.flush();
		fout.close();
	}
	catch(IOException e)   
	{
		e.printStackTrace();
	}
	}
}
}
