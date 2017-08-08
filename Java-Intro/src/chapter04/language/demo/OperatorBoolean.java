package chapter04.language.demo;
public class OperatorBoolean {

	/**
	 * Beispiel von Operatoren.
	 * 
	 * <code>
	 * AND
	 * false && false = false
	 * true  && false = false
	 * false && true  = false
	 * true  && true  = true
	 * 
	 * OR
	 * false || false = false
	 * true  || false = true
	 * false || true  = true
	 * true  || true  = true
	 * 
	 * XOR
	 * false ^  false = false
	 * true  ^  false = true
	 * false ^  true  = true
	 * true  ^  true  = false
	 * </code>
	 */
	public static void main(String[] args) {

		// AND
		System.out.println("AND");
		System.out.println("false && false = " + (false && false));
		System.out.println("true  && false = " + (true && false));
		System.out.println("false && true  = " + (false && true));
		System.out.println("true  && true  = " + (true && true));

		// OR
		System.out.println("OR");
		System.out.println("false || false = " + (false || false));
		System.out.println("true  || false = " + (true || false));
		System.out.println("false || true  = " + (false || true));
		System.out.println("true  || true  = " + (true || true));

		// XOR
		System.out.println("XOR");
		System.out.println("false ^  false = " + (false ^ false));
		System.out.println("true  ^  false = " + (true ^ false));
		System.out.println("false ^  true  = " + (false ^ true));
		System.out.println("true  ^  true  = " + (true ^ true));
	}
}
