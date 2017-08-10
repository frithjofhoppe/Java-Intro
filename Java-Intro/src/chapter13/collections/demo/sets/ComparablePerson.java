package chapter13.collections.demo.sets;

public class ComparablePerson extends Person implements
		Comparable<ComparablePerson> {

	public ComparablePerson() {
		super();
	}

	public ComparablePerson(int nr, String firstname, String lastname) {
		super(nr, firstname, lastname);
	}

	@Override
	public int compareTo(ComparablePerson obj) {
		final int LESS = -1;
		final int EQUAL = 0;
		final int GREATER = 1;

		// Wenn obj null ist oder nicht vom gleichen Typ,
		// so ist keine inhaltliche Prüfung möglich
		if (obj == null || this.getClass() != obj.getClass()) {
			return LESS;
		}

		// Wenn obj auf das gleiche Objekt zeigt,
		// dann ist die inhaltliche Prüfung nicht notwendig
		if (this == obj) {
			return EQUAL;
		}

		
		
		// Die inhaltliche Prüfung soll in folgender Reihenfolge
		// gemacht werden: firstname, lastname, nr
		//
		// Die Felder firstname und lastname sind vom Typ String.
		// Die Klasse String stellt bereits eine compareTo Methode
		// zur Verfügung, diese kann wiederverwendet werden
		//
		// Das Feld nr ist vom Typ int. Hier können die Werte
		// direkt vergleicht werden.
		int result;

		result = this.firstname.compareTo(obj.firstname);
		if (result != EQUAL) {
			return result;
		}

		result = this.lastname.compareTo(obj.lastname);
		if (result != EQUAL) {
			return result;
		}

		if (this.nr < obj.nr) {
			return LESS;
		}

		if (this.nr > obj.nr) {
			return GREATER;
		}

		// Alle Felder sind gleich.
		return EQUAL;
	}
}
