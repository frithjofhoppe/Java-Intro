package chapter12.demo.arrays.copy;

public class MitarbeiterDemo {

	public static void main(String[] args) {

		// init
		int len = 3;

		Mitarbeiter[] orig = new Mitarbeiter[len];
		Mitarbeiter[] copy = new Mitarbeiter[len];

		orig[0] = new Mitarbeiter(7, "Max");
		orig[1] = new Mitarbeiter(14, "Moritz");
		orig[2] = new Mitarbeiter(21, "Hans");

		// copy (reference)
		for (int i = 0; i < orig.length; i++) {
			copy[i] = orig[i];
		}

		// change orig
		orig[1].setNr(77);
		orig[1].setName("Fritz");

		// show result
		System.out.println(orig[1].toString()); // Ausgabe ?
		System.out.println(copy[1].toString()); // Ausgabe ?
	}

}
