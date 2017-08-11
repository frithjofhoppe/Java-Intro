package meteo.m5.v1;

public enum Kenntag {
	
	TROPEN_NACHT("Tropennacht"),
	VEGETATIONS_TAG("Vegetationstag"),
	FROST_TAG("Frosttag"),
	HEIZ_TAG("Heiztag"),
	WUESTEN_TAG("Wüstentag"),
	HEISSER_TAG("Heissertag"),
	SOMMER_TAG("Sommertag"),
	EIS_TAG("Eistag");
	
	private String name;
	
	Kenntag(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
}
