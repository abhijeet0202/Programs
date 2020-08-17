package SingleArray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GroupShiftedString {

	final int ALPHA = 26; // Total lowercase letter
	// Method to a difference string for a given string.
	// If string is "adf" then difference string will be
	// "cb" (first difference 3 then difference 2)

	private String getDiffString(String str) {
		String shift = "";
		for (int i = 1; i < str.length(); i++) {
			int dif = str.charAt(i) - str.charAt(i - 1);
			if (dif < 0)
				dif += ALPHA;

			// Representing the difference as char
			shift += (dif + 'a');
		}

		// This string will be 1 less length than str
		return shift;
	}

	// Method for grouping shifted string
	void groupShiftedString(String str[]) {
		// map for storing indices of string which are
		// in same group
		Map<String, ArrayList<String>> groupMap = new HashMap<String, ArrayList<String>>();
		for (String single : str) {
			ArrayList<String> myData;
			String diffStr = getDiffString(single);
			if (groupMap.containsKey(diffStr)) {
				myData = groupMap.get(diffStr);

			} else {
				myData = new ArrayList<String>();
			}
			myData.add(single);
			groupMap.put(diffStr, myData);
		}

		// iterating through map to print group
		for (Map.Entry<String, ArrayList<String>> myGrouped : groupMap.entrySet()) {
			System.out.println(myGrouped.getValue());
		}
	}

	public static void main(String[] args) {
		GroupShiftedString groupShiftedString = new GroupShiftedString();
		String str[] = { "acd", "dfg", "wyz", "yab", "mop", "bdfh", "a", "x", "moqs" };
		groupShiftedString.groupShiftedString(str);

	}

}
