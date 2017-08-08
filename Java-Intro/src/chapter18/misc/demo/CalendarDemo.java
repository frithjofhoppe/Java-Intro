package chapter18.misc.demo;

import static java.util.Calendar.DATE;
import static java.util.Calendar.DAY_OF_MONTH;
import static java.util.Calendar.DAY_OF_WEEK;
import static java.util.Calendar.DAY_OF_WEEK_IN_MONTH;
import static java.util.Calendar.DAY_OF_YEAR;
import static java.util.Calendar.DST_OFFSET;
import static java.util.Calendar.ERA;
import static java.util.Calendar.FRIDAY;
import static java.util.Calendar.HOUR_OF_DAY;
import static java.util.Calendar.MINUTE;
import static java.util.Calendar.MONDAY;
import static java.util.Calendar.MONTH;
import static java.util.Calendar.SATURDAY;
import static java.util.Calendar.SECOND;
import static java.util.Calendar.SUNDAY;
import static java.util.Calendar.THURSDAY;
import static java.util.Calendar.TUESDAY;
import static java.util.Calendar.WEDNESDAY;
import static java.util.Calendar.WEEK_OF_MONTH;
import static java.util.Calendar.WEEK_OF_YEAR;
import static java.util.Calendar.YEAR;
import static java.util.Calendar.ZONE_OFFSET;

import java.util.GregorianCalendar;

class CalendarDemo {

	static void printCal(GregorianCalendar gCal) {

		System.out.println("----------------------------------------");

		System.out.printf("%s, der %d.%d.%d   Zeit: %d:%d:%d%n",
				dayOfWeek(gCal), gCal.get(DATE), gCal.get(MONTH) + 1,
				gCal.get(YEAR), gCal.get(HOUR_OF_DAY), gCal.get(MINUTE),
				gCal.get(SECOND));

		System.out.println("----------------------------------------");

		System.out.printf("Tag der Woche: %d%n", gCal.get(DAY_OF_WEEK));
		System.out.printf("Tag des Monats: %d%n", gCal.get(DAY_OF_MONTH));
		System.out.printf("Tag des Jahres: %d%n", gCal.get(DAY_OF_YEAR));
		System.out.printf("Der Tag liegt in der %d. Woche des Monats%n",
				gCal.get(DAY_OF_WEEK_IN_MONTH));
		System.out.printf("Woche des Monats: %d%n", gCal.get(WEEK_OF_MONTH));
		System.out.printf("Woche des Jahres: %d%n", gCal.get(WEEK_OF_YEAR));

		String area;
		if (gCal.get(ERA) == gCal.AD)
			area = "Anno Domini";
		else
			area = "before Christ";
		System.out.printf("Aera: %s%n", area);

		System.out.printf("Zeitzonenverschiebung: %d Stunde(n)%n",
				gCal.get(ZONE_OFFSET) / 3600000);

		System.out.printf("Sommerzeit: %d Stunde%n",
				gCal.get(DST_OFFSET) / 3600000);

		System.out.println();
	}

	static String dayOfWeek(GregorianCalendar gCal) {
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