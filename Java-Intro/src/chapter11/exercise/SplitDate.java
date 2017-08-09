package chapter11.exercise;

import java.util.ArrayList;

import chapter17.streams.demo.standard.Reader;

public class SplitDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Datum eingeben");
		String input = Reader.readln();
		String [] output = datumAuswerten(input);
		
		
		System.out.println("day:" +output[0]);
		System.out.println("month:" +output[1]);
		System.out.println("year:" +output[2]);
		
	}
	
	private static String[] datumAuswerten(String datum)
	{
		String[] separatedDate = null;
		
		if(datum != null)
		{
			separatedDate = datum.split("\\.");
		}
		
		return separatedDate;
	}
	
	private static boolean dateIsCorrect(String[] input)
	{
		boolean r = false;
		
		if(input.length == 3)
		{
			//if(input[0] > 0 && input[0] >=)
		}
		
		return r;
	}

}
