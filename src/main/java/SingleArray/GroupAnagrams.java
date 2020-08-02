package SingleArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given an array of strings, group anagrams together.
 * 
 * Example:
 * 
 * Input: ["eat", "tea", "tan", "ate", "nat", "bat"]
 *  Output: [["ate","eat","tea"], ["nat","tan"], ["bat"] ]
 * 
 * Note: All inputs will be in lowercase. 
 *       The order of your output does not matter.
 * 
 * @author ezbanab
 *
 */

public class GroupAnagrams {

	public List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> result = new ArrayList<List<String>>();
		Map<String,List<String>> sortedString = new HashMap<String, List<String>>();
		
		for (String str:strs) {
			char[] array = str.toCharArray();
			Arrays.sort(array);
			String sortedStr = new String(array);
			
			if (sortedString.containsKey(sortedStr)) {
				sortedString.get(sortedStr).add(str);
			}else { 
				List<String> temp = new ArrayList<String>();
				temp.add(str);
				sortedString.put(sortedStr, temp);
			}
		}
		for (List<String> tmp: sortedString.values()) {
			result.add(tmp);
		}
		return result;

	}
}
