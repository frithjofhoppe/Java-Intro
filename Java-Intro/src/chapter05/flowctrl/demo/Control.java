package chapter05.flowctrl.demo;

public class Control {

	/**
	 * Beispiel zu Kontrollstrukturen.
	 */
	public static void main(String[] args) {

		//
		// Verzweigungen
		//
		System.out.println("Verzweigungen:");
		int x = 27;

		// if (einseitige Verzweigung)
		if (x > 100) {
			System.out.println("x ist grösser 100");
		}

		// if - else (zweiseitige Verzweigung)
		if (x > 100) {
			System.out.println("x ist grösser 100");
		} else {
			System.out.println("x ist kleiner/gleich 100");
		}

		// if - else (geschachtelte Verzweigung)
		if (x > 100) {
			System.out.println("x ist grösser 100");
		} else {
			if (x > 50) {
				System.out.println("x ist zwischen 51..100");
			} else {
				System.out.println("x ist kleiner/gleich 50");
			}
		}

		// if - else if (mehrseitige Verzweigung)
		if (x > 100) {
			System.out.println("x ist grösser 100");
		} else if (x > 50) {
			System.out.println("x ist zwischen 51..100");
		} else if (x > 25) {
			System.out.println("x ist zwischen 26..50");
		} else {
			System.out.println("x ist kleiner/gleich 50");
		}

		//
		// Fallauswahl
		//
		System.out.println("\nFallauswahl (switch):");

		// switch
		int note = 5;

		switch (note) {
		case 6:
			System.out.println("ausgezeichnet");
			break;
		case 5:
			System.out.println("gut");
			break;
		case 4:
			System.out.println("genügend");
			break;
		default:
			System.out.println("ungenügend oder ungültig");
			break;
		}

		// switch mit String (seit Java 7)
		String tag = "Do";
		switch (tag) {
		case "Mo":
			System.out.println("Heute ist Montag");
			break;
		case "Di":
			System.out.println("Heute ist Dienstag");
			break;
		case "Mi":
			System.out.println("Heute ist Mittwoch");
			break;
		case "Do":
			System.out.println("Heute ist Donnerstag");
			break;
		case "Fr":
			System.out.println("Heute ist Freitag");
			break;
		default:
			System.out.println("Heute ist Wochenende");
			break;
		}
	
	}
}
