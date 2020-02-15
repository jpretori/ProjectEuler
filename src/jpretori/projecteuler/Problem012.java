package jpretori.projecteuler;

public class Problem012 {

	/**
	 * 
	 * @param target_num_divisors
	 * @return the value of the first triangle number to have over
	 *         <code>target_num_divisors</code> divisors
	 */
	public long divisibleTriangleNumber(int target_num_divisors) {
		long result_triangle_num = 1;
		
		long divisors = 0;
		for (int i = 2; 
				(result_triangle_num < Long.MAX_VALUE) && (divisors < target_num_divisors); 
				i++) {
			result_triangle_num += i;
			divisors = countDivisors(result_triangle_num);
		}
		
		if (divisors < target_num_divisors) {throw new RuntimeException("Overran max long value before target number of divisors were found");}
		
		return result_triangle_num;
	}

	private long countDivisors(long triangle_num) {
		if (triangle_num == 1) {return 1;}
		
		long num_divisors = 0;
		for (int i = 2; i < Math.sqrt(triangle_num); i++) {
			if (triangle_num % i == 0) {
				num_divisors += 2;
			}
		}
		
		//Account for 1 and the number itself as divisors by adding 2
		return num_divisors + 2;   
	}

}
