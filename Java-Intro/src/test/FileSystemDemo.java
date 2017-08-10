package test;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileSystemDemo {

	public static void main(String[] args) {

		Path path = Paths.get("C:\\Users\\u4402\\Desktop\\newfolder");
		
		System.out.println(path.toString());
	
		if(!Files.exists(path))
		{	
			
			
			try {
				Files.createDirectories(path);
				
				if(Files.exists(path))
				{
					System.out.println("Verzeichnis wurde erstellt");
				}
				
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
		else
		{
			try {
				Files.delete(path);
				
				if(!Files.exists(path))
				{
					System.out.println("Verzeichnis wrude entfernt");
				}
				
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
	}

}
