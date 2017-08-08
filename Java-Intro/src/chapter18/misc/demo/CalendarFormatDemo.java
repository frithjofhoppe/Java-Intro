package chapter18.misc.demo;

import static java.util.Calendar.DATE;
import static java.util.Calendar.DAY_OF_WEEK;
import static java.util.Calendar.FRIDAY;
import static java.util.Calendar.MINUTE;
import static java.util.Calendar.MONDAY;
import static java.util.Calendar.MONTH;
import static java.util.Calendar.SATURDAY;
import static java.util.Calendar.SUNDAY;
import static java.util.Calendar.THURSDAY;
import static java.util.Calendar.TUESDAY;
import static java.util.Calendar.WEDNESDAY;

import java.util.GregorianCalendar;

class CalendarFormatDemo {

	static void printCal(GregorianCalendar gCal) {

		System.out.println("------------------------------------------");

		System.out.printf(
				"%1$tA, der %1$td.%1$tm.%1$tY Zeit: %1$tH:%1$tM:%1$tS,%1tL",
				gCal);

		System.out.println();

		System.out.println("------------------------------------------");

		System.out.printf("Zeit: %1$tT %n", gCal);
		System.out.printf("Datum: %1$tF %n", gCal);

		System.out.println();
	}

	static String wochentag(GregorianCalendar gCal) {
		switch (gCal.get(DAY_OF_WEEK)) {
		case MONDAY:
			return ("Montag");
		case TUESDAY:
			return ("Dienstag");
		case WEDNESDAY:
			return ("Mittwoch");
		case THURSDAY:
			return ("Donnerstag");
		case FRIDAY:
			return ("Freitag");
		case SATURDAY:
			return ("Samstag");
		case SUNDAY:
			return ("Sonntag");
		default:
			return ("");
		}
	}

	public static void main(String[] args) {
		GregorianCalendar gregCal = new GregorianCalendar(2007, 3, 1, 12, 15,
				30);

		printCal(gregCal);

		gregCal.add(DATE, 40);
		gregCal.add(MINUTE, 75);
		printCal(gregCal);

		gregCal.roll(MONTH, false);
		printCal(gregCal);
	}

}