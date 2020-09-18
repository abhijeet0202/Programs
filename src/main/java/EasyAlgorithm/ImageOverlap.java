package EasyAlgorithm;

/**
 * Two images A and B are given, represented as binary, square matrices of the
 * same size. (A binary matrix has only 0s and 1s as values.)
 * 
 * We translate one image however we choose (sliding it left, right, up, or down
 * any number of units), and place it on top of the other image. After, the
 * overlap of this translation is the number of positions that have a 1 in both
 * images.
 * 
 * (Note also that a translation does not include any kind of rotation.)
 * 
 * What is the largest possible overlap?
 * 
 * Example 1:
 * 
 * Input: A = [[1,1,0], 
 * 			   [0,1,0], 
 *             [0,1,0]] 
 *        B = [[0,0,0], 
 *        	   [0,1,1], 
 *        	   [0,0,1]]
 * Output: 3 Explanation: We slide A to right by 1 unit and down by 1 unit.
 * Notes:
 * 
 * 1 <= A.length = A[0].length = B.length = B[0].length <= 30 0 <= A[i][j],
 * B[i][j] <= 1
 * 
 * @author ezbanab
 *
 */
public class ImageOverlap {
	public int largestOverlap(int[][] A, int[][] B) {
		int maximumOverlap = 0;

		for (int yShift = 0; yShift < A.length; yShift++) {
			for (int xShift = 0; xShift < A.length; xShift++) {
				maximumOverlap = Math.max(maximumOverlap, shiftAndRotate(xShift, yShift, A, B));
				maximumOverlap = Math.max(maximumOverlap, shiftAndRotate(xShift, yShift, B, A));
			}
		}
		return maximumOverlap;
	}

	private int shiftAndRotate(int xShift, int yShift, int M[][], int R[][]) {
		int count = 0;
		int rRow = 0;
		// count the cells of ones in the overlapping zone.
		for (int mRow = yShift; mRow < M.length; ++mRow) {
			int rCol = 0;
			for (int mCol = xShift; mCol < M.length; ++mCol) {
				if (M[mRow][mCol] == 1 && M[mRow][mCol] == R[rRow][rCol])
					count += 1;
				rCol += 1;
			}
			rRow += 1;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImageOverlap imageOverlap = new ImageOverlap();
		int[][] A = new int[][] { { 1, 1, 0 }, { 0, 1, 0 }, { 0, 1, 0 } };
		int B[][] = new int[][] { { 0, 0, 0 }, { 0, 1, 1 }, { 0, 0, 1 } };

		System.out.println(imageOverlap.largestOverlap(A, B));
	}

}
