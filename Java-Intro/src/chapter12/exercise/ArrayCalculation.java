package chapter12.exercise;

public class ArrayCalculation {

	public static void main(String[] args) {

		double[] calcValues = {20, 37, 5, 7, 11, 13};
		
		double max = -1000000;
		double min = 1000000;
		double avg = 0;
		
		for(int i = 0 ; i < calcValues.length;i++)
		{
			avg += calcValues[i];
			
			if(calcValues[i] > max)
			{
				max =calcValues[i];
			}
			
			if(calcValues[i] < min)
			{
				min =calcValues[i];
			}
			
			if(calcValues.length-1 == i)
			{
				avg /= calcValues.length;
			}
		}
		
		System.out.println("MAX: "+max+"\nMIN: "+min+"\nAVG: "+avg);
		
	}

}
