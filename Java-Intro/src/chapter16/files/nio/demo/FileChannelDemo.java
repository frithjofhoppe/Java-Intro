package chapter16.files.nio.demo;

import static java.nio.file.StandardOpenOption.READ;
import static java.nio.file.StandardOpenOption.WRITE;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileChannelDemo {

	public static final String DIR_NAME = PathDemo.REL_DEMO_PATH + "/data";
	public static final String FILE_NAME = DIR_NAME + "/test.dat";

	public static void main(String[] args) {

		//
		// Initialisierung
		//
		Path dir = Paths.get(DIR_NAME);
		Path file = Paths.get(FILE_NAME);

		try {
			// Verzeichnis erstellen
			if (!Files.exists(dir)) {
				Files.createDirectory(dir);
			}
			// Datei erstellen
			if (!Files.exists(file)) {
				Files.createFile(file);
			}

		} catch (IOException e) {
			System.out.println("IOException bei der Initialisierung: "
					+ e.toString());
			System.exit(-1);
		}

		//
		// FileChannel Demo
		//
		try (FileChannel fc = (FileChannel.open(file, READ, WRITE))) {
			// reset position
			fc.position(0);

			// write
			byte data[] = "AAAAA\nBBBBB\nCCCCC\n".getBytes();
			ByteBuffer wbuf = ByteBuffer.wrap(data);
			fc.write(wbuf);

			System.out.println("Daten geschrieben, Dateigrösse=" + fc.size());

			// truncate size
			fc.truncate(12);

			System.out.println("Datei verkleinert, Dateigrösse=" + fc.size());

			// read
			ByteBuffer rbuf = ByteBuffer.allocate(12);
			fc.position(0);

			fc.read(rbuf);

			System.out.println();
			System.out.println("Ausgabe Testdaten nach Verkleinerung:");
			System.out.println(rbuf.toString());
			System.out.println(new String(rbuf.array()));

			// write 2 and read again
			byte data2[] = "DDDDD\nEEEEE\nFFFFF\n".getBytes();
			ByteBuffer w2buf = ByteBuffer.wrap(data2);
			fc.write(w2buf);

			ByteBuffer r2buf = ByteBuffer.allocate(100);
			fc.position(0);

			fc.read(r2buf);

			System.out.println("Ausgabe Testdaten nach zweitem write:");
			System.out.println(r2buf.toString());
			System.out.println(new String(r2buf.array()));

		} catch (IOException e) {
			System.out.println("IOException bei der Demo: " + e.toString());
			System.exit(-2);
		}

	}

}
