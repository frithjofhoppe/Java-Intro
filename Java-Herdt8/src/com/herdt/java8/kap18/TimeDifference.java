package com.herdt.java8.kap18;
import java.time.*;

class TimeDifference
{
	static void runAdd()
		{
			int i = 0;
			while (i < 1_000_000_000)
			  i++;
	}

	public static void main(String[] args)
	{
		Instant start = Instant.now();
		runAdd();
		Instant end = Instant.now();
		Duration timeElapsed = Duration.between(start, end);
		long millis = timeElapsed.toMillis();
		System.out.println("Zeitdauer in Millisekunden: " + millis);
	}
}