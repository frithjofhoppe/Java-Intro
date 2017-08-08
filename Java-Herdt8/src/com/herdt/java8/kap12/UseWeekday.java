package com.herdt.java8.kap12;
import com.herdt.java8.kap12.Weekday;

public class UseWeekday
{
	public void writeWeekday(Weekday day)
	{
		System.out.println("Heutiger Wochentag: " + day);
    }

	public static void main(String[] args)
	{
		Weekday.writeAllDays();
		UseWeekday instance = new UseWeekday();
		instance.writeWeekday(Weekday.MONDAY);
	}
}