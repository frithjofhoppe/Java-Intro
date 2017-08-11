package meteo.m5.v1;

import java.util.List;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


public class MeteoTest {

	static final double TOLERANCE = 0.001;
	
	public static final double[] TEST_DATA = { -8.1, -4.5, -2.1, -1.3, -0.1, -2.2, -4.1, -6.3, -10 };
	
	Meteo meteo;
	
	public MeteoTest()
	{
		
	}
	

	
	@Test
    public  void testTemperaturen()
    {
		Meteo meteo = new Meteo(TEST_DATA);
		Assert.assertEquals(-10, meteo.getMin(),TOLERANCE);
		Assert.assertEquals(-0.1, meteo.getMax(),TOLERANCE);
		Assert.assertEquals(-4.300000000000001, meteo.getMittelWert(),TOLERANCE);
    }
    
	@Test
	public void testKenntage()
    {
		Meteo meteo = new Meteo(TEST_DATA);
    	
    	Assert.assertEquals(false,meteo.isTropenNacht());
    	Assert.assertEquals(false,meteo.isVegetationsTag());
    	Assert.assertEquals(true,meteo.isFrostTag());
    	Assert.assertEquals(true,meteo.isHeizTag());
    	Assert.assertEquals(false,meteo.isWuestenTag());
    	Assert.assertEquals(false,meteo.isHeisserTag());
    	Assert.assertEquals(false,meteo.isSommerTag());
    	Assert.assertEquals(true,meteo.isEisTag());
    }
    
	@Test
	public void testKenntageEnum()
    {
		Meteo meteo = new Meteo(TEST_DATA);
    	
    	List<Kenntag> result = meteo.getKenntage();
    	
    	Assert.assertEquals(3, meteo.getKenntage().size());
    	Assert.assertTrue(result.contains(Kenntag.FROST_TAG));
    	Assert.assertTrue(result.contains(Kenntag.HEIZ_TAG));
    	Assert.assertTrue(result.contains(Kenntag.EIS_TAG));
    }
}
