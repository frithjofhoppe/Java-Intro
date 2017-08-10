
public class ExceptionDemo {

	public static void main(String[] args) throws IllegalArgumentException {

		try
		{
		test();
		}
		catch(IllegalArgumentException iae)
		{
			System.out.println("Fehler entdeckt");
		}
		
	}

	
	public static void test() throws IllegalArgumentException {

		try
		
		{
			throw new IllegalArgumentException ("Geplanter Fehler");
		}
		finally
		{
			System.out.println("Abgeschlossen");
		}
		
	}
	
}
