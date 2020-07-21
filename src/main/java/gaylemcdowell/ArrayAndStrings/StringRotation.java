package gaylemcdowell.ArrayAndStrings;

public class StringRotation {

	public static boolean isSubstring(String str1, String str2) {

		if (str1.length() != str2.length())
			return false;

		if (str1.length() > 0) {
			String s1s1 = str1 + str1;
			if (s1s1.indexOf(str2) > 0)
				return true;
		}
		return false;

	}

	public static void main(String[] args) {
		String[][] pairs = { { "apple", "pleap" }, { "waterbottle", "erbottlewat" }, { "camera", "macera" } };
		for (String[] pair : pairs) {
			String word1 = pair[0];
			String word2 = pair[1];
			boolean is_rotation = isSubstring(word1, word2);
			System.out.println(word1 + ", " + word2 + ": " + is_rotation);
		}
	}

}