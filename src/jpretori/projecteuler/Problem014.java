package jpretori.projecteuler;

public class Problem014 {
	
	/**
	 * 
	 * @param max_starting_number
	 * @return The starting number, smaller than {@code max_starting_number}, that
	 *         produces the longest Collatz chain
	 */
	public int longestCollatzSequence(int max_starting_number) {
		int longest_chain = -1;
		
		int max_length = 0;
		for (int i = 5; i < max_starting_number; i++) {
			int length = buildChain(i);
			if (length > max_length) {
				max_length = length;
				longest_chain = i;
			}
		}
		
		return longest_chain;
	}

	/**
	 * 
	 * @param start
	 * @return the length of the Collatz chain starting at {@code start}
	 */
	private int buildChain(int start) {
		int length = 0;
		if (start < 5) { throw new RuntimeException("Cannot start a Collatz chain at [" + start + "]");	}
		
		long next_term = start;
		long n = start;
		while (n != 1) {
			if (n % 2 == 0) {
				next_term = n/2;
			} else {
				next_term = 3*n + 1;
			}
			n = next_term;
			length += 1;
		}
		
		return length;
	}

	/* ~~~~~~~ ~~~~~~~ ~~~~~~~ ~~~~~~~ ~~~~~~~ */
	
	/**
	 * The max number of nodes allowed in the Collatz tree
	 */
	final int MAX_DEPTH = 10;

	/**
	 * Creates a Collatz tree from 1 onwards (i.e. the opposite of the normal method
	 * of taking a starting number and working out the chain to 1).
	 */
	public void createTree() {
		
		Node one = new Node(1, null);
		Node two = new Node(2, one);
		Node four = new Node(4, two);
		Node eight = new Node(8, four);
		
		one.left = two;
		two.left = four;
		four.left = eight;
		
		addChildren(eight);
	}

	
	/**
	 * Recursively builds Collatz tree by adding children until the tree grows to
	 * {@code MAX_SIZE} nodes.
	 * 
	 * @param root
	 */
	private void addChildren(Node root) {
		root.left = new Node(root.value * 2, root);
		
		int d = (root.value - 1);
		if (d % 3 == 0) {
			int rightvalue = d/3;
			
			if (rightvalue % 2 != 0) {
				// If the ((n-1)/3) child is going to be even, you'd never travel from the child
				// to the parent - since you'd apply the n/2 rule in that case.
				root.right = new Node(rightvalue, root);
			}
		}
		
		System.out.println(root);
		
		if (root.depth < MAX_DEPTH) {
			if (root.left != null) {
				addChildren(root.left);
			}
			if (root.right != null) {
				addChildren(root.right);
			}
		}
	}

	private class Node {
		Node left = null;
		Node right = null;
		Node parent = null;
		int value = 0;
		int depth = 0;
		
		Node(int value, Node parent) {
			this.value = value;
			this.parent = parent;
			if (parent != null) {
				this.depth = parent.depth + 1;
			}
		}
		
		@Override
		public String toString() {
			String leftval = left == null ? "" : String.valueOf(left.value);
			String rightval = right == null ? "" : String.valueOf(right.value);
			
			String result = this.depth + ": " + this.value + " -> " + leftval + ", " + rightval;
			
			return result;
		}
	}
}













