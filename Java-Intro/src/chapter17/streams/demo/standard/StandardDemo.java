package chapter17.streams.demo.standard;

import java.io.IOException;

public class StandardDemo {

	public static void main(String[] args) {
		byte[] b = new byte[1];
		try {
			System.out.print("Bitte geben Sie ein Zeichen ein: ");
			System.in.read(b);
			System.out.println((char) b[0] + " hat den ASCII-Code " + b[0]);
		} catch (IOException io) {
			System.out.println(io.getMessage());
		}
	}

}
