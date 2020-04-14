package SingleArray;

import org.junit.Assert;
import org.junit.Test;



public class TestContiguousArray {

	@Test
	public void testFindMaxLength() {
		ContiguousArray contiguousArray = new ContiguousArray();
		int[] arr = new int[] {0,1,0};
		Assert.assertEquals(2, contiguousArray.findMaxLength(arr));
	}
	
	@Test
	public void testFindMaxLength1() {
		ContiguousArray contiguousArray = new ContiguousArray();
		int[] arr = new int[] {0,1,0,1,0,1,1,0,1,0,1,0,1,0,1,0};
		Assert.assertEquals(16, contiguousArray.findMaxLength(arr));
	}
	
	@Test
	public void testFindMaxLength2() {
		ContiguousArray contiguousArray = new ContiguousArray();
		//int[] arr = new int[] {0,0,0,1,1,1,0};
		int[] arr = new int[] {1,1,0,1,0,0};
		Assert.assertEquals(6, contiguousArray.findMaxLength(arr));
	}
	
	@Test
	public void testFindMaxLength3() {
		ContiguousArray contiguousArray = new ContiguousArray();
		int[] arr = new int[] {0,1,1,0,1,1,1,0};
		Assert.assertEquals(4, contiguousArray.findMaxLength(arr));
	}

}
