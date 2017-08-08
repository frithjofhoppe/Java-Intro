package com.herdt.java8.kap18;
import java.time.*;
import java.time.format.*;

class FormattedTimes
{
	public static void main(String[] args)
	{
		String formatted;
		DateTimeFormatter formatter;

		LocalDateTime now = LocalDateTime.now();
		ZoneId zone = ZoneId.of("Europe/Berlin");
		ZonedDateTime nowComplete = now.atZone(zone);

		// Standard Formatierer
		formatted = DateTimeFormatter.ISO_DATE_TIME.format(nowComplete);
		System.out.println(formatted);

		// Lokal-spezifischer Formatierer
		formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL);
		formatted = formatter.format(nowComplete);
		System.out.println(formatted);

		// Eigenes Format
		formatter =DateTimeFormatter.ofPattern("E yyyy-MM-dd HH:mm");
		formatted = formatter.format(nowComplete);
		System.out.println(formatted);
 	}
}