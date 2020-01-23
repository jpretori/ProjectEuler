package jpretori.projecteuler;

public class Problem007 {

	/**
	 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see
	 * that the 6th prime is 13.
	 * 
	 * What is the Nth prime number?
	 * 
	 * Note the return type is "long". Asking for a too-large value of N will cause
	 * wrap around issues, i.e. you might get a negative return value.
	 * 
	 * @param n index of the prime number we're looking for
	 * @return the Nth prime number
	 */
	public long nthPrime(int n) {
		int i = 2;
		long candidate = 3;
		while (i < n) {
			candidate += 2; // Even numbers other than 2 can never be prime

			if (ToolPack.isPrime(candidate)) {
				i++;
			}
		}

		return candidate;
	}
}
