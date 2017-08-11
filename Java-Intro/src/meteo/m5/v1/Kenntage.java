package meteo.m5.v1;

import java.util.List;

public interface Kenntage {

	boolean isTropenNacht();
	boolean isVegetationsTag();
	boolean isFrostTag();
	boolean isHeizTag();
	boolean isWuestenTag();
	boolean isHeisserTag();
	boolean isSommerTag();
	
	public List<Kenntag> getKenntage();
}
