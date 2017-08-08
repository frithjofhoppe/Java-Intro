package meteo.m3;

import java.util.ArrayList;

public class Meteo implements Temperaturen,Kenntage{

	/*public static void main(String[] args) {
		double[] rawWeatherData = { -8.1, -4.5, -2.1, -1.3, -0.1, -2.2, -4.1, 10 };

		System.out.println("Der Mittelwert ist:		" + average(rawWeatherData).get(0)
				+ " Grad Celsius.Diese Temperatur wird als:  " + average(rawWeatherData).get(1) + " eingestuft");
		System.out.println("Die Maximale Temperatur betrug:	" + max(rawWeatherData).get(0)
				+ " Grad Celsius. Dies wird als:		 " + max(rawWeatherData).get(1) + " eingestuft");
		System.out.println("Der minmale Wert betrug: 	" + min(rawWeatherData).get(0)
				+ " Grad Celsius. Dies wird als:		 " + min(rawWeatherData).get(1) + " eingestuft");

	}*/
	
	static double[] werte;
	private static double max;
	private static double min;
	private static double avg;
	static String[] werteInfos = new String[3];
	
	Meteo(double[] werte)
	{
		this.werte = werte;
		
		max = getMax();
		min = getMin();
		avg = getMittelWert();
		tempCheck();
	}
	
	public boolean isTropenNacht()
	{
		boolean r = false;
		
		if (min < 12) {
			werteInfos[1]="Tropennacht";
			r = true;
		}
		return r;
	}
	
	public boolean isVegetationsTag()
	{
		boolean r = false;
		
		if (min >= 5) {
			werteInfos[1]="Vegetationstag";
			r = true;
		}
		
		return r;
	}
	
	public boolean isFrostTag()
	{
		boolean r = false;
		
		if (min < 0) {
			werteInfos[1]="Frosttag";
		}
		
		return r;
	}
	
	public boolean isHeizTag()
	{
		boolean r = false;
		
		if (avg < 12) {
			werteInfos[2]="Heiztag";
			r = true;
		}
		
		return r;
	}
	
	public boolean isWuestenTag()
	{
		boolean r = false;
		
		if (max >= 35) {
			werteInfos[0]="Wüstentag";
			r = true;
		}
		
		return r;
	}
	
	public boolean isHeisserTag()
	{
		boolean r = false;
		
		 if (max >= 30) {
				werteInfos[0]="Heisser Tag";
				r = true;
		 }
		 
		 return r;
	}
	
	public boolean isSommerTag()
	{
		boolean r = false;
		
		if (max >= 25) {
			werteInfos[0]="Sommertag";
		}
			
		return r;
	}
	
	public double getMittelWert() {
		double infos = 0;
		double back = 0;
		String add = "-";

		if (werte != null) {

			for(int i = 0; i < werte.length; i++)
			{
				back += werte[i];
			}

			back /= werte.length;

			
		}
		return back;
	}

	public double getMax() {
		double infos;
		double back = -100;
		String add = "-";

		if (werte != null) {
			for(int i = 0; i < werte.length;i++)
			{
				if(werte[i] > back)
				{
					back = werte[i];
				}
			}

		}

		return back;
	}

	public double getMin() {
		double back = Double.MAX_VALUE;
		String add = "-";

		if (werte != null) {
			for (int i = 0; i < werte.length; i++) {
				if (werte[i] <= back) {
					back = werte[i];
				}
			}

		}
		return back;
	}
	
	private void tempCheck()
	{
		if (isTropenNacht()) {};
		if (isVegetationsTag()) {};
		if (isFrostTag()){};
		if (isHeizTag()){};
		if (isWuestenTag()){};
		if (isHeisserTag()){};
		if (isSommerTag()){};
	}
	
	public static void printKenntage(Meteo meteo)
	{
		String print ="";
		
		print += "-MIN :" + min +", Einstufung:"+werteInfos[1];
		print += "\n-MAX :"+max +", Einstufung:"+werteInfos[0];
		print += "\n-AVG :"+avg +", Einstufung:"+werteInfos[2];
		print += "\n\n";
		
	}

	@Override
	public double[] getTemperaturen() {
		// TODO Auto-generated method stub
		return null;
	}


	
}
