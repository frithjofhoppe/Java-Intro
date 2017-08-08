package chapter11.demo;

public class StringPoolDemo {

	public static void main(String[] args) {

		String s1 = "String Pool";
		String s2 = "String Pool";
		String s3 = s1;
		String s4 = new String("String Pool");

		System.out.println(s1 == s2); // liefert true
		System.out.println(s1 == s3); // liefert true
		System.out.println(s1 == s4); // liefert false

	}

}
