package chapter03.helloworld.exercise;

public class ReverseArgs {
	public static void main(String[] args) {

		for (int i = args.length-1; i >= 0; i--) {
			System.out.println("Argument #" + i + " = " + args[i]);
		}

		System.out
				.println("Es wurden " + args.length + " Argumente übergeben.");
		
		System.exit(0);
	}
}
