package EasyAlgorithm;

/**
 * Given a 2D binary matrix filled with 0's and 1's, find the largest square containing only 1's and return its area.
 * Example:  Input: 
 * 			1 0 1 0 0
 * 			1 0 1 1 1
 * 			1 1 1 1 1
 *			1 0 0 1 0
 * 		Output: 4
 * @author ezbanab
 *
 */
public class MaximalSquare {
	public int maximalSquare(char[][] matrix) {
		
		int row = matrix.length;
		int cols = matrix[0].length;
		
		int[][] sub = new int[row][cols];
		// copy the first row
		for (int i = 0; i < cols; i++) {
			sub[0][i] = matrix[0][i] - '0';
		}
		// copy the first column
		for (int i = 0; i < row; i++) {
			sub[i][0] = matrix[i][0] - '0';
		}

		// for rest of the matrix
		// check if arrA[i][j]==1
		for (int i = 1; i < row; i++) {
			for (int j = 1; j < cols; j++) {
				if (matrix[i][j] == '1') {
					sub[i][j] = Math.min(sub[i - 1][j - 1],
							Math.min(sub[i][j - 1], sub[i - 1][j])) + 1;
				} else {
					sub[i][j] = 0;
				}
			}
		}
		// find the maximum size of sub matrix
		int maxSize = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < cols; j++) {
				if (sub[i][j] > maxSize) {
					maxSize = sub[i][j];
				}
			}
		}
		//System.out.println("Maximum size square sub-matrix with all 1s: " + maxSize);
		return maxSize * maxSize;
	}
}
