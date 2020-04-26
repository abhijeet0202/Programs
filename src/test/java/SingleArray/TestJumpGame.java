package SingleArray;

import org.junit.Assert;
import org.junit.Test;

public class TestJumpGame {

	@Test
	public void testCanJump() {
		JumpGame jumpGame = new JumpGame();
		int arr[] = new int[] {2,3,1,1,4};
		Assert.assertEquals(true, jumpGame.canJump(arr));
	}
	
	@Test
	public void testCanJump1() {
		JumpGame jumpGame = new JumpGame();
		int arr[] = new int[] {3,2,1,0,4};
		Assert.assertEquals(false, jumpGame.canJump(arr));
	}

}
