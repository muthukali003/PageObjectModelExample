package filehandling.com;

import java.io.File;
import java.io.IOException;

public class File1 {
	public static void main(String[] args)
	{
		String location="D:/New/java1.txt";
		File a=new File(location);
		try
		{
		 boolean ref=a.createNewFile();
		 System.out.println("file is created="+ref);
		 }
		catch(IOException e)
		{
			e.printStackTrace();
			System.out.println("wrong location");
		}
		
	}

}
