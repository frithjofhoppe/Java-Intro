package com.herdt.java8.kap08;

class TestObjectMethods {
	public static void main(String[] args) {
		ObjectMethods obj1 = new ObjectMethods();
		ObjectMethods obj2 = new ObjectMethods();
		obj1.setData(123);
		if (obj1.equals(obj2))
			System.out.println("obj1 und obj2 sind gleich!");
		else
			System.out.println("obj1 und obj2 sind nicht gleich!");
		ObjectMethods obj3 = (ObjectMethods) obj1.clone();
		if (obj1.equals(obj3))
			System.out.println("obj1 und obj3 sind gleich!");
		else
			System.out.println("obj1 und obj3 sind nicht gleich!");
	}
}