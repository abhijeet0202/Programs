package SingleArray;

import org.junit.Assert;
import org.junit.Test;



public class TestBackspaceStringCompare {

	@Test
	public void testBackspaceCompare() {
		String S = "ab#c";
		String T = "ad#c";
		
		BackspaceStringCompare backspaceStringCompare = new BackspaceStringCompare();
		Assert.assertEquals(true, backspaceStringCompare.backspaceCompare(S, T));
	}
	
	@Test
	public void testBackspaceCompare1() {
		String S = "ab##";
		String T = "c#d#";
		
		BackspaceStringCompare backspaceStringCompare = new BackspaceStringCompare();
		Assert.assertEquals(true, backspaceStringCompare.backspaceCompare(S, T));
	}
	
	@Test
	public void testBackspaceCompare2() {
		String S = "a##c";
		String T = "#a#c";
		
		BackspaceStringCompare backspaceStringCompare = new BackspaceStringCompare();
		Assert.assertEquals(true, backspaceStringCompare.backspaceCompare(S, T));
	}
	
	@Test
	public void testBackspaceCompare3() {
		String S = "a#c";
		String T = "b";
		
		BackspaceStringCompare backspaceStringCompare = new BackspaceStringCompare();
		Assert.assertEquals(false, backspaceStringCompare.backspaceCompare(S, T));
	}

}
