package chapter16.files.nio.exercise;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import static java.nio.file.StandardOpenOption.READ;
import static java.nio.file.StandardOpenOption.WRITE;

public class SquareNumbers {

	public static void main(String[] args) {

		Path file = Paths.get("C:\\Users\\u4402\\Desktop\\newfolder\\square.txt");

		if (!Files.exists(file)) {
			try {
				Files.createFile(file);

				if (Files.exists(file)) {
					System.out.println("Die Datei wurde in:" + file.getFileName());
				}
			} catch (IOException e) {
				System.out.println(e.toString());
			}
		} else if (Files.exists(file)) {

			int position = 0;
			
			try (FileChannel fc = (FileChannel.open(file, READ, WRITE))) {

				ArrayList<String> text = new ArrayList<String>();
				
				text = sqaureText();
				
				for (String s : text) {
					byte[] data = s.getBytes();
					ByteBuffer bb = ByteBuffer.wrap(data);
					fc.write(bb, fc.size());
					System.out.println(s);
					position++;
				}
			} catch (IOException e) {
				System.out.println("Problem bei Eintrag: "+position);
				System.out.println(e.toString());
			}

		}

	}

	public static ArrayList<String> sqaureText() {
		ArrayList<String> output = new ArrayList<String>();

		double factor = 1;

		while (factor < 1000) {
			output.add("Das Quadrat von >" + factor + "< lautet: " + (factor * factor) + "\n");
			System.out.println("Das Quadrat von >" + factor + "< lautet: " + (factor * factor) + "\n");
			
			factor++;
		}

		return output;
	}

}
