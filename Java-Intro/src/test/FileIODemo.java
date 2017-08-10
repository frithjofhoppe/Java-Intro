package test;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class FileIODemo
{

	public static void main(String[] args)
	{

		try{
		File f1 = new File("F:\\Beruf\\BIT\\JavaKurs\\test\\textfiles\\v2.txt");
		RandomAccessFile ra1 = new RandomAccessFile(f1,"rw");
		}
		catch(IOException e)
		{
			
		}
		
		
		
	}

}
