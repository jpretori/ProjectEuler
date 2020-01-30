package jpretori.projecteuler;

public class Problem009 {

	/**
	 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for
	 * which, a^2 + b^2 = c^2
	 * 
	 * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
	 * 
	 * There exists exactly one  
	 * Find the product abc for which a + b + c = N.
	 * 
	 * @param N the target sum of the pythagorean triplet.
	 * @return the product of the triplet (a*b*c) or 0 if none are found
	 */
	public long pythagoreanTripletProduct(int N) {
		for (int a = 1; a < N; a++) {
			for (int b = a+1; b < N; b++) {
				long csq = (long) (Math.pow(a, 2) + Math.pow(b, 2));
				double c_double = Math.sqrt(csq);
				long c = (long) c_double;
				if (c_double == c) {
					if ((a < b) && (b < c)) {
						long sum = a + b + c;
						if (sum > N) {
							break;
						}

						if (sum == N) {
							return a * b * c;
						}
					}
				}
			}
		}
			
		return 0;
	}
}
