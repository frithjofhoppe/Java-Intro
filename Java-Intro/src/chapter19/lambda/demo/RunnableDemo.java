package chapter19.lambda.demo;

/**
 * Lambda Expression Demo.
 */
public class RunnableDemo {

	public static void main(String[] args) {

		// Anonyme Klasse die das Interface Runnable implementiert.
		// Das Interface hat die Methode: void run();
		// Die run Methode hat keine Parameter und gibt keinen Wert zurück.
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				System.out.println("Hello world.");
			}
		};

		r1.run();

		// Lambda Ausdruck anstelle der anonymen Klasse.
		// Der Ausdruck hat keine Parameter und gibt keinen Wert zurück.
		Runnable r2 = () -> System.out.println("Hello lambda world!");

		r2.run();
	}

}
