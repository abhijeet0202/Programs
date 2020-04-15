package SingleArray;

import org.junit.Assert;
import org.junit.Test;


public class TestLastStoneWeight {


	@Test
	public void testLastStoneWeight() {
		LastStoneWeight lastStoneWeight = new LastStoneWeight();
		int arr[] = new int[] {2,7,4,1,8,1};
		Assert.assertEquals(1, lastStoneWeight.lastStoneWeight(arr));
	}

}
