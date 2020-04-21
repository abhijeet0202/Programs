package EasyAlgorithm;

import org.junit.Assert;
import org.junit.Test;


public class TestNumberofIslands {

	@Test
	public void testNumIslands() {
		NumberofIslands islands = new NumberofIslands();
		char[][] arr = new char[][] {{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};
		Assert.assertEquals(1,islands.numIslands(arr));
	}
	
	@Test
	public void testNumIslands1() {
		NumberofIslands islands = new NumberofIslands();
		char[][] arr = new char[][] {{'1','1','0','0','0'}, {'1','1','0','0','0'}, {'0','0','1','0','0'}, {'0','0','0','1','1'}};
		Assert.assertEquals(3,islands.numIslands(arr));
	}

}
