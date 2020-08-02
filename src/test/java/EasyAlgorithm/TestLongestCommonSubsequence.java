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
	
	@Test
	public void testLongestCommonSubsequence2() {
		String text2 = "abcaa";
		String text1 = "ace";
		LongestCommonSubsequence actuals = new LongestCommonSubsequence();
		Assert.assertEquals(2, actuals.longestCommonSubsequence(text1, text2));
	}
	
	@Test
	public void testLongestCommonSubsequence3() {
		String text2 = "abcace";
		String text1 = "ace";
		LongestCommonSubsequence actuals = new LongestCommonSubsequence();
		Assert.assertEquals(3, actuals.longestCommonSubsequenceSingleIndex(text1, text2));
		//Assert.assertEquals(3, actuals.longestCommonSubsequence(text1, text2));
	}

}
