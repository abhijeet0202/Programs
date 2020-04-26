package EasyAlgorithm;

import org.junit.Assert;
import org.junit.Test;

public class TestMinimumPathSum {

	@Test
	public void testMinPathSum() {
		MinimumPathSum minimumPathSum = new MinimumPathSum();
		int grid[][] = new int[][] {{1,3,1},{1,5,1},{4,2,1}};
		Assert.assertEquals(7, minimumPathSum.minPathSum1(grid));
	}

}
