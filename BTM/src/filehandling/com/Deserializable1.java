package filehandling.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserializable1
{
		public static void main(String[] args) 
		{
			String location="D:/New/MockData.txt";
			File f1=new File(location);
			FileInputStream fin=null;
			ObjectInputStream in=null;
			try
			{
				fin=new FileInputStream(f1);
				in=new ObjectInputStream(fin);
				Object ob=in.readObject();
				JavaMock jref=(JavaMock)ob;
				System.out.println("name="+jref.name);
				System.out.println("ratings="+jref.ratings);
				System.out.println("email="+jref.email);
			}
			catch(FileNotFoundException e)
			{
				e.printStackTrace();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
			catch(ClassNotFoundException e)
			{
				e.printStackTrace();
			}
			finally
			{
				try
				{
					fin.close();
				}
				catch(IOException e)
				{
					e.printStackTrace();
				}
			
			

	catch(Exception e)
	{
		e.printStackTrace();
	}
	}
	}
}

