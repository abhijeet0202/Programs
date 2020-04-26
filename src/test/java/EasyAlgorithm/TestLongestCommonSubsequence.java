package EasyAlgorithm;

import org.junit.Assert;
import org.junit.Test;

public class TestLongestCommonSubsequence {

	@Test
	public void testLongestCommonSubsequence() {
		String text1 = "pnjghexybyrgzczy";
		String text2 = "hafcdqbgncrcbihkd";
		LongestCommonSubsequence actuals = new LongestCommonSubsequence();
		Assert.assertEquals(4, actuals.longestCommonSubsequence(text1, text2));
	}
	
	@Test
	public void testLongestCommonSubsequence1() {
		String text1 = "abcde";
		String text2 = "ace";
		LongestCommonSubsequence actuals = new LongestCommonSubsequence();
		Assert.assertEquals(3, actuals.longestCommonSubsequence(text1, text2));
	}

}
