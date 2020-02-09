package jpretori.projecteuler;

import java.util.HashMap;

public class ToolPack {
	
	private static HashMap<Long, Long> primes = null;
	private static long highest_key = 0;
	
	static boolean isPrime(long candidate) {
		initPrimes();
		
		long i = 0;
		while ((i < primes.size()) && (primes.get(i) < Math.sqrt(candidate) + 1)) {
			if (candidate % primes.get(i) == 0) {
				return false;
			}
			i += 1;
		}
		
		addPrime(candidate);
		return true;
	}

	/**
	 * Safely adds a prime number to the storage. 
	 * @param new_prime
	 */
	private static void addPrime(long new_prime) {
		if (new_prime > primes.get(highest_key)) {
			highest_key += 1;
			primes.put(highest_key, new_prime);
		}
	}

	/**
	 * Creates a new storage object for prime numbers if needed, and loads up the
	 * first prime number.
	 */
	private static void initPrimes() {
		if (primes == null) {
			primes = new HashMap<Long, Long>();
			highest_key = 0;
			primes.put(highest_key, 2L);
		}
	}

}
