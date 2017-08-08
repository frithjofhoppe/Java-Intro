package chapter04.language.exercise;

public class ReduzierteNotationen {

	
	public static void main(String args[])
	{
	
	int x = 1, y = 2;
	
	System.out.println(x + " |1|" + y);
	
	x++;
	System.out.println(x + " |2|" + y);
	
	x+=y;
	System.out.println(x + " |3|" + y);
	
	x*=y;
	System.out.println(x + " |4|" + y);
	
	x-= y++;
	System.out.println(x + " |5|" + y);
	
	x/= 8-2*y--;
	System.out.println(x + " |6|" + y);

	x=y = x+y;
	System.out.println(x + " |7|" + y);
	
	
	}
}
