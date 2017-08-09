package chapter11.exercise;

public class Compare {

	public static void main(String[] args) {
		
		String name1="mans";
		String name2="Hans";
		String s;
		
		if(name1.compareTo(name2) < 0)
		{
			s = name1 + "\n" +name2; 
		}
		else if(name1.compareTo(name2) == 0 )
		{
			s = "Gleichgros";
		}
		else
		{
			s = name2 + "\n" +name1;
		}
		
		System.out.println(s.toLowerCase());
	
	}

}
