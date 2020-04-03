package SingleArray;

import org.junit.Assert;
import org.junit.Test;

public class TestSingleNumber {

	@Test
	public void test1() {
		SingleNumber singleNumber = new SingleNumber();
		int []nums = new int[] {2,2,1};
		Assert.assertEquals(1, singleNumber.singleNumber(nums));
	}
	
	@Test
	public void test2() {
		SingleNumber singleNumber = new SingleNumber();
		int []nums = new int[] {4,1,2,1,2};
		Assert.assertEquals(4, singleNumber.singleNumber(nums));
	}

}
