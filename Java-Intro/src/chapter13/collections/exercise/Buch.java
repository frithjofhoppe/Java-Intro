package chapter13.collections.exercise;

public class Buch implements Comparable<Buch>{

	String title;
	String author;
	int edition;
	
	Buch()
	{
		
	}
	
	@Override
	public int compareTo(Buch obj) {
		
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

		result = this.title.compareTo(obj.title);
		if (result != EQUAL) {
			return result;
		}

		result = this.author.compareTo(obj.author);
		if (result != EQUAL) {
			return result;
		}

		if (this.edition < obj.edition) {
			return LESS;
		}

		if (this.edition > obj.edition) {
			return GREATER;
		}

		// Alle Felder sind gleich.
		return EQUAL;
	}
	
	Buch(String titel, String author, int edition)
	{
		this.title = titel;
		this.author = author;
		this.edition = edition;
	}
	
	public String toString()
	{
		return "'"+title+"' von " +author+", Auflage "+edition+" Stück";
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + edition;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Buch other = (Buch) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (edition != other.edition)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getEdition() {
		return edition;
	}
	public void setEdition(int edition) {
		this.edition = edition;
	}

	
	
}
