package EasyAlgorithm;

import org.junit.Assert;
import org.junit.Test;

public class TestHappyNumber {

	@Test
	public void testIsHappyFalse() {
		HappyNumber happyNumber = new HappyNumber();
		Assert.assertFalse(happyNumber.isHappy(3));
	}
	@Test
	public void testIsHappyTrue() {
		HappyNumber happyNumber = new HappyNumber();
		Assert.assertTrue(happyNumber.isHappy(19));
	}

}
