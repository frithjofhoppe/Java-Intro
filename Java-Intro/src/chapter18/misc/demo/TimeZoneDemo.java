package chapter18.misc.demo;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Map.Entry;

class TimeZoneDemo {

	public static void main(String[] args) {

		// time zones (short id and id)
		System.out.println("Time zones with short id and id:");
		for (Entry<String, String> entry : ZoneId.SHORT_IDS.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		System.out.println();

		// date time with time zone
		System.out.println("DateTime with time zone:");
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("Local DateTime      = " + localDateTime);

		ZoneId zone = ZoneId.of("Europe/Berlin");
		ZonedDateTime zonedDateTime = localDateTime.atZone(zone);
		System.out.println("Europe/Berlin       = " + zonedDateTime);

		// local time in california
		zone = ZoneId.of("America/Los_Angeles");
		zonedDateTime = localDateTime.atZone(zone);
		System.out.println("America/Los_Angeles = " + zonedDateTime);

	}
}