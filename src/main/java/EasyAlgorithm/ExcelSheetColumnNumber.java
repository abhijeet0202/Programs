package EasyAlgorithm;

/**
 * Given a column title as appear in an Excel sheet, return its corresponding
 * column number.
 * 
 * For example:
 * 
 * A -> 1 
 * B -> 2 
 * C -> 3 
 * ... 
 * Z -> 26 
 * AA -> 27 
 * AB -> 28 
 * ... 
 * 
 * Example 1: 
 * Input: "A" Output: 1 
 * 
 * Example 2: * 
 * Input: "AB" Output: 28 
 * 
 * Example 3: * 
 * Input: "ZY" Output: 701
 * 
 * 
 * Constraints:
 * 
 * 1 <= s.length <= 7 s consists only of uppercase English letters. s is between
 * "A" and "FXSHRXW".
 * 
 * @author ezbanab
 *
 */
public class ExcelSheetColumnNumber {
	public int titleToNumber(String s) {
//		int length = s.length();
//		int count =s.charAt(length-1)-'A'+1;
//		if(count >1 && length>1)
//			count=(int) (count+ Math.pow(26, count-1));
//		
//		for(int i=length-2; i>=0;i--) {
//			count+=Math.pow(26, i+1); 
//			System.out.println(count);
//		}
//		
//		return count;
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			 count = count * 26 + (s.charAt(i) - 'A' + 1);
		}
		return count;
    }
}
