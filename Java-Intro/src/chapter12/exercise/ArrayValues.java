package chapter12.exercise;

public class ArrayValues {

	public static void main(String[] args) {

		int[] values = {1,2,3};
		
		for(int i = 0; i < values.length; i++)
		{
			System.out.print("Element "+ i + " = " + values[i] + "\n");
		}
		
		System.out.println("\n");
		
		for(int i = 0; i < values.length; i++)
		{
			System.out.print("Element "+ i + " = " + (values[i] * 2) +"\n");
		}
		
	}

}
