package EasyAlgorithm;

/**
 * Given a m x n grid filled with non-negative numbers, find a path from top
 * left to bottom right which minimizes the sum of all numbers along its path.
 * 
 * Note: You can only move either down or right at any point in time.
 * 
 * Example:
 * 
 * Input: [  [1,3,1],
 * 			 [1,5,1], 
 * 			 [4,2,1] 
 * 		  ] 
 * Output: 7 
 * Explanation: Because the path 1->3->1->1->1 minimizes the sum.
 * 
 * 
 * @author Abhijeet
 *
 */ 
public class MinimumPathSum {
	public int minPathSum(int[][] grid) {
		return minCost(grid, 0, 0);

	}
	private int minCost(int[][] grid, int height,int width) {
		if(height> grid.length-1 || width > grid[0].length-1) {
			return Integer.MAX_VALUE;
		}
		if(height == grid.length-1 && width == grid[0].length-1) 
			return grid[height][width];
		
		return grid[height][width] + Math.min(minCost(grid, height+1, width), minCost(grid, height, width+1));
	}
	
	public int minPathSum1(int[][] grid) {
		if(grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        
        int m = grid.length;
        int n = grid[0].length;
        int[] dp = new int[n + 1];
        
        for(int j = 1; j <= n; j++) {
            dp[j] = dp[j - 1] + grid[0][j - 1];
        }
        
        dp[0] = Integer.MAX_VALUE; 
        for(int i = 1; i < m; i++) {
            for(int j = 1; j <= n; j++) {
                dp[j] = Math.min(dp[j - 1], dp[j]) + grid[i][j - 1];
            }
        }
        return dp[n];
	}
}
