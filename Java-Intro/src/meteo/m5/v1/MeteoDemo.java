package meteo.m5.v1;

import java.util.List;

public class MeteoDemo
{
	
	
	

	public static void main(String[] args)
	{
		double[] temperaturen = { -8.1, -4.5, -2.1, -1.3, -0.1, -2.2, -4.1, -6.3, -10 };
		Meteo meteo = new Meteo(temperaturen);
		
		printTemperaturen(meteo);
		printTageinformationen(meteo.getKenntage());
		
	}
	
	public static void printTemperaturen(Meteo m)
	{
		if(m != null)
		{
			String temp = "";
			
			for(int i = 0; i < m.getTempWerte().length; i++)
			{
				if(i == 0)
				{
					temp+= m.getTempWerte()[i];
					continue;
				}
				
				/*if(i == m.getTempWerte().length-1)
				{
					temp+= ", "+m.getTempWerte()[i]+"\n";
					break;
				}
				*/
				temp+= ", "+m.getTempWerte()[i];
			}
			
			System.out.println("Eingegebenen Temperaturen: " + temp+"\n-MIN:"+m.getMin()+"\n-MAX:"+m.getMax()+"\n-AVG:"+m.getMittelWert()+"\n");
		}
	}

	public static void printTageinformationen(List<Kenntag> liste)
	{
		String print = "Meterologische Informationen:";
		
			for(Kenntag k: liste)
			{
				print+="\n"+k.getName();
			}

			System.out.println(print);
		}
	}

