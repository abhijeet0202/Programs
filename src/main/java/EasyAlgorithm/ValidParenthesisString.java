package EasyAlgorithm;

/**
 * Given a string containing only three types of characters: '(', ')' and '*',
 * write a function to check whether this string is valid. We define the
 * validity of a string by these rules:
 * 
 * Any left parenthesis '(' must have a corresponding right parenthesis ')'.
 * Left parenthesis '(' must go before the corresponding right parenthesis ')'.
 * '*' could be treated as a single right parenthesis ')' or a single left parenthesis '(' 
 *    or an empty string. An empty string is also valid.
 * 
 * Example 1:
 * 	Input: "()" 
 * 	Output: True
 * 
 * Example 2:
 * 	Input: "(*)" 
 * 	Output: True
 * 
 * Example 3:
 * 	Input: "(*))" 
 * 	Output: True
 * 
 * Note:The string size will be in the range [1, 100].
 * 
 * @author Abhijeet
 *
 */
public class ValidParenthesisString {	
	public boolean checkValidString(String s) {
		int high = 0;		int low = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				high++;
				low++;
			} else if (s.charAt(i) == '*') {
				high++;
				if (low > 0)
					low--;
			} else if (s.charAt(i) == ')') {
				high--;
				if (low > 0)
					low--;
			}

			if (high < 0)
				return false;
		}

		if (low == 0)
			return true;

		return false;
	}
}
