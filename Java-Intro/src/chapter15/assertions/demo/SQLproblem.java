package chapter15.assertions.demo;

public @interface SQLproblem {
	
	
	/**
	 * LOW = method can mostly be used <br>
	 * MIDDLE = should be solved => problem expected<br>
	 * HIGH = problem will occur
	 * @return
	 */
	
	public enum Category {
		LOW, MIDDLE, HIGH
	}
	
	
	Category category() default Category.LOW;
	
}
