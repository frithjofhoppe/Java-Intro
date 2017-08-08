package com.herdt.java8.kap16;

import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.file.*;
import static java.nio.file.StandardOpenOption.*;

class RandomAccess
{
	public static void main(String[] args){
		Path file = Paths.get("C:\\java8\\uebungen\\kap16\\random.txt");
		String s = ". Zeile!\r\n";
		byte data[];

		if (Files.exists(file))
		{
			System.out.format(file.toString() + " existiert.");
		}
		else
		{
			try
			{
				Files.createDirectories(file.getParent());
				Files.createFile(file);

				try (FileChannel fc = (FileChannel.open(file, READ, WRITE)))
				{
				  fc.position(0);
				  for (int i = 0; i  < 5; i++)
				  {
  				  data = ((i+1) + s).getBytes();
  					ByteBuffer out = ByteBuffer.wrap(data);
  				  while (out.hasRemaining())
  				    fc.write(out);
  				  out.rewind();

					}
				}
				catch (IOException x)
				{
				  System.out.println("I/O Exception: " + x);
				}
			}
			catch (IOException ex)
			{
 			  System.err.println(ex);
			}
		}
	}
}