package SingleArray;

import org.junit.Test;

public class TestHIndex {

	@Test
	public void testHIndex() {
		HIndex hIndex = new HIndex();
		int arr[] = new int[] {3,0,6,1,5};
		System.out.println(hIndex.hIndex(arr));
	}

}
