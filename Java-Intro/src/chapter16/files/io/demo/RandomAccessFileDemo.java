package chapter16.files.io.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {

	public static void main(String[] args) {

		RandomAccessFile file = null;

		try {
			// File erstellen
			String dirName = "src" + File.separator + "chapter16"
					+ File.separator + "files" + File.separator + "io"
					+ File.separator + "demo" + File.separator + "data";

			File fileName = new File(dirName + File.separator + "test.dat");

			// RandomAccessFile erstellen
			file = new RandomAccessFile(fileName, "rw");

			// Datei schreiben
			file.writeBytes("AAAAA\nBBBBB\nCCCCC\n");
			System.out.println("Laenge der Datei:\n" + file.length());

			// Laenge des Files wird auf 12 reduziert
			file.setLength(12);
			System.out.println("Laenge der Datei nach Reduktion:\n"
					+ file.length());

			// Inhalt ausgeben
			file.seek(0);
			System.out.println("Ausgabe der Testdaten nach erstem Mal lesen:");
			for (int i = 1; i <= 2; i++) { // 2 Zeilen lesen
				System.out.println(file.readLine());
			}

			// Datei schreiben
			file.writeBytes("DDDDD\nEEEEE\nFFFFF\n");

			// Inhalt ausgeben
			file.seek(0);
			System.out.println("Ausgabe der Testdaten nach zweitem Mal lesen:");
			for (int i = 1; i <= 5; i++) { // 5 Zeilen lesen
				System.out.println(file.readLine());
			}

		} catch (FileNotFoundException fnf) {
			System.out.println(fnf.getMessage());

		} catch (IOException io) {
			System.out.println(io.getMessage());

		} finally {
			if (file != null) {
				// Datei schliessen
				try {
					file.close();
				} catch (Exception e) {
					// ignore
				}
			}
		}
	}

}
