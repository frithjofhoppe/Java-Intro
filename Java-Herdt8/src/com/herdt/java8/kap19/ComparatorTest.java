package com.herdt.java8.kap19;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {

	public static void main(String[] args) {

		List<Item> itemList = Item.createList();

		//
		// Ausgabe Originalliste
		//
		printList(itemList, "Originalliste");

		//
		// Sortierung mit innerer Klasse
		//
		Collections.sort(itemList, new Comparator<Item>() {
			public int compare(Item it1, Item it2) {
				return it1.getItemName().compareTo(it2.getItemName());
			}
		});
		printList(itemList, "=== Artikel aufsteigend sortiert - Variante innere Klasse ===");

		//
		// Sortierung mit Lambda-Ausdruck
		//
		Collections.sort(itemList, (Item it1, Item it2) -> it2.getItemName().compareTo(it1.getItemName()));
		printList(itemList, "=== Artikel absteigend sortiert - Variante Lambda-Ausdruck ===");

	}

	static void printList(List<Item> list, String text) {
		System.out.println(text);
		for (Item i : list) {
			i.printName();
		}
	}
}