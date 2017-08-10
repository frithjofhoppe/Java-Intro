package junit;

import java.util.List;

public interface NumUtil {
	
	

		/**
		 * Gets the minimum value of the range of values.
		 * 
		 * @param values
		 *     	A variable number of values. The valid range
		 * 		of possible values is between 2 and 12.
		 * 
		 * @return The minimum value.
		 *
		 * @throws IllegalArgumentException
		 *      If the number of values is less than 2 
		 *      or greater than 12.
		 */
		public Integer min(Integer... values) 
			throws IllegalArgumentException;



		/**
		 * Gets the maximal value of the range of values.
		 * 
		 * @param values
		 * 		A variable number of values. The valid range of 
		 *      possible values is between 2 and 12.
		 * 
		 * @return The maximal value.
		 *
		 * @throws IllegalArgumentException
		 *      If the number of values is less than 2 
		 *      or greater than 12.
		 */
		public Integer max(Integer... values) 
			throws IllegalArgumentException;


		


		/**
		 * Gets the sum of the given values.
		 * 
		 * @param values
		 *		A variable number of values. The valid range of	 *     	possible values is between 1 and 100.
		 * 
		 * @return The sum.
		 *
		 * @throws IllegalArgumentException
		 *     	In case of an invalid value range.
		 */
		public Double sum(List<Integer> values)
			throws IllegalArgumentException;


		/**
		 * Gets the average of the given values.
		 * 
		 * @param values
		 *   	A variable number of values. The valid range of 
		 * 		possible values is between 2 and 25.
		 * 
		 * @return The average of the given values.
		 *
		 * @throws IllegalArgumentException
		 *   	In case of an invalid value range.
		 */
		public Double avg(List<Integer> values) 
			throws IllegalArgumentException;

	


}
