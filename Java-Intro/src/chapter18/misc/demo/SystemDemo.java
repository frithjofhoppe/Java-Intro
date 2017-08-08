package chapter18.misc.demo;

import java.util.Enumeration;

public class SystemDemo {
	public static void main(String[] args) {
		printSysInfo();
	}

	static void printSysInfo() {
		Enumeration props = System.getProperties().propertyNames();

		System.out.println("Systemeigenschaften:");
		System.out.println();

		while (props.hasMoreElements()) {
			String prop = props.nextElement().toString();
			System.out.print(prop + ":");

			for (int i = prop.length(); i < 30; i++) {
				System.out.print(" ");
			}
			System.out.println(System.getProperty(prop));
		}
	}
}
