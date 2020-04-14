package SingleArray;

import org.junit.Test;

public class TestPerformStringShifts {

	@Test
	public void testStringShift() {
		PerformStringShifts performStringShifts = new PerformStringShifts();
		String str = "abcdefg";
		int[][] myArr = new int[][] {{1,1},{1,1},{0,2},{0,3}};
		
		performStringShifts.stringShift(str, myArr);
	}
	
	@Test
	public void testStringShift1() {
		PerformStringShifts performStringShifts = new PerformStringShifts();
		String str = "abc";
		int[][] myArr = new int[][] {{0,1},{1,2}};
		
		performStringShifts.stringShift(str, myArr);
	}
	
	@Test
	public void testStringShift2() {
		PerformStringShifts performStringShifts = new PerformStringShifts();
		String str = "mecsk";
		int[][] myArr = new int[][] {{1,4},{0,5},{0,4},{1,1},{1,5}};
		
		performStringShifts.stringShift(str, myArr);
	}
	
	@Test
	public void testStringShift3() {
		PerformStringShifts performStringShifts = new PerformStringShifts();
		String str = "yisxjwry";
		int[][] myArr = new int[][] {{1,8},{1,4},{1,3},{1,6},{0,6},{1,4},{0,2},{0,1}};
		
		performStringShifts.stringShift(str, myArr);
	}
	
	@Test
	public void testStringShift4() {
		PerformStringShifts performStringShifts = new PerformStringShifts();
		String str = "xqgwkiqpif";
		int[][] myArr = new int[][] {{1,4},{0,7},{0,8},{0,7},{0,6},{1,3},{0,1},{1,7},{0,5},{0,6}};
		
		performStringShifts.stringShift(str, myArr);
	}
	
	@Test
	public void testStringShift5() {
		PerformStringShifts performStringShifts = new PerformStringShifts();
		String str = "joiazl";
		int[][] myArr = new int[][] {{1,1},{1,6},{0,1},{1,3},{1,0},{0,3}};
		
		performStringShifts.stringShift(str, myArr);
	}

}
