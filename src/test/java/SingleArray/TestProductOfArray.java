package SingleArray;

import org.junit.Assert;
import org.junit.Test;

public class TestProductOfArray {

	@Test
	public void testProductPuzzle1WithSingleZero() {
		int a[] = { 10, 3, 0, 6, 2 };
		int []expecteds = {0,0,360,0,0};
		ProductOfArray productOfArray = new ProductOfArray();
		Assert.assertArrayEquals(expecteds, productOfArray.productPuzzle(a, a.length));
	}

	@Test
	public void testProductPuzzleWithSingleZero() {
		int a[] = { 10, 3, 0, 6, 2 };
		int []expecteds = {0,0,360,0,0};
		ProductOfArray productOfArray = new ProductOfArray();
		Assert.assertArrayEquals(expecteds, productOfArray.productPuzzle1(a, a.length));
	}
	
	@Test
	public void testProductPuzzle1WithDoubleZero() {
		int a[] = { 10, 3, 0, 0, 2 };
		int []expecteds = {0,0,0,0,0};
		ProductOfArray productOfArray = new ProductOfArray();
		Assert.assertArrayEquals(expecteds, productOfArray.productPuzzle(a, a.length));
	}

	@Test
	public void testProductPuzzleWithDoubleZero() {
		int a[] = { 0, 3, 0, 6, 2 };
		int []expecteds = {0,0,0,0,0};
		ProductOfArray productOfArray = new ProductOfArray();
		Assert.assertArrayEquals(expecteds, productOfArray.productPuzzle1(a, a.length));
	}
	
	@Test
	public void testProductPuzzle1WithNoZero() {
		int a[] = { 1, 2, 3, 4, 5 };
		int []expecteds = {120, 60, 40, 30, 24};
		ProductOfArray productOfArray = new ProductOfArray();
		Assert.assertArrayEquals(expecteds, productOfArray.productPuzzle(a, a.length));
	}

	@Test
	public void testProductPuzzleWithNoZero() {
		int a[] = { 1, 2, 3, 4, 5 };
		int []expecteds = {120, 60, 40, 30, 24};
		ProductOfArray productOfArray = new ProductOfArray();
		Assert.assertArrayEquals(expecteds, productOfArray.productPuzzle1(a, a.length));
	}

}
