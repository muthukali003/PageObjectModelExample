package filehandling.com;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter1 {
		public static void main(String[] args)
		{
			String username="username";
			String password="password";
			String location="D:/New/java1.txt";
			File f1=new File(location);
			FileWriter fout=null;
			try
			{
			 fout=new FileWriter(f1);
			 fout.write(username+"\r\n");
			 fout.write(password);
			 System.out.println("data transfered");
			 }
			catch(IOException e)
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
