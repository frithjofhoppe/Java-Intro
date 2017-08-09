package chapter11.exercise;

import chapter17.streams.demo.standard.Reader;

public class WordCount {

	public static void main(String[] args) {
		
		String input = Reader.readln();
	
		String[] inputArray = input.split("\\s+");
		
		System.out.println("Anzahl Wörter:"+inputArray.length);
	
	}
}
