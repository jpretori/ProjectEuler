package jpretori.projecteuler;

public class ToolPack {
	static boolean isPrime(long candidate) {
		boolean is_prime = true;
		for (int j = 2; 
				(j < Math.sqrt(candidate)+1) && (is_prime); 
				j++) {
			is_prime = !(candidate % j == 0);
		}
		return is_prime || (candidate == 2);
	}

}
