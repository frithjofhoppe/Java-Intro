package chapter16.files.io.demo;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

public class FileDemo {

	public static void main(String[] args) throws URISyntaxException {

		//
		// Verzeichnis erstellen
		// (relativer Pfad chaper15.files.data im Eclipse Projekt definieren)
		String dirName = "src" + File.separator + "chapter16" + File.separator
				+ "files" + File.separator + "io" + File.separator + "demo" + File.separator + "data";

		File dir = new File(dirName);

		if (dir.exists()) {
			System.out.println("Verzeichnis " + dir.getPath()
					+ " existiert bereits.");
		} else {
			dir.mkdir();
			System.out.println("Verzeichnis " + dir.getPath()
					+ " wurde neu erstellt.");
		}

		//
		// Datei erstellen
		//
		String fileName = dirName + File.separator + "infos.txt";

		File file = new File(fileName);

		if (file.exists()) {
			System.out.println("Datei " + file.getPath()
					+ " existiert bereits.");
		} else {
			try {
				file.createNewFile();
				System.out.println("Datei " + file.getPath()
						+ " wurde neu erstellt.");
			} catch (IOException ex) {
				System.out.println("Failed with IOException: " + ex.toString());
				return;
			}
		}

		//
		// Datei Informationen ausgeben
		//
		System.out.print("Der Pfad der Datei " + file.getName() + " lautet: \n");
		System.out.println(file.getAbsolutePath());

	}
}
