package chapter16.files.nio.demo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileDemo {

	public static final String DIR_NAME = PathDemo.REL_DEMO_PATH + "/data";
	public static final String FILE_NAME = DIR_NAME + "/infos.txt";

	public static void main(String[] args) {

		//
		// Verzeichnis erstellen
		//
		Path dir = Paths.get(DIR_NAME);

		if (Files.exists(dir)) {
			System.out.println("Das Verzeichnis " + dir.toString()
					+ " existiert bereits.");

		} else {
			System.out.println("Das Verzeichnis " + dir.toString()
					+ " wird neu erstellt.");
			try {
				Files.createDirectory(dir);

			} catch (IOException e) {
				System.out
						.println("> IOException bei der Verzeichnis-Erstellung: "
								+ e.toString());
				System.exit(-1);
			}
		}

		//
		// Datei erstellen
		//
		Path file = Paths.get(FILE_NAME);

		if (Files.exists(file)) {
			System.out.println("Die Datei " + file.getFileName()
					+ " existiert bereits.");
		} else {
			System.out.println("Die Datei " + file.toString()
					+ " wird neu erstellt.");
			try {
				Files.createFile(file);
			} catch (IOException e) {
				System.out.println("> IOException bei der Datei-Erstellung: "
						+ e.toString());
				System.exit(-2);
			}
		}

		//
		// Datei Informationen ausgeben
		//
		System.out.print("Der Pfad der Datei " + file.getFileName()
				+ " lautet: \n");
		System.out.println(file.toString());
	}

}
