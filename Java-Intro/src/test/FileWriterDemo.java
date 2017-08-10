package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo
{

	public static void main(String[] args)
	{
//		try(FileWriter fw = new FileWriter("F:\\Beruf\\BIT\\JavaKurs\\test\\textfiles\\v2.txt"))
//		{
//			fw.write("ERsteZeile");
//			fw.write("zweiteZeile");
//			fw.write("Dritte Zeile");
//		}
//		catch(IOException e)
//		{
//			System.out.println(e.toString());
//		}
		
		try
		{
			BufferedWriter bw = new BufferedWriter(new  FileWriter("F:\\Beruf\\BIT\\JavaKurs\\test\\textfiles\\v2.txt"));
			bw.newLine();
			bw.write("ErsteZeile");
			bw.newLine();
			bw.write("ZweiteZeile");
			bw.close();
			
			System.out.println("Dateien wrude geschrieben");
		}
		catch(IOException e)
		{
			
		}
		
		try
		{
			BufferedReader br = new BufferedReader(new FileReader("F:\\Beruf\\BIT\\JavaKurs\\test\\textfiles\\v2.txt"));
			
			String line = "";
			line = br.readLine();
			
			while(line != null)
			{
				System.out.println(line);
				line = br.readLine();
			}
			br.close();
			
		} catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
