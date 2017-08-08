package chapter18.misc.demo;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

class TemporalAdjustorDemo {

	public static void main(String[] args) {

		LocalDate firstMondayOf2015 = LocalDate.of(2015, 1, 1).with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY));

		System.out.println("firstMondayOf2015 = " + firstMondayOf2015);
	}
}