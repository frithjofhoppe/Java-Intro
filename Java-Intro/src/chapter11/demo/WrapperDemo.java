package chapter11.demo;

class WrapperDemo {

	public static void main(String[] args) {

		// neues Integer-Objekt mit dem Wert 10 erzeugen
		Integer i1 = new Integer(10);

		// neues Integer-Objekt mit dem Wert 24 erzeugen
		Integer i2 = Integer.valueOf("24");

		// gespeicherten int-Wert von i1 liefern
		int i = i1.intValue();

		// Stringkonvertierung nach int
		int j = Integer.parseInt("35");

		// Umwandlung einer int-Zahl in einen String
		String s = Integer.toString(74);

		System.out.println(i1.toString());
		System.out.println(i2.toString());
		System.out.println(i);
		System.out.println(j);
		System.out.println(s);
	}
}
