package jpretori.projecteuler;

import java.util.ArrayList;

public class Problem013 {

	/**
	 * 
	 * @param numbers A list of really big numbers, such that they are represented
	 *                as strings. Expected to be 50 digits each.
	 * @return the first ten digits of the sum of <code>numbers</code>
	 */
	
	public long largeSum(ArrayList<String> numbers) {
		long result = 0;

		// If we get 100 numbers, any column in the grid can be all nines, leading to
		// the addition of "900" i.e. two orders of magnitude larger than is represented
		// by that column.   Add one for safety.
		int num_digits_to_consider = 10 + String.valueOf(numbers.size()).length();
		
		// Add it all up
		for (String n : numbers) {
			String most_significant_digits_string = n.substring(0, num_digits_to_consider + 1);
			long most_significant_digits = Long.valueOf(most_significant_digits_string);
			result += most_significant_digits;
		}
		
		// Trim to the first 10 digits
		String r = Long.toString(result);
		r = r.substring(0, 10);
		result = Long.valueOf(r);
		
		return result;
	}

}
