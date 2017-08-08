package chapter13.collections.demo.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

	public static void print(Map<Integer, String> map) {

		for (Map.Entry<Integer, String> e : map.entrySet()) {
			Integer key = e.getKey();
			String value = e.getValue();
			System.out.println("key=" + key + ", value=" + value);
		}
	}

	public static void printByKeySet(Map<Integer, String> map) {

		for (Integer key : map.keySet()) {
			String value = map.get(key);
			System.out.println("key=" + key + ", value=" + value);
		}
	}

	public static void main(String[] args) {

		Map<Integer, String> article = new HashMap<Integer, String>();

		article.put(1, "Bleistift");
		article.put(20, "A4 Block");
		article.put(3, "Kugelschreiber");

		System.out.println("HashMap sequentiell durchlaufen:");
		print(article);

		// Aus dem HashMap eine TreeMap erzeugen
		Map<Integer, String> articleTree = new TreeMap<Integer, String>(article);

		System.out.println("TreeMap sequentiell durchlaufen:");
		printByKeySet(articleTree);
	}

}
