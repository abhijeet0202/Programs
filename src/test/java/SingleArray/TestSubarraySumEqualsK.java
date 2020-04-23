package SingleArray;

import org.junit.Assert;
import org.junit.Test;

public class TestSubarraySumEqualsK {

	@Test
	public void testSubarraySum() {
		SubarraySumEqualsK  equalsK = new SubarraySumEqualsK();
		int[] arr = new int[] {2, 2, 2, 2, 2,5,5,4,4,2};
		int actual = equalsK.subarraySum(arr, 10);
		Assert.assertEquals(3, actual);
	}

	@Test
	public void testSubarraySum1() {
		SubarraySumEqualsK  equalsK = new SubarraySumEqualsK();
		int[] arr = new int[] {1, 1, 1};
		int actual = equalsK.subarraySum(arr, 2);
		Assert.assertEquals(2, actual);
	}
	
	@Test
	public void testSubarraySum2() {
		SubarraySumEqualsK  equalsK = new SubarraySumEqualsK();
		int[] arr = new int[] {1, 2, 3};
		int actual = equalsK.subarraySum(arr, 3);
		Assert.assertEquals(2, actual);
	}
	
	@Test
	public void testSubarraySum3() {
		SubarraySumEqualsK  equalsK = new SubarraySumEqualsK();
		int[] arr = new int[] {1};
		int actual = equalsK.subarraySum(arr, 0);
		Assert.assertEquals(0, actual);
	}
	
	@Test
	public void testSubarraySum4() {
		SubarraySumEqualsK  equalsK = new SubarraySumEqualsK();
		int[] arr = new int[] {0,0,0,0,0,0,0,0,0,0};
		int actual = equalsK.subarraySum(arr, 0);
		Assert.assertEquals(55, actual);
	}
}
