package chapter12.demo.arrays;

public class StudentDemo {

	public static void main(String[] args) {

		Student[] students = new Student[3];

		students[0] = new Student("Peter Müller", "Elektrotechnik");
		students[1] = new Student("Anita Meyer", "Physik");
		students[2] = new Student("Petra Fink", "Informatik");

		for (int i = 0; i < students.length; i++) {

			Student student = students[i];
			System.out.println(student.toString());

			// alternative Variante
			System.out.println(students[i].toString());
		}

	}

}
