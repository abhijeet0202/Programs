package EasyAlgorithm;

import org.junit.Assert;
import org.junit.Test;


public class TestBitwiseANDofNumbersRange {

	@Test
	public void testObject() {
		BitwiseANDofNumbersRange anDofNumbersRange = new BitwiseANDofNumbersRange();
		Assert.assertEquals(4,anDofNumbersRange.rangeBitwiseAnd(5, 7));
	}
	
	@Test
	public void testObject1() {
		BitwiseANDofNumbersRange anDofNumbersRange = new BitwiseANDofNumbersRange();
		Assert.assertEquals(0,anDofNumbersRange.rangeBitwiseAnd(0, 1));
	}
	
	@Test
	public void testObject2() {
		BitwiseANDofNumbersRange anDofNumbersRange = new BitwiseANDofNumbersRange();
		Assert.assertEquals(0, anDofNumbersRange.rangeBitwiseAnd(1, 2480));
	}

}
