package chapter19.lambda.demo2;

import java.util.Collection;
import java.util.function.Predicate;

public class WarehouseDemo {

	public static void main(String[] args) {
		Warehouse w = new Warehouse();

		System.out.println("articles: all");
		print(w.getArticles());

		System.out.println("articles: with quantity > 100");
		print(w.getArticles(input -> input.getQuantity() > 100));

		System.out.println("articles: with price < 1.50");
		Predicate<Article> lowPrice = input -> input.getPrice() < 1.50;
		print(w.getArticles(lowPrice));

		System.out.println("articles: buy 25 items of all articles with a price < 1.50");
		w.changeArticles(lowPrice, input -> input.setQuantity(input.getQuantity() - 25));
		print(w.getArticles(lowPrice));

	}

	private static void print(Collection<Article> articles) {
		for (Article article : articles) {
			System.out.println(article);
		}
		System.out.println();
	}

} // end
