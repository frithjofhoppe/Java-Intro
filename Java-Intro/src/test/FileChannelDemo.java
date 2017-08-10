
package test;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardOpenOption.READ;
import static java.nio.file.StandardOpenOption.WRITE;

import util.Reader;

public class FileChannelDemo {

	public static void main(String[] args) {

		String filePath = "C:\\Users\\u4402\\Desktop\\newfolder\\test.txt";

		Path file = Paths.get(filePath);
//
//		// System.out.println("Welche datei möchten sie beschreiben");
////		filePath = Reader.readln("Welche Datei möchten sie erstellen");
//
//		try {
//			if (!Files.exists(file)) {
//				Files.createFile(file);
//				
//				if(Files.exists(file))
//				{
//					System.out.println("Die Datei wurde erfolgreich erstellt");
//				}
//			}
//		} catch (IOException e) {
//			System.out.println(e.toString());
//		}
		
		String input = Reader.readln("safasdfsdf");
		input+="\n";
		
		try(FileChannel fc = (FileChannel.open(file,READ,WRITE)))
		{
			
			byte[] data = input.getBytes();
			
			ByteBuffer bb = ByteBuffer.wrap(data);
			fc.write(bb, fc.size());
			
			System.out.println("Die Dateigrösse ist:"+fc.size()+"n");
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
			System.out.println("Fehler");
		}
		
		System.out.println("\n Ausgabe\n");
		
		try(FileChannel fc = (FileChannel.open(file,READ,WRITE)))
		{
			fc.position(0);
			
			ByteBuffer bb = ByteBuffer.allocate((int) fc.size());
			fc.read(bb);
			
			System.out.println(new String(bb.array()));
		}
		catch(Exception e)
		{
			
		}

	}

}
