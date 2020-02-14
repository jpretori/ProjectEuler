package jpretori.projecteuler;

public class Problem011 {
	private int[][] grid;
	
	/**
	 * 
	 * @param grid a square array of int
	 * @return The largest 4-place product from grid, tracing up, down, left, right
	 *         or diagonally
	 */
	public long largestGridProduct(int[][] grid) {
		this.grid = grid;
		
		int[] products = {0,0,0,0};
		
		products[0] = largestProductByColumn();
		products[1] = largestProductByRow();
		products[2] = largestProductByTopLeftDiagonals();
		products[3] = largestProductByBottomRightDiagonals();
		
		int largest_product = products[0];
		for (int i = 1; i < products.length; i++) {
			if (products[i] > largest_product) {
				largest_product = products[i];}
		}
		return largest_product;
	}

	/**
	 * 
	 * @return The largest product of 4 integers that it is possible to make by
	 *         looking only at diagonals that run from BOTTOM-LEFT to TOP-RIGHT in
	 *         <code>grid</code>
	 */
	private int largestProductByBottomRightDiagonals() {
		int largest_product = 0;

		for (int x_start = grid.length-1; x_start >= 3; x_start--) {
			for (int x = x_start, y = 0; (x >= 3) && (y < grid.length - 3); x--, y++) {
				int product = 1;
				for (int i = 0; i < 4; i++) {
					product *= grid[x - i][y + i];
				}
				if (product > largest_product) {
					largest_product = product;
				}
			}
		}
		
		for (int y_start = 1; y_start < grid.length - 3; y_start++) {
			for (int x = grid.length-1, y = y_start; (x >= 3) && (y < grid.length - 3); x--, y++) {
				int product = 1;
				for (int i = 0; i < 4; i++) {
					product *= grid[x - i][y + i];
				}
				if (product > largest_product) {
					largest_product = product;
				}
			}
		}
		
		return largest_product;
	}

	/**
	 * 
	 * @return The largest product of 4 integers that it is possible to make by
	 *         looking only at diagonals that run from TOP-LEFT to BOTTOM-RIGHTin
	 *         <code>grid</code>
	 */
	private int largestProductByTopLeftDiagonals() {
		int largest_product = 0;

		for (int x_start = 0; x_start < grid.length - 3; x_start++) {
			for (int x = x_start, y = 0; (x < grid.length - 3) && (y < grid.length - 3); x++, y++) {
				int product = 1;
				for (int i = 0; i < 4; i++) {
					product *= grid[x + i][y + i];
				}
				if (product > largest_product) {
					largest_product = product;
				}
			}
		}
		
		for (int y_start = 1; y_start < grid.length - 3; y_start++) {
			for (int x = 0, y = y_start; (x < grid.length - 3) && (y < grid.length - 3); x++, y++) {
				int product = 1;
				for (int i = 0; i < 4; i++) {
					product *= grid[x + i][y + i];
				}
				if (product > largest_product) {
					largest_product = product;
				}
			}
		}
		
		return largest_product;
	}

	/**
	 * 
	 * @return The largest product of 4 integers that it is possible to make by
	 *         looking only along rows in <code>grid</code>
	 */
	private int largestProductByRow() {
		int largest_product = 0;
		for (int x = 0; x < (grid[0]).length; x++) {
			for (int y = 0; y < (grid[0]).length - 3; y++) {
				int product = 1;
				for (int i = 0; i < 4; i++) {
					product *= grid[x][y+i];
				}
				if (product > largest_product) {
					largest_product = product;
				}
			}
		}
		return largest_product;
	}

	/**
	 * 
	 * @return The largest product of 4 integers that it is possible to make by
	 *         looking only along columns in <code>grid</code>.
	 */
	private int largestProductByColumn() {
		int largest_product = 0;
		for (int y = 0; y < (grid[0]).length; y++) {
			for (int x = 0; x < (grid[0]).length - 3; x++) {
				int product = 1;
				for (int i = 0; i < 4; i++) {
					product *= grid[x+i][y];
				}
				if (product > largest_product) {
					largest_product = product;
				}
			}
		}
		return largest_product;
	}
}
