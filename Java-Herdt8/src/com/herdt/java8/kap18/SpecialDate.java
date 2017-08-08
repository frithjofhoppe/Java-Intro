package com.herdt.java8.kap18;
import java.time.*;

class SpecialDate
{
	public static void main(String[] args)
	{
		LocalDate today = LocalDate.now();
		LocalDate javaBirthday = LocalDate.of(1995, 5, 23);
		Period liveTime = Period.between( javaBirthday, today);
		System.out.println("Java wurde veröffentlicht vor: " + liveTime.getYears() + " Jahren, "
		  + liveTime.getMonths() + " Monaten und " + liveTime.getDays() + " Tagen." );
		LocalDate ed = LocalDate.ofEpochDay(15);
		System.out.println(ed.toString());
	}
}