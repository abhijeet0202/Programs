package EasyAlgorithm;

import org.junit.Assert;
import org.junit.Test;


public class TestLeftmostColumnwithatLeastaOne {

	@Test
	public void testLeftMostColumnWithOne() {
		int arr[][] = new int[][] {{0,0},{1,1}};
		BinaryMatrix binaryMatrix = new BinaryMatrix(arr);
		LeftmostColumnwithatLeastaOne one = new LeftmostColumnwithatLeastaOne();
		Assert.assertEquals(0,one.leftMostColumnWithOne(binaryMatrix));
	}
	
	@Test
	public void testLeftMostColumnWithOne1() {
		int arr[][] = new int[][] {{0,0},{0,1}};
		BinaryMatrix binaryMatrix = new BinaryMatrix(arr);
		LeftmostColumnwithatLeastaOne one = new LeftmostColumnwithatLeastaOne();
		Assert.assertEquals(1,one.leftMostColumnWithOne(binaryMatrix));
	}
	
	@Test
	public void testLeftMostColumnWithOne2() {
		int arr[][] = new int[][] {{0,0},{0,0}};
		BinaryMatrix binaryMatrix = new BinaryMatrix(arr);
		LeftmostColumnwithatLeastaOne one = new LeftmostColumnwithatLeastaOne();
		Assert.assertEquals(-1,one.leftMostColumnWithOne(binaryMatrix));
	}
	
	@Test
	public void testLeftMostColumnWithOne3() {
		int arr[][] = new int[][] {{0,0,0,1},{0,0,1,1},{0,1,1,1}};
		BinaryMatrix binaryMatrix = new BinaryMatrix(arr);
		LeftmostColumnwithatLeastaOne one = new LeftmostColumnwithatLeastaOne();
		Assert.assertEquals(1,one.leftMostColumnWithOne(binaryMatrix));
	}

}
