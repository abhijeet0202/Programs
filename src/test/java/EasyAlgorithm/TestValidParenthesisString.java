package EasyAlgorithm;

import org.junit.Assert;
import org.junit.Test;

import EasyAlgorithm.ValidParenthesisString;

public class TestValidParenthesisString {

	@Test
	public void testcheckValidString() {
		ValidParenthesisString parenthesisString = new ValidParenthesisString();
		String s = "(*))";
		Assert.assertEquals(true, parenthesisString.checkValidString(s));
	}
	
	@Test
	public void testcheckValidString1() {
		ValidParenthesisString parenthesisString = new ValidParenthesisString();
		String s = "((*)";
		Assert.assertEquals(true, parenthesisString.checkValidString(s));
	}
	
	@Test
	public void testcheckValidString2() {
		ValidParenthesisString parenthesisString = new ValidParenthesisString();
		String s = "((*))";
		Assert.assertEquals(true, parenthesisString.checkValidString(s));
	}
	
	@Test
	public void testcheckValidString3() {
		ValidParenthesisString parenthesisString = new ValidParenthesisString();
		String s = "((((((((((((((((())))))(*))";
		Assert.assertEquals(false, parenthesisString.checkValidString(s));
		System.out.println(parenthesisString.checkValidString(s));
	}
	@Test
	public void testcheckValidString4() {
		ValidParenthesisString parenthesisString = new ValidParenthesisString();
		String s = "()";
		Assert.assertEquals(true, parenthesisString.checkValidString(s));
		System.out.println(parenthesisString.checkValidString(s));
	}
	
	@Test
	public void testcheckValidString5() {
		ValidParenthesisString parenthesisString = new ValidParenthesisString();
		String s = ")";
		Assert.assertEquals(false, parenthesisString.checkValidString(s));
		System.out.println(parenthesisString.checkValidString(s));
	}
	
	@Test
	public void testcheckValidString6() {
		ValidParenthesisString parenthesisString = new ValidParenthesisString();
		String s ="(())((())()()(*)(*()(())())())()()((()())((()))(*";
		Assert.assertEquals(false, parenthesisString.checkValidString(s));
		System.out.println(parenthesisString.checkValidString(s));
	}
	
	@Test
	public void testcheckValidString7() {
		ValidParenthesisString parenthesisString = new ValidParenthesisString();
		String s ="((***(";
		Assert.assertEquals(false, parenthesisString.checkValidString(s));
		System.out.println(parenthesisString.checkValidString(s));
	}

}
