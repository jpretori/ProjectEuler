package jpretori.projecteuler;

public class Problem004 {
	/**
	 * A palindromic number reads the same both ways. The largest palindrome made
	 * from the product of two 2-digit numbers is 9009 = 91 × 99.
	 * 
	 * @param digits 
	 * @return
	 */
	public long largestPalindrome(int digits) {
		// Find the biggest number you can make with so many digits
		// Then find the biggest product you can make with numbers that have that many digits
		// Start there, work downwards to find the largest number that is a palindrome
		// Do part of the factorization work to figure out if there are factors with the give number of digits
		
		final double max_num_with_so_many_digits = Math.pow(10, digits)-1;
		final double max_product = Math.pow(max_num_with_so_many_digits, 2);
		long candidate = Math.round(max_product);
		long result = 0;
		
		final double min_num_with_so_many_digits = Math.pow(10,  digits-1);
		final double min_product = Math.pow(min_num_with_so_many_digits, 2);
		
		while ((result == 0) && (candidate > min_product)) {
			if (isPalindrome(candidate)) {
				result = checkFactorsDigitCounts(candidate, digits);
			} 
			
			candidate--;
		}
		
		return result;
	}

	/**
	 * 
	 * @param candidate the Palindrome that might be the answer, if two factors can
	 *                  be found that have the required number of digits
	 * @param digits
	 * @return candidate if the required factors are found, otherwise zero.
	 */
	private long checkFactorsDigitCounts(long candidate, int digits) {
		// Look between the smallest number that can be made by so many digits and the
		// square root of candidate for factors. If one is found whose "partner" also
		// has so many digits, return true
		
		for (long i = Math.round(Math.pow(10, digits-1)); i < Math.sqrt(candidate)+1; i++) {
			if (candidate % i == 0) {
				if (hasRightNumberOfDigits(i, digits) && hasRightNumberOfDigits(candidate/i, digits)) {
					return candidate;
				}
			}
		}
		
		return 0;
	}

	/**
	 * 
	 * @param i
	 * @param digits
	 * @return true if candidate is made of the given number of digits, false otherwise
	 */
	private boolean hasRightNumberOfDigits(long candidate, int digits) {
		Double test = candidate / Math.pow(10, digits-1);
		return (test >= 1.0) && (test < 10.0);
	}

	/** 
	 * 
	 * @param candidate
	 * @return true if candidate reads the same in both directions
	 */
	private boolean isPalindrome(long candidate) {
		String c = String.valueOf(candidate);
		String c_reversed = "";
		
		for (int i = c.length() - 1; i >= 0; i--) {
			c_reversed = c_reversed.concat(String.valueOf(c.charAt(i)));
		}
		
		return c.equals(c_reversed);
	}
}
