package com.herdt.java8.kap18;
import java.time.*;
import java.time.temporal.*;

class DateAdjuster
{
	public static void main(String[] args)
	{
		LocalDate firstMonday = LocalDate.of(2015, 1, 1). with(
			TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY));
		System.out.println(firstMonday.toString());
 	}
}