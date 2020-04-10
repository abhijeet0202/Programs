package SingleArray;

import org.junit.Assert;
import org.junit.Test;


public class TestCountingElements {

	@Test
	public void test1() {
		CountingElements countingElements = new CountingElements();
		int[] arr = new int[] {1,2,3};
		Assert.assertEquals(2, countingElements.countElements(arr));
	}
	
	@Test
	public void test2() {
		CountingElements countingElements = new CountingElements();
		int[] arr = new int[] {1,1,3,3,5,5,7,7};
		Assert.assertEquals(0, countingElements.countElements(arr));
	}
	
	@Test
	public void test3() {
		CountingElements countingElements = new CountingElements();
		int[] arr = new int[] {1,3,2,3,5,0};
		Assert.assertEquals(3, countingElements.countElements(arr));
	}
	
	@Test
	public void test4() {
		CountingElements countingElements = new CountingElements();
		int[] arr = new int[] {1,1,2,2};
		Assert.assertEquals(2, countingElements.countElements(arr));
	}

}
