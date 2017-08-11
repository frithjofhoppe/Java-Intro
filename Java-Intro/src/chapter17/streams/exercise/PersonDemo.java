package chapter17.streams.exercise;

import java.util.ArrayList;
import java.util.List;

public class PersonDemo
{

	public static void main(String[] args)
	{
		
		PersonReader pr = new PersonReader();
		PersonWriter pw = new PersonWriter();
		
		List<Person> toSave = new ArrayList<Person>();

		toSave = pr.readPersons();
		
		pw.writePersons(toSave);
	}

}
