package chapter14.exceptions.exercise;

public class NumberExceptionDemo {

	public static void main(String[] args) {
		
		
			
		String[] zahlen = {"-1", "0", "1", "17", "45", "46", "99"};
		
		for(int i = 0; i < zahlen.length;i++)
		{
			
			try {
				
				parseLottoNumber(Integer.parseInt(zahlen[i]));
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				System.out.println(e.toString());
			} catch (NumberException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
	
	public static int parseLottoNumber(int lottoNumber) throws NumberException
	{
		int back = 0;
			if(lottoNumber < 0)
			{
				throw new NumberException("Die Zahl >"+lottoNumber+"< ist zu klein");
			}
			else if(lottoNumber > 45)
			{
				throw new NumberException("Die Zahl >"+lottoNumber+"< ist ungültig");
			}
			else
			{
				System.out.println("Die Zahl " +lottoNumber+ " ist gültig");
			}
		
		return back;
	}

}
