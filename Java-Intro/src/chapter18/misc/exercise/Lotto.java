package chapter18.misc.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lotto {

	public List<Integer> draw()
	{
		List<Integer> lottoNumbers = new ArrayList<Integer>();
		boolean isNotFinished = true;
		Random rnd = new Random();
		int actualNumber = 0; 
		int numbercounter = 0;
		
		while(isNotFinished)
		{
			actualNumber = rnd.nextInt(47);
			if(!(lottoNumbers.contains(actualNumber) && actualNumber <= 0))
			{
				lottoNumbers.add(actualNumber);
				numbercounter++;
				
				if(numbercounter == 7)
				{
					isNotFinished = false;
				}
			}
		}
		
		return lottoNumbers;
	}
	
}
