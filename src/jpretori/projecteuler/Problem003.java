package jpretori.projecteuler;

public class Problem003 {
	public long largestPrimeFactor(long n) {
		long largest_prime = 0;
		
		for (long i = 2; (i < (Math.sqrt(n))); i++) {
			if (n % i == 0) {
				if (isPrime(n/i)) {
					//it's not possible to find a larger prime factor, so bail out
					largest_prime = n/i;
					return largest_prime; 
				}
				
				if (isPrime(i)) {
					// so i is a factor and prime, but there might be a larger prime factor to find
					if (i > largest_prime) {
						largest_prime = i;
					}
				}
			}
		}
		
		if (largest_prime == 0) {
			System.out.println("No prime factors found for [" + n + "]");
		}
		return largest_prime;
	}

	/**
	 * 
	 * @param n
	 * @return true if n is a prime number, else false
	 */
	private boolean isPrime(long n) {
		long result = n;
		for (int i = 2; (i < (Math.sqrt(n) + 1)) && (result != 0); i++) {
			if (n % i == 0) {
				return false;
			}
		}
				
		return true;
	}
}
