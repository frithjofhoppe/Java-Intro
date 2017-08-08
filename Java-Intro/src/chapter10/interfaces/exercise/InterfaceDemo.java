package chapter10.interfaces.exercise;


public class InterfaceDemo {

	public void main(String[] arg)
	{
	Greeter greeter = GreeterFactory.create();
	greeter.sayHello();
	}
}
