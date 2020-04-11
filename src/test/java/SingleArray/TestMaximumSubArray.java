package SingleArray;


import org.junit.Assert;
import org.junit.Test;


public class TestMaximumSubArray {

	@Test
	public void testMaxSubArraySum() {
		MaximumSubArray maximumSubArray = new MaximumSubArray();
		int[] a = new int[]{-2,1,-3,4,-1,2,1,-5,4};
		Assert.assertEquals(6,maximumSubArray.maxSubArraySum(a));
	}

}
