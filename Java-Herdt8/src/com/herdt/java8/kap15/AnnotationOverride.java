package com.herdt.java8.kap15;

class AnnotationOverride extends AnnotationOverrideSuper {
	// @Override
	public void writeTex() {
		System.out.println("Ausgabe der abgeleiteten Klasse");
	}

	public static void main(String[] args) {
		AnnotationOverride instance = new AnnotationOverride();
		instance.writeText();
	}
}
