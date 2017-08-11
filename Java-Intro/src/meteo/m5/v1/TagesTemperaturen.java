package meteo.m5.v1;

public class TagesTemperaturen implements Temperaturen {
	
	private double[] tempWerte;
	
	TagesTemperaturen(double[] werte)
	{
		this.tempWerte = werte;
	}

	@Override
	public double[] getTemperaturen() {
		
		return tempWerte;
	}

	@Override
	public double getMittelWert() {
		double average = 0;

		for (
				int i = 0; i < tempWerte.length; i++
		)
		{
			average += tempWerte[i];
		}

		average /= tempWerte.length;

		return average;
	}

	@Override
	public double getMin() {
		double min = 1000000;

		for (
				int i = 0; i < tempWerte.length; i++
		)
		{
			if (tempWerte[i] < min)
			{
				min = tempWerte[i];
			}
		}

		return min;
	}

	@Override
	public double getMax() {
		double max = -1000000;

		for (
				int i = 0; i < tempWerte.length; i++
		)
		{
			if (tempWerte[i] > max)
			{
				max = tempWerte[i];
			}
		}

		return max;
	}

}
