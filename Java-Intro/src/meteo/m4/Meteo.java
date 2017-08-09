package meteo.m4;

import java.util.ArrayList;
import java.util.List;

public class Meteo implements Kenntage, Temperaturen {

	private double[] tempWerte;
	private double maxTemp = 0;
	private double minTemp = 0;
	private double avgTemp = 0;
	TagesTemperaturen tagesTemp;
	List<Kenntag> kenntag = new ArrayList<Kenntag>();

	Meteo(double[] tempWerte) {
		this.tempWerte = tempWerte;

		if (tempWerte != null || tempWerte.length != 0) {
			tagesTemp = new TagesTemperaturen(tempWerte);

			maxTemp = getMax();
			minTemp = getMin();
			avgTemp = getMittelWert();
		}
	}

	public double[] getTempWerte() {
		return tempWerte;
	}

	@Override
	public boolean isTropenNacht() {
		boolean back = false;

		if (minTemp >= 12) {
			back = true;
		}

		return back;
	}

	@Override
	public boolean isVegetationsTag() {
		boolean back = false;

		if (minTemp >= 5) {
			back = true;
		}

		return back;
	}

	@Override
	public boolean isFrostTag() {
		boolean back = false;

		if (minTemp < 0) {
			back = true;
		}

		return back;
	}

	public boolean isEisTag() {
		boolean back = false;

		if (maxTemp < 0) {
			back = true;
		}

		return back;
	}

	@Override
	public boolean isHeizTag() {
		boolean back = false;

		if (avgTemp < 12) {
			back = true;
		}

		return back;
	}

	@Override
	public boolean isWuestenTag() {
		boolean back = false;

		if (maxTemp >= 35) {
			back = true;
		}

		return back;
	}

	@Override
	public boolean isHeisserTag() {
		boolean back = false;

		if (maxTemp >= 30) {
			back = true;
		}

		return back;
	}

	@Override
	public boolean isSommerTag() {
		boolean back = false;

		if (maxTemp >= 25) {
			back = true;
		}

		return back;
	}

	@Override
	public double[] getTemperaturen() {

		return tempWerte;
	}

	@Override
	public double getMax() {
		return tagesTemp.getMax();

		/*
		 * double max = -1000000;
		 * 
		 * for ( int i = 0; i < tempWerte.length; i++ ) { if (tempWerte[i] > max) { max
		 * = tempWerte[i]; } }
		 * 
		 * return max;
		 */
	}

	public List<Kenntag> getKenntage() {
		List<Kenntag> back = new ArrayList<Kenntag>();

		if (isFrostTag()) {
			back.add(Kenntag.FROST_TAG);
		}
		if (isHeisserTag()) {
			back.add(Kenntag.HEISSER_TAG);
		}
		if (isHeizTag()) {
			back.add(Kenntag.HEIZ_TAG);
		}
		if (isSommerTag()) {
			back.add(Kenntag.SOMMER_TAG);
		}
		if (isTropenNacht()) {
			back.add(Kenntag.TROPEN_NACHT);
		}
		if (isVegetationsTag()) {
			back.add(Kenntag.VEGETATIONS_TAG);
		}
		if (isWuestenTag()) {
			back.add(Kenntag.WUESTEN_TAG);
		}
		if (isEisTag()) {
			back.add(Kenntag.EIS_TAG);
		}
		return back;
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
	public double getMin() {
		return tagesTemp.getMin();

		/*
		 * double min = 1000000;
		 * 
		 * for ( int i = 0; i < tempWerte.length; i++ ) { if (tempWerte[i] < min) { min
		 * = tempWerte[i]; } }
		 * 
		 * return min;
		 */
	}

	@Override
	public double getMittelWert() {

		return tagesTemp.getMittelWert();

		/*
		 * double average = 0;
		 * 
		 * for ( int i = 0; i < tempWerte.length; i++ ) { average += tempWerte[i]; }
		 * 
		 * average /= tempWerte.length;
		 * 
		 * return average;
		 */
	}
}
