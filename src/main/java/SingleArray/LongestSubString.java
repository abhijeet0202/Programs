package SingleArray;

import java.util.HashSet;
import java.util.Set;

/**
 * Given a string, find the length of the longest substring without repeating characters.

Example 1:

Input: "abcabcbb"
Output: 3 
Explanation: The answer is "abc", with the length of 3. 

Example 2:

Input: "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

Example 3:

Input: "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3. 
             Note that the answer must be a substring, "pwke" is a subsequence and not a substring.


 * @author ezbanab
 *
 */

/**
 * Solution description:
		It is a sliding window approach.
			i is maintained as the starting index of window.
			j is taken to iterate the string, one character at a time.
		Also, i and j is used to calculate the substring string length (starting from i and ending at j)
			[ (j - i ) would give the length of the substring string ], keeping the largest substring length using "ans".
		Set is taken to work on duplicated character:
		Whenever a unique character is encountered, it is added to the Set, j is incremented by 1, ans is recalculated
		to get the maximum length. i remains at its place.

 		  0   1    2     3    4     5
		| a | b  | c  |  b |  d  |  e  |
 		  <-------------->
          i                j    i and j position before encountered b (duplicated, 3rd index)
 
		Whenever a duplicate character is encountered, ith character is removed from the Set,
		i is incremented by 1, j at its place. So, in next iteration, loop is again trying to add the jth character from the string to the Set.

 		  0   1    2     3    4     5
		| a | b  | c  |  b |  d  |  e  |
              <---------->
              i          j    i incremented, j still at b (duplicated, 3rd index)
                    <---->                        
                   i     j    b (earlier one in the set) removed, i is at c, j will add b (3th index)
   				   <---------------->            
  				   i                j      at the end i and j position, and ans would be calculated on this.

 * @author ezbanab
 *
 */
public class LongestSubString {
	
	public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            // try to extend the range [i, j]
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            }
            else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }

	public static void main(String[] args) {
		LongestSubString longestSubString = new LongestSubString();
		System.out.println(longestSubString.lengthOfLongestSubstring("abcbde"));

	}

}
