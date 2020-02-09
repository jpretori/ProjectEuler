package jpretori.projecteuler;

public class Problem010 {

	/**
	 * 
	 * @param N 
	 * @return The sum of all the primes smaller than N
	 */
	public long primeSummation(int N) {
		long result = 2;
		for (int i = 3; i < N; i += 2) {
				if (ToolPack.isPrime(i)) {
					result += i;
			}
		}
		return result;
	}
}
