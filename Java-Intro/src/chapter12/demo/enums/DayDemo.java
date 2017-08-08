package chapter12.demo.enums;

public class DayDemo {

	public static void main(String[] args) {

		Day today = Day.MONDAY;
		Day tomorrow = Day.TUESDAY;

		System.out.println(today); // Ausgabe MONDAY
		System.out.println(today.name()); // Ausgabe MONDAY
		System.out.println(today.ordinal()); // Ausgabe: 0

		System.out.println(tomorrow); // Ausgabe THUESDAY
		System.out.println(tomorrow.ordinal()); // Ausgabe: 1
	}

}
