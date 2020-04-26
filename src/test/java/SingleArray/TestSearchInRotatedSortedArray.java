package SingleArray;


import org.junit.Assert;
import org.junit.Test;


public class TestSearchInRotatedSortedArray {

	@Test
	public void testSearch() {
		SearchInRotatedSortedArray array = new SearchInRotatedSortedArray();
		int arr[] = new int[] {4,5,6,7,0,1,2};
		Assert.assertEquals(4, array.search(arr, 0));
	}
	
	@Test
	public void testSearch1() {
		SearchInRotatedSortedArray array = new SearchInRotatedSortedArray();
		int arr[] = new int[] {4,5,6,7,0,1,2};
		Assert.assertEquals(-1, array.search(arr, 3));
	}

}
