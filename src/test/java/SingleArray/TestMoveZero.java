package SingleArray;

import org.junit.Assert;
import org.junit.Test;

public class TestMoveZero {


	@Test
	public void testMoveZeroes() {
		MoveZeros moveZeros = new MoveZeros();
		int actuals[] = new int[] {0,1,0,3,12};
		int expected[] = new int[] {1,3,12,0,0};
		moveZeros.moveZeroes(actuals);
		Assert.assertArrayEquals(expected, actuals);
	}
	
	@Test
	public void testMoveZeroes1() {
		MoveZeros moveZeros = new MoveZeros();
		int actuals[] = new int[] {1,2,0,3,4};
		int expected[] = new int[] {1,2,3,4,0};
		moveZeros.moveZeroes(actuals);
		Assert.assertArrayEquals(expected, actuals);
	}

}
