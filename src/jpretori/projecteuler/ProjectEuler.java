package jpretori.projecteuler;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ProjectEuler {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties p = new Properties();
		InputStream is = ProjectEuler.class.getResourceAsStream("/projecteuler.cfg");
		p.load(is);
				
		problem001(p);
		System.out.println("------- ------- -------");
		problem002_ProjectEuler(p);
		System.out.println("------- ------- -------");
		problem003(p);
		System.out.println("------- ------- -------");
		problem004(p);
		System.out.println("------- ------- -------");
		
	}

	private static void problem004(Properties p) {
		Problem004 pt = new Problem004();
		int digits = Integer.parseInt(p.getProperty("problem004"));
		System.out.println("Problem 004; largest palindrome that is a product of numbers with [" 
		+ digits + "] digits is [" + pt.largestPalindrome(digits) + "]");
	}

	private static void problem001(Properties p) {
		Problem001 pt = new Problem001();
		long problem001 = Long.parseLong(p.getProperty("problem001"));
		System.out.println("Problem 001; multiples of 3 and 5 up to [" + problem001 + "] = ["
				+ pt.multiplesOf3and5(problem001) + "]");
	}

	private static void problem002_ProjectEuler(Properties p) {
		Problem002 pt = new Problem002();
		long problem002 = Long.parseLong(p.getProperty("problem002"));
		System.out.println("Problem 002 (projecteuler.net version); " + "sum even Fibonacci numbers up to [" + problem002
				+ "] = [" + pt.sumEvenFiboUpToMaxN(problem002) + "]");

		int problem002_fcc1 = Integer.parseInt(p.getProperty("problem002-fcc1"));
		System.out.println("Problem 002 (freecodecamp version); " + "sum even Fibonacci numbers up to [" + problem002_fcc1
				+ "]th Fibonacci number = [" + pt.sumEvenFiboUpToNthFibo(problem002_fcc1) + "]");
		
		int problem002_fcc2 = Integer.parseInt(p.getProperty("problem002-fcc2"));
		System.out.println("Problem 002 (freecodecamp version); " + "sum even Fibonacci numbers up to [" + problem002_fcc2
				+ "]th Fibonacci number = [" + pt.sumEvenFiboUpToNthFibo(problem002_fcc2) + "]");
		
		int problem002_fcc3 = Integer.parseInt(p.getProperty("problem002-fcc3"));
		System.out.println("Problem 002 (freecodecamp version); " + "sum even Fibonacci numbers up to [" + problem002_fcc3
				+ "]th Fibonacci number = [" + pt.sumEvenFiboUpToNthFibo(problem002_fcc3) + "]");
		
		int problem002_fcc4 = Integer.parseInt(p.getProperty("problem002-fcc4"));
		System.out.println("Problem 002 (freecodecamp version); " + "sum even Fibonacci numbers up to [" + problem002_fcc4
				+ "]th Fibonacci number = [" + pt.sumEvenFiboUpToNthFibo(problem002_fcc4) + "]");
	}

	private static void problem003(Properties p) {
		Problem003 pt = new Problem003();
		long problem003 = Long.parseLong(p.getProperty("problem003"));
		System.out.println("Problem 003; largest prime factor of [" + problem003 + "] = ["
				+ pt.largestPrimeFactor(problem003) + "]");
	}

}
