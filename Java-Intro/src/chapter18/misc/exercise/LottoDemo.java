package chapter18.misc.exercise;

public class LottoDemo {

	public static void main(String[] args) {

		Lotto l1 = new Lotto();
		
		System.out.println("LottoZahlen:");
		
		for(int i: l1.draw())
		{
			System.out.println(i );
		}
		
	}

}
