package chapter12.demo.enums;

public class DayDemo2 {

	public static void main(String[] args) {

		// Iteration über alle Werte von Day
		for (Day day : Day.values()) {

			// Auswertung mit switch
			switch (day) {
			case MONDAY:
				System.out.println("Eine neue Woche beginnt");
				break;
			case TUESDAY:
				System.out.println("Die Woche dauert noch so lange");
				break;
			case WEDNESDAY:
				System.out.println("Die Hälfte ist schon fast vorbei");
				break;
			case THURSDAY:
				System.out.println("Heute ist Abendverkauf");
				break;
			case FRIDAY:
				System.out.println("Am Freitag gehen wir ins Kino");
				break;
			case SATURDAY:
			case SUNDAY:
				System.out.println("Yes, weekend!");
				break;
			}
		}
	}

}
