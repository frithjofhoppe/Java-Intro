package meteo.m3;

import java.util.ArrayList;

public class MeteoDemo {

	public static void main(String[] args) {
		
		/*ArrayList<Double> liste = new ArrayList<Double>();
		
		liste.add(-8.1);
		liste.add(-4.5);
		liste.add(-2.1);
		liste.add(-1.3);
		liste.add(-0.1);
		liste.add(-2.2);
		liste.add(-4.1); 
		liste.add(-6.3);*/
		
		double[] werte = {-8.1,-4.5,-2.1,-1.3,-0.1,-2.2,-4.1,-6.3,-10};
		
		Meteo meteo = new Meteo(werte);
		
		/*
		Meteo m1 = new Meteo(werte);
		System.out.println("MIN => "+m1.min().get(0));
		System.out.println(m1.min().get(1));
		
		System.out.println("\nMAX => "+m1.max().get(0));
		System.out.println(m1.max().get(1));
		 
		System.out.println("\nAVG => "+m1.average().get(0));
		System.out.println(m1.average().get(1));*/
	}

}
