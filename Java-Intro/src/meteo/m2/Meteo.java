package meteo.m2;

import java.util.ArrayList;

public class Meteo {

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
	
	Meteo(double[] werte)
	{
		this.werte = werte;
	}

	public ArrayList<String> average() {
		ArrayList<String> infos = new ArrayList<String>();
		double back = 0;
		String add = "-";

		if (werte != null) {

			for(int i = 0; i < werte.length; i++)
			{
				back += werte[i];
			}

			back /= werte.length;
			infos.add(Double.toString(back));

			if (back < 12) {
				add = "Heiztag";
				infos.add(add);
			}
		}
		return infos;
	}

	public ArrayList<String> max() {
		ArrayList<String> infos = new ArrayList<String>();
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

			infos.add(Double.toString(back));

			if (back >= 35) {
				add = "Wüstentag";
			} else if (back >= 30) {
				add = "Heisser Tag";
			} else if (back >= 25) {
				add = "Sommertag";
			} else if (back < 0) {
				add = "Eistag";
			}

			infos.add(add);

		}

		return infos;
	}

	public ArrayList<String> min() {
		ArrayList<String> infos = new ArrayList<String>();
		double back = Double.MAX_VALUE;
		String add = "-";

		if (werte != null) {
			for (int i = 0; i < werte.length; i++) {
				if (werte[i] <= back) {
					back = werte[i];
				}
			}

			infos.add(Double.toString(back));

			if (back >= 20) {
				add = "Tropennacht";
			} else if (back >= 5) {
				add = "Vegetationstag";
			} else if (back < 0) {
				add = "Frosttag";
			}

			infos.add(add);
		}
		return infos;
	}
	
}
