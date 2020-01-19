package jpretori.projecteuler;

public class ProjectEuler {

	public static void main(String[] args) {
		problem001(args);
		System.out.println("------- ------- -------");
    	problem002(args);
		System.out.println("------- ------- -------");
	}

	private static void problem001(String[] args) {
		Problem001 pt = new Problem001();
		System.out.println("Problem 001; multiples of 3 and 5 up to [" + args[0] + "] = ["
				+ pt.multiplesOf3and5(Long.parseLong(args[0])) + "]");
	}

	private static void problem002(String[] args) {
		ProblemTwo pt = new ProblemTwo();
		System.out.println("Problem 002; sum even Fibonacci numbers up to [" + args[1] + "] = ["
				+ pt.sumEvenFibo(Long.parseLong(args[1])) + "]");   	
	}

}
