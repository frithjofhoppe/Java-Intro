package com.herdt.java8.kap16;

import java.io.*;
import java.nio.file.*;

class DirFileOperations
{
	public static void main(String[] args){
		Path file = Paths.get("C:\\java8\\uebungen\\kap16\\uebung.txt");
		Path dir = Paths.get("C:\\java8\\test\\kap16\\uebung.txt");

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
				Files.createDirectories(dir.getParent());
				Files.copy(file, dir);
				Files.delete(file);
			} catch (IOException ex) {
 			   System.err.println(ex);
			}
		}
	}
}