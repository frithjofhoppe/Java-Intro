package chapter12.demo.arrays;

public class OutOfBoundDemo {

	public static void main(String[] args) {

		String[] name = new String[2]; // Array name mit 2 Elementen

		name[0] = "Max";
		System.out.println(name[0]);

		name[1] = "Moritz";
		System.out.println(name[1]);

		try {
			name[2] = "Wittwe Bolte"; // ArrayIndexOutOfBoundException
			System.out.println(name[2]);

		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
