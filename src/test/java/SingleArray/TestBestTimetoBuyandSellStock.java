package SingleArray;

import org.junit.Assert;
import org.junit.Test;


public class TestBestTimetoBuyandSellStock {

	@Test
	public void testMaxProfit_I() {
		int[] arr = new int[] {7,1,5,3,6,4};
		BestTimetoBuyandSellStock stockII = new BestTimetoBuyandSellStock();
		Assert.assertEquals(5,stockII.maxProfit_I(arr));
	}
	
	@Test
	public void testMaxProfit_I_1() {
		int[] arr = new int[] {1,2,3,4,5};
		BestTimetoBuyandSellStock stockII = new BestTimetoBuyandSellStock();
		Assert.assertEquals(4,stockII.maxProfit_II(arr));
	}
	
	@Test
	public void testMaxProfit_II() {
		int[] arr = new int[] {7,1,5,3,6,4};
		BestTimetoBuyandSellStock stockII = new BestTimetoBuyandSellStock();
		Assert.assertEquals(7,stockII.maxProfit_II(arr));
	}
	
	@Test
	public void testMaxProfit_II_1() {
		int[] arr = new int[] {1,2,3,4,5};
		BestTimetoBuyandSellStock stockII = new BestTimetoBuyandSellStock();
		Assert.assertEquals(4,stockII.maxProfit_II(arr));
	}
	
	@Test
	public void testMaxProfit_II_2() {
		int[] arr = new int[] {7,6,4,3,1};
		BestTimetoBuyandSellStock stockII = new BestTimetoBuyandSellStock();
		Assert.assertEquals(0,stockII.maxProfit_II(arr));
	}

}
