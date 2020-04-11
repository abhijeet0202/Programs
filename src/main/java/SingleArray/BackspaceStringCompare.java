package SingleArray;

import java.util.Stack;

/**
 * Given two strings S and T, return if they are equal when both are typed into
 * empty text editors. # means a backspace character.
 * 
 * Example 1: 
 * Input: S = "ab#c", T = "ad#c" 
 * Output: true 
 * Explanation: Both S and T become "ac".
 * 
 * Example 2: * 
 * Input: S = "ab##", T = "c#d#" 
 * Output: true 
 * Explanation: Both S and T become "".
 * 
 * Example 3: 
 * Input: S = "a##c", T = "#a#c" 
 * Output: true 
 * Explanation: Both S and T become "c".
 * 
 * Example 4: 
 * Input: S = "a#c", T = "b" 
 * Output: false 
 * Explanation: S becomes "c" while T becomes "b".
 * 
 * Note: 
 * 	1 <= S.length <= 200 
 *  1 <= T.length <= 200 
 *  S and T only contain lowercase letters and '#' characters.
 * 
 * Follow up:
 * 
 * Can you solve it in O(N) time and O(1) space?
 * 
 * @author Abhijeet
 *
 */

public class BackspaceStringCompare {

	public boolean backspaceCompare(String S, String T) {
		Stack<Character> sObj= new Stack<Character>();
		Stack<Character> tObj = new Stack<Character>();
		for(int i=0; i<S.length(); i++) {
			if(S.charAt(i) == '#') {
				if( !sObj.isEmpty())
					sObj.pop();
			}else {
				sObj.add(S.charAt(i));
			}
		}
		
		for(int i=0; i<T.length(); i++) {
			if(T.charAt(i) == '#') {
				if( !tObj.isEmpty())
				tObj.pop();
			}else {
				tObj.add(T.charAt(i));
			}
		}
		
		while(!sObj.isEmpty() && !tObj.isEmpty()) {
			if(sObj.pop() != tObj.pop()) {
				return false;
			}
		}
		
		if(!sObj.isEmpty() || !tObj.isEmpty()) {
			return false;
		}
		return true;
	}

}
