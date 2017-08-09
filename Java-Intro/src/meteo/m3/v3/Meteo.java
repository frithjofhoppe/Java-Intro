package meteo.m3.v3;

public class Meteo implements Kenntage, Temperaturen
{

	private double[] tempWerte;
	private double maxTemp = 0;
	private double minTemp = 0;
	private double avgTemp = 0;
	TagesTemperaturen tagesTemp;

	Meteo(double[] tempWerte)
	{
		this.tempWerte = tempWerte;

		if (tempWerte != null || tempWerte.length != 0)
		{
			tagesTemp = new TagesTemperaturen(tempWerte);
			
			maxTemp = getMax();
			minTemp = getMin();
			avgTemp = getMittelWert();
		}
	}

	
	
	public double[] getTempWerte()
	{
		return tempWerte;
	}

	@Override
	public boolean isTropenNacht()
	{
		boolean back = false;

		if (minTemp >= 12)
		{
			back = true;
		}

		return back;
	}

	@Override
	public boolean isVegetationsTag()
	{
		boolean back = false;

		if (minTemp >= 5)
		{
			back = true;
		}

		return back;
	}

	@Override
	public boolean isFrostTag()
	{
		boolean back = false;

		if (minTemp < 0)
		{
			back = true;
		}

		return back;
	}
	
	public boolean isEisTag()
	{
		boolean back = false;

		if (maxTemp < 0)
		{
			back = true;
		}

		return back;
	}

	@Override
	public boolean isHeizTag()
	{
		boolean back = false;

		if (avgTemp < 12)
		{
			back = true;
		}

		return back;
	}

	@Override
	public boolean isWuestenTag()
	{
		boolean back = false;

		if (maxTemp >= 35)
		{
			back = true;
		}

		return back;
	}

	@Override
	public boolean isHeisserTag()
	{
		boolean back = false;

		if (maxTemp >= 30)
		{
			back = true;
		}

		return back;
	}

	@Override
	public boolean isSommerTag()
	{
		boolean back = false;

		if (maxTemp >= 25)
		{
			back = true;
		}

		return back;
	}

	@Override
	public double[] getTemperaturen()
	{

		return tempWerte;
	}

	@Override
	public double getMax()
	{
		return tagesTemp.getMax();
		
		/*double max = -1000000;

		for (
				int i = 0; i < tempWerte.length; i++
		)
		{
			if (tempWerte[i] > max)
			{
				max = tempWerte[i];
			}
		}

		return max;*/
	}

	public double getMaxTemp() {
		return maxTemp;
	}



	public double getMinTemp() {
		return minTemp;
	}



	public double getAvgTemp() {
		return avgTemp;
	}



	@Override
	public double getMin()
	{
		return tagesTemp.getMin();
		
		/*double min = 1000000;

		for (
				int i = 0; i < tempWerte.length; i++
		)
		{
			if (tempWerte[i] < min)
			{
				min = tempWerte[i];
			}
		}

		return min;*/
	}

	@Override
	public double getMittelWert()
	{
		
		return tagesTemp.getMittelWert();
		
		/*double average = 0;

		for (
				int i = 0; i < tempWerte.length; i++
		)
		{
			average += tempWerte[i];
		}

		average /= tempWerte.length;

		return average;*/
	}
}
