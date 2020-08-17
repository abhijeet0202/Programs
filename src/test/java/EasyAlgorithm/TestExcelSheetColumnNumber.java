package EasyAlgorithm;

import org.junit.Assert;
import org.junit.Test;


public class TestExcelSheetColumnNumber {

	@Test
	public void testTitleToNumber() {
		ExcelSheetColumnNumber columnNumber = new ExcelSheetColumnNumber();
		Assert.assertEquals(18957, columnNumber.titleToNumber("ABAC"));
	}
	
	@Test
	public void testTitleToNumber1() {
		ExcelSheetColumnNumber columnNumber = new ExcelSheetColumnNumber();
		Assert.assertEquals(1, columnNumber.titleToNumber("A"));
	}
	
	@Test
	public void testTitleToNumber2() {
		ExcelSheetColumnNumber columnNumber = new ExcelSheetColumnNumber();
		Assert.assertEquals(27, columnNumber.titleToNumber("AA"));
	}
	
	@Test
	public void testTitleToNumber3() {
		ExcelSheetColumnNumber columnNumber = new ExcelSheetColumnNumber();
		Assert.assertEquals(2, columnNumber.titleToNumber("B"));
	}
	
	@Test
	public void testTitleToNumber4() {
		ExcelSheetColumnNumber columnNumber = new ExcelSheetColumnNumber();
		Assert.assertEquals(28, columnNumber.titleToNumber("AB"));
	}

}
