package chapter06.oo.exercise;

import java.util.ArrayList;

public class MathUtil {

	
	
	public static int max(ArrayList<Integer> werte)
	{
		int max = -1000000;
		
		for(int i: werte)
		{
			if(i > max);
			{
				max = i;
			}
		}
		
		return max;
	}
	
	public static int min(ArrayList<Integer> werte)
	{
		int min = 100000000;
		
		for(int i: werte)
		{
			if(i <= min);
			{
				min = i;
			}
		}
		
		return min;
	}
	
	/*
	public String maximum()
	{
		return "Das Maximum von "+werte.get(0)+", "+werte.get(1)+", "+werte.get(2)+" ist "+max();
	}
	
	public String minimum()
	{
		return "Das Minimum von "+werte.get(0)+", "+werte.get(1)+", "+werte.get(2)+" ist "+min();
	}*/
	
}
