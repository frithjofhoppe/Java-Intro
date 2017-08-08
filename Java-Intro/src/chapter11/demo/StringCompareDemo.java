package chapter11.demo;

public class StringCompareDemo {

	public static void main(String[] args) {

		String s1 = "String Compare";
		String s2 = "String Compare";
		String s3 = s1;
		String s4 = new String("String Compare");

		System.out.println(s1.equals(s2)); // liefert true
		System.out.println(s1.equals(s3)); // liefert true
		System.out.println(s1.equals(s4)); // liefert true

	}
}
