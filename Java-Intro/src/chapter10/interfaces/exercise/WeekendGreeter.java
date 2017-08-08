package chapter10.interfaces.exercise;

public class WeekendGreeter implements Greeter{

	@Override
	public void sayHello() {
		System.out.println("Hello mate, Have a nice weekend");
		
	}

	@Override
	public void sayHello(String name) {
		System.out.println("Hello " +name+", Have a nice weekend");
		
	}

}
