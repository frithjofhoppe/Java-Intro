package chapter18.misc.demo;

import java.time.LocalDate;
import java.time.Period;

class LocalDateDemo {
	public static void main(String[] args) {

		LocalDate today = LocalDate.now();
		System.out.println("today        = " + today);

		LocalDate javaBirthday = LocalDate.of(1995, 5, 23);
		System.out.println("javaBirthday = " + javaBirthday);

		Period javaLiveTime = Period.between(javaBirthday, today);
		System.out.println("javaLiveTime = " + javaLiveTime.getYears() + " Jahre, " + javaLiveTime.getMonths()
				+ " Monate und " + javaLiveTime.getDays() + " Tage");

		// LocalDate ed = LocalDate.ofEpochDay(15);
		// System.out.println(ed.toString());
	}
}