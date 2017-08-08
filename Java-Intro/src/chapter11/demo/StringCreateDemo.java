package chapter11.demo;

public class StringCreateDemo {

	public static void main(String[] args) {

		String s1 = "Hallo";
		String s2 = new String("Welt");
		String s3 = s1 + " schöne " + s2;

		System.out.println(s3);
	}

}
