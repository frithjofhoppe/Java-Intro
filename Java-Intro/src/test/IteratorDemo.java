package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {

	public static void main(String[] args) {

		ArrayList<String> array = new ArrayList<String>();
		
		
		
		array.add(new String("a"));
		array.add(new String("b"));
		array.add(new String("c"));
		array.add(new String("d"));
		array.add(new String("e"));
		
		ListIterator<String> iter = array.listIterator();
		
		int x = 1;
		
		while(iter.hasNext())
		{
			if(x%2 ==0)
			{
				iter.remove();
			}
			
			iter.next();
			
			x++;
		}
		
		for(String s: array)
		{
			System.out.println(s);
		}
		
	}

}
