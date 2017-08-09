package chapter12.exercise;

import java.lang.reflect.Array;

import util.Reader;

public class ArraySearch {

	public static void main(String[] args) {
		
		int[] serach = {0, 10, 12, 4, 7, 21, 20, 13};
		
		System.out.println("Zahl nach der gesucht werden soll");
		String searchString = Reader.readln();
		String output = "";
		
		for(int i = 0; i < serach.length; i++)
		{
			if(Integer.toString(serach[i]).equals(searchString))
			{
				output = Integer.toString(i+1);
			}
		}
		
		if(!output.isEmpty())
		{
			System.out.println("Die position des Zeichnes ist:" + output);
		}
		else
		{
			System.out.println("Der gesucht Inhalt ist nicht vorhanden");
		}
		
	}

}
