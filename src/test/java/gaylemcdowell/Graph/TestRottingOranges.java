package gaylemcdowell.Graph;

import org.junit.Assert;
import org.junit.Test;


public class TestRottingOranges {

	@Test
	public void testOrangesRotting1() {
		RottingOranges oranges = new RottingOranges();
		Assert.assertEquals(4, oranges.orangesRotting(new int[][] {{2,1,1},{1,1,0},{0,1,1}}));
	}
	
	@Test
	public void testOrangesRotting2() {
		RottingOranges oranges = new RottingOranges();
		Assert.assertEquals(-1, oranges.orangesRotting(new int[][] {{2,1,1},{0,1,1},{1,0,1}}));
	}
	
	@Test
	public void testOrangesRotting3() {
		RottingOranges oranges = new RottingOranges();
		Assert.assertEquals(0, oranges.orangesRotting(new int[][] {{0,2}}));
	}

}
