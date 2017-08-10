package chapter17.streams.exercise;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class PersonWriter
{
	public void writePersons(List<Person> persons)
	{
		try
		{
			String file = "src/chapter17/streams/exercise/personen.txt";
			
			BufferedWriter bf = new BufferedWriter(new FileWriter(file));
			
			System.out.println("Datei <"+file+"> mit folgendem Inhalt wurde erstellt:");
			
			for(Person p: persons)
			{
				bf.write(p.toString() + "\r\n");
				System.out.println(p.toString());
			}
			bf.close();
		}catch(IOException e)
		{
			System.out.println("EXCEPTION: SChreibFehler");
		}
	}
}
