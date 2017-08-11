package meteo.m6;

import java.util.StringTokenizer;

public class MeteoTestData {

	static final String SECTION_DELIMITER = ":";
	static final String RECORD_DELIMITER = ",";
	
	double expectedMin = 0;
	double expectedMax = 0;
	double expectedMed = 0;
	double[] temperaturen;
	
	MeteoTestData(String input)
	{
		extractExpected(input);
	}

	private void extractExpected(String data)
	{
		String[] section = data.split(SECTION_DELIMITER);
		
		String[] fixValues = section[0].split(RECORD_DELIMITER);
		String[] tempValues = section[1].split(RECORD_DELIMITER);
		
		this.temperaturen = splitSections(section[1]);
		this.expectedMin = Double.parseDouble(fixValues[0]);
		this.expectedMax = Double.parseDouble(fixValues[2]);
		this.expectedMed = Double.parseDouble(fixValues[1]);
		//this.temperaturen = splitSections(tempValues[1]);
	}
	
	private double[] splitSections(String section)
	{
		StringTokenizer t = new StringTokenizer(section,RECORD_DELIMITER);
		
		double[] result = new double[t.countTokens()];
		int i = 0;
		
		while(t.hasMoreTokens())
		{
			result[i] = Double.parseDouble(t.nextToken().trim());
			System.out.println("--");
			i++;
		}
		
		return result;
	}
	
	public double getExpectedMin() {
		return expectedMin;
	}

	public void setExpectedMin(double expectedMin) {
		this.expectedMin = expectedMin;
	}

	public double getExpectedMax() {
		return expectedMax;
	}

	public void setExpectedMax(double expectedMax) {
		this.expectedMax = expectedMax;
	}

	public double getExpectedMed() {
		return expectedMed;
	}

	public void setExpectedMed(double expectedMed) {
		this.expectedMed = expectedMed;
	}

	public double[] getTemperaturen() {
		return temperaturen;
	}

	public void setTemperaturen(double[] temperaturen) {
		this.temperaturen = temperaturen;
	}
	
	
	
}
