package EasyAlgorithm;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximalSquare {

	@Test
	public void testMaximalSquare() {
		MaximalSquare maximalSquare = new MaximalSquare();
		char[][] data = new char[][] {{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
		Assert.assertEquals(4, maximalSquare.maximalSquare(data));
	}
	
	@Test
	public void testMaximalSquare1() {
		MaximalSquare maximalSquare = new MaximalSquare();
		char[][] data = new char[][] {{'0','1','1','0','1'},{'1','1','0','1','0'},{'0','1','1','1','0'},{'1','1','1','1','0'},{'1','1','1','1','1'},{'0','0','0','0','0'}};
		Assert.assertEquals(9, maximalSquare.maximalSquare(data));
	}
	
	@Test
	public void testMaximalSquare2() {
		MaximalSquare maximalSquare = new MaximalSquare();
		char[][] data = new char[][] {{'0','1'}};
		Assert.assertEquals(1, maximalSquare.maximalSquare(data));
	}

}
