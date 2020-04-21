package EasyAlgorithm;

/**
 * Given that in a 2D grid, all the 1's are lands and adjacent(horizantal and
 * vertical) things also add up to the island, we need a way to mark all
 * adjacent lands. For example the below grid consist of only one island since
 * all the lands are adjacent to each other
 * 
 * The core logic of solving this problem lies in using Depth First Search(DFS),
 * which involves marking the neighbors as visited once you visit a unvisited
 * land.
 * 
 * We can keep a 2D boolean array called 'visited' and everytime you visit a
 * land which is not visited, you increment the count of islands and mark all of
 * its neighbors as visited. Finally return the island count.
 * 
 * 
 * Example 1:
 * 
 * Input: 11110 11010 11000 00000
 * 
 * Output: 1
 * 
 * Example 2:
 * 
 * Input: 11000 11000 00100 00011
 * 
 * Output: 3
 * 
 * @author ezbanab
 *
 */
public class NumberofIslands {
	public int numIslands(char[][] grid) {
		int height = grid.length;
		if (height == 0)
			return 0;
		int width = grid[0].length;
		boolean[][] visited = new boolean[height][width];
		int islandCount = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (!visited[i][j] && grid[i][j] == '1') {
					markNeigbors(grid, visited, i, j);
					++islandCount;
				}
			}
		}
		return islandCount;
	}

	private void markNeigbors(char[][] grid, boolean[][] visited, int x, int y) {
		int height = grid.length;
		int width = grid[0].length;
		if (x < 0 || x >= height || y < 0 || y >= width || visited[x][y] || grid[x][y] != '1')
			return;
		visited[x][y] = true;
		markNeigbors(grid, visited, x + 1, y);
		markNeigbors(grid, visited, x - 1, y);
		markNeigbors(grid, visited, x, y + 1);
		markNeigbors(grid, visited, x, y - 1);

	}
}
