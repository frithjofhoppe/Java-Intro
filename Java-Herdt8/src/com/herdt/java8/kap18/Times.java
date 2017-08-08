package com.herdt.java8.kap18;
import java.time.*;
import java.time.temporal.*;

class Times
{
	public static void main(String[] args)
	{
		LocalTime rightNow = LocalTime.now();
		LocalTime bedTime = LocalTime.of(23, 00);
		LocalTime standUp = bedTime.plusHours(8);
		if (rightNow.isAfter(bedTime) && rightNow.isBefore(standUp))
		  System.out.println("Es ist Schlafenszeit...");
		else
		{
			long hoursUntilBed = rightNow.until(bedTime, ChronoUnit.HOURS);
			System.out.println("Es sind noch ca. " + hoursUntilBed + " Stunden bis zur Schlafenszeit.");
		}
 	}
}