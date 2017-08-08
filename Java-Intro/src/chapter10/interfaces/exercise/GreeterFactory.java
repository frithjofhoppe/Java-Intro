package chapter10.interfaces.exercise;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GreeterFactory {

	private GreeterFactory() {
		super();
	}

	public static Greeter create() {
		if (isWeekend()) {
			return new WeekendGreeter();
		} else {
			return new PersonalGreeter();
		}
	}

	private static boolean isWeekend() {
		Calendar cal = new GregorianCalendar();

		int day = cal.get(Calendar.DAY_OF_WEEK);

		if (day == Calendar.SUNDAY || day == Calendar.SATURDAY) {
			return true;
		}
		
		return false;
	}

}
