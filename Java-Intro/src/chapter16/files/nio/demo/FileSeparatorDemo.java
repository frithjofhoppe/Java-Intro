package chapter16.files.nio.demo;

import java.io.File;
import java.nio.file.FileSystems;

public class FileSeparatorDemo {

	public static void main(String[] args) {
		
		System.out.println("File Separator:");
		
		// file separator 
		System.out.println("File.separator = " +  File.separator);
		
		// file separator mit Java 7
		System.out.println("FileSystems.getDefault().getSeparator() = " +  FileSystems.getDefault().getSeparator());
	}

}
