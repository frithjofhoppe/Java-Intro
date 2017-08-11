package meteo.m6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import chapter17.streams.demo.standard.Reader;

public class MeteoTest {

	static final double TOLERANCE = 0.001;

	public static final double[] TEST_DATA = { -8.1, -4.5, -2.1, -1.3, -0.1, -2.2, -4.1, -6.3, -10 };
	public static final String TEST_FILE = "src/meteo/m6/meteodaten.txt";

	Meteo meteo;

	public MeteoTest() {

	}

	private static List<MeteoTestData> testDataList = new ArrayList<MeteoTestData>();

	@BeforeClass
	public static void init() {
		try (BufferedReader br = new BufferedReader(new FileReader(TEST_FILE))) {
			String testRecord = br.readLine();

			if (testRecord != null) {
				testRecord = br.readLine();
			}

			while (testRecord != null) {
				MeteoTestData testData = new MeteoTestData(testRecord);
				testDataList.add(testData);

				testRecord = br.readLine();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		String testRecord = "-8.1, -3.5875, -0.1 : -8.1, -4.5, -2.1, -1.3, -0.1, -2.2, -4.1, -6.3";
//		MeteoTestData meteotest = new MeteoTestData(testRecord);
//
//		meteotest.getExpectedMax();
	}

	@Test
	public void testMeteoTestDataFromFile() {
		for (MeteoTestData testData : testDataList) {
			Meteo meteo = new Meteo(testData.getTemperaturen());
			Assert.assertEquals(testData.getExpectedMin(), meteo.getMin(), TOLERANCE);
			Assert.assertEquals(testData.getExpectedMed(), meteo.getMittelWert(), TOLERANCE);
			Assert.assertEquals(testData.getExpectedMax(), meteo.getMax(), TOLERANCE);
		}
	}

//	@Test
//	public void testTemperaturen() {
//		Meteo meteo = new Meteo(TEST_DATA);
//		Assert.assertEquals(-10, meteo.getMin(), TOLERANCE);
//		Assert.assertEquals(-0.1, meteo.getMax(), TOLERANCE);
//		Assert.assertEquals(-4.300000000000001, meteo.getMittelWert(), TOLERANCE);
//	}

//	@Test
//	public void testKenntage() {
//		Meteo meteo = new Meteo(TEST_DATA);
//
//		Assert.assertEquals(false, meteo.isTropenNacht());
//		Assert.assertEquals(false, meteo.isVegetationsTag());
//		Assert.assertEquals(true, meteo.isFrostTag());
//		Assert.assertEquals(true, meteo.isHeizTag());
//		Assert.assertEquals(false, meteo.isWuestenTag());
//		Assert.assertEquals(false, meteo.isHeisserTag());
//		Assert.assertEquals(false, meteo.isSommerTag());
//		Assert.assertEquals(true, meteo.isEisTag());
//	}

//	@Test
//	public void testKenntageEnum() {
//		Meteo meteo = new Meteo(TEST_DATA);
//
//		List<Kenntag> result = meteo.getKenntage();
//
//		Assert.assertEquals(3, meteo.getKenntage().size());
//		Assert.assertTrue(result.contains(Kenntag.FROST_TAG));
//		Assert.assertTrue(result.contains(Kenntag.HEIZ_TAG));
//		Assert.assertTrue(result.contains(Kenntag.EIS_TAG));
//	}
}
