package chapter16.files.io.demo;

import java.io.File;

public class FileListDemo {

	public static void listFiles(File directory, int ident) {

		String[] list = directory.list();

		for (String fileName : list) {

			for (int i = 0; i < ident; i++) {
				System.out.print("  ");
			}

			File child = new File(directory, fileName);

			if (child.isDirectory()) {
				System.out.println(fileName + ":");
				listFiles(child, ++ident);
				ident--;
			} else {
				System.out.println(fileName);
			}
		}
	}

	/**
	 * Das Programm listet alle Dateien für das angegebene Verzeichnis und alle
	 * darin enthaltenen Unterverzeichnisse auf.
	 */
	public static void main(String[] args) {

		// create file
		String dirName = "src" + File.separator + "chapter16" + File.separator
				+ "files" + File.separator + "io" + File.separator + "demo";

		File file = new File(dirName);

		// check directory
		if (!file.isDirectory()) {
			System.out.println("The given path " + dirName
					+ " doesn't exist or is not a directory!");
			System.exit(-1);
		}

		// list files
		System.out.println("Files of directory: " + file.getAbsolutePath()
				+ ":");
		listFiles(file, 1);
	}

}
