package chapter18.misc.demo;

import java.time.Duration;
import java.time.Instant;

class DurationDemo {

	public static void main(String[] args) throws InterruptedException {

		Instant start = Instant.now();
		Thread.sleep(4000);
		Instant end = Instant.now();

		Duration timeElapsed = Duration.between(start, end);
		System.out.println("Zeitdauer in Millisekunden: " + timeElapsed.toMillis());
	}

} // end