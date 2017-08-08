package chapter08.inheritance.demo3;

public class ArtikelDemo {

	public static void main(String[] args) {

		Artikel a1 = new Artikel(4711, 12.50);
		Artikel a2 = new Artikel(4712, 12.50);
		Artikel a3 = (Artikel) a1.clone();

		System.out.println("a1.equals(a2) ergibt : " + a1.equals(a2));
		System.out.println("a1.equals(a3) ergibt : " + a1.equals(a3));
	}
}
