package chapter10.interfaces.demo;

import java.util.ArrayList;
import java.util.List;


public class FormDemo {

	public static void main(String[] args) {
		Form f1 = new Rectangle(2.0, 3.5);
		Form f2 = new Circle(3.0);

		List<Form> forms = new ArrayList<Form>();
		forms.add(f1);
		forms.add(f2);

		for (Form form : forms) {
			System.out.println(form.getClass().getName());
			System.out.println("  area = " + form.getArea());
			System.out.println("  perimeter = " + form.getPerimeter());
		}
	}
}
