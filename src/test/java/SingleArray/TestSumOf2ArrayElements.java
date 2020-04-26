package SingleArray;


import org.junit.Test;

public class TestSumOf2ArrayElements {

	
	@Test
	public void testSolutions() {
		SumOf2ArrayElements arrayElements = new SumOf2ArrayElements();
		int[] arr = new int[] {0, -1, 2, -3, 1};
		arrayElements.Solutions(arr, -2);
	}
	
	@Test
	public void testSolutionsNegative() {
		SumOf2ArrayElements arrayElements = new SumOf2ArrayElements();
		int[] arr = new int[] {1,2,3,4};
		arrayElements.Solutions(arr, 5);
	}

}
