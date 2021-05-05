package filehandling.com;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileRead1 {
			public static void main(String[] args)
			{
				String location="D:/New/java1.txt";
				File f1=new File(location);
				FileReader fr=null;
				try
				{
				 fr=new FileReader(f1);
				 int a=fr.read();
				 while(a!=-1)
				 {
					 
				 System.out.print ((char)a);
				 a=fr.read();
				 }
				}
				catch(FileNotFoundException e)
				{
					e.printStackTrace();
				}
				catch(IOException e)
				{
					e.printStackTrace();
				}
				finally
				{
					try
					{
					fr.close();
					}
					catch(IOException e)
					{
						e.printStackTrace();
				}
			}
		}
	}



