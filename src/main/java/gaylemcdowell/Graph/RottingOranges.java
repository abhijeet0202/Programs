package gaylemcdowell.Graph;

import java.util.LinkedList;
import java.util.Queue;

/**
 * In a given grid, each cell can have one of three values:
 * 
 * the value 0 representing an empty cell; the value 1 representing a fresh
 * orange; the value 2 representing a rotten orange. Every minute, any fresh
 * orange that is adjacent (4-directionally) to a rotten orange becomes rotten.
 * 
 * Return the minimum number of minutes that must elapse until no cell has a
 * fresh orange. If this is impossible, return -1 instead.
 * 
 * Input: [[2,1,1],[1,1,0],[0,1,1]]
 * 		Min 0			Min 1		  Min 2			 Min 3			Min 4
 *   2	1	1		2	2	1		2	2	2		2	2	2		2	2	2
 *   1	1	0		2	1	0		2	2	0		2	2	0		2	2	0
 *   0	1	1		0	1	1		0	1	1		0	2	1		0	2	2
 *  Output: 4
 * 
 * Example 2: * 
 * Input: [[2,1,1],[0,1,1],[1,0,1]] 
 * 		Min 0			Min 1		  Min 2			 Min 3			Min 4
 *   2	1	1		2	2	1		2	2	2		2	2	2		2	2	2
 *   0	1	1		0	1	1		0	2	1		0	2	2		0	2	2
 *   1	0	1		1	0	1		1	0	1		1	0	1	    *1	0	2
 * Output: -1 
 * Explanation: The orange in the bottom left corner (row 2, column 0) is never rotten, because rotting only happens 4-directional
 * 
 * Example 3:

	Input: [[0,2]]
	Output: 0
	Explanation:  Since there are already no fresh oranges at minute 0, the answer is just 0.
 * @author Abhijeet
 *
 */
public class RottingOranges {
	public int orangesRotting(int[][] grid) {
		Queue<int[]> q = new LinkedList<int[]>();

		/*
		 * First loop over all grid elements count the fresh orange in freshCount and
		 * co-ordinates(x,y) for rotten orange into queue.
		 */
		int freshCount = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == 2)
					q.add(new int[]{i, j}); // add all rotten orange indices pair in queue
				if (grid[i][j] == 1)
					freshCount++; // count fresh oranges
			}
		}

		/*
		 * int[][] direction = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}}; define 4 direction
		 * array for 4 adjacent neighbors and time to count minutes needed.
		 */
		int[][] direction = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}}; // defined 4 direction 2d-array
		
		int time = 0;
		
		/*
		 * Loop over until queue not empty and freshCount > 0, Now we know have all
		 * the rotten orange for first-level into our queue we will check 4-direction
		 * oranges if it is fresh make it rotten and decrease freshCount by 1 every time
		 * when we found fresh orange otherwise just continue
		 */
		while (!q.isEmpty() && freshCount > 0) {
			time++;
			int size = q.size();
			while (size-- > 0) {
				int[] xy = q.poll(); // poll rotten oranges from queue
				for (int[] d : direction) {
					int x = xy[0] + d[0];
					int y = xy[1] + d[1];
					// continue if x or y out of grid or grid don't have fresh orange
					if (x < 0 || y < 0 || x >= grid.length || y >= grid[0].length || grid[x][y] == 0 || grid[x][y] == 2)
						continue;
					q.add(new int[]{x, y}); // add indices pair of fresh orange in queue
					grid[x][y] = 2; // mark fresh orange to rotten - kind of marking visited 
					freshCount--; // decrease freshCount
				}
			}
		}
		/*
		 * Once loop break check if freshCount == 0 return time else -1 not possible.
		 */
		return freshCount == 0 ? time : -1;
	}
}
