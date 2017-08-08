package chapter10.interfaces.exercise;

public class PersonalGreeter implements Greeter{
	
	public void sayHello()
	{
		System.out.println("Hello mate");
	}

	@Override
	public void sayHello(String name) {
		System.out.println("Hello "+name);
	}
}
