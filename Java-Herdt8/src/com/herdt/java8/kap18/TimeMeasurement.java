package com.herdt.java8.kap18;
import java.time.*;

/*
ACHTUNG:
Beachten Sie, dass das Programm je nach Hardwareausstattung
einige Zeit benötigt. Verringern Sie gegebenenfalls die
Anzahl der Durchläufe.
*/

class TimeMeasurement
{
  public static void main(String[] args)
  {
    String s1 = "X";
    StringBuffer sb = new StringBuffer("X");
    Instant start, end;
	Duration timeElapsed;

	start = Instant.now();								// Anfangszeit
    for (int i = 0; i < 30000; i++)
      s1 = s1 + "X";
	end = Instant.now();								// Endzeit
	timeElapsed = Duration.between(start, end);		// Dauer
	long millis = timeElapsed.toMillis();
	System.out.println("Zeitdauer in Millisekunden: " + millis);
    System.out.println("Laenge des Strings: " + s1.length());

    start = start = Instant.now();
    for (int i = 0; i < 30000; i++)
      sb.append("X");
	end = Instant.now();
	timeElapsed = Duration.between(start, end);
	millis = timeElapsed.toMillis();
	System.out.println("Zeitdauer in Millisekunden: " + millis);
    System.out.println("Laenge des Strings: " + sb.length());
    System.out.println("Groesse des StringBuffers: " + sb.capacity());
  }
}
