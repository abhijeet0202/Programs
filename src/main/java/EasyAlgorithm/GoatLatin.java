package EasyAlgorithm;

/**
 * A sentence S is given, composed of words separated by spaces. Each word
 * consists of lowercase and uppercase letters only.
 * 
 * We would like to convert the sentence to "Goat Latin" (a made-up language
 * similar to Pig Latin.)
 * 
 * The rules of Goat Latin are as follows:
 * 
 * If a word begins with a vowel (a, e, i, o, or u), append "ma" to the end of
 * the word. For example, the word 'apple' becomes 'applema'.
 * 
 * If a word begins with a consonant (i.e. not a vowel), remove the first letter
 * and append it to the end, then add "ma". For example, the word "goat" becomes
 * "oatgma".
 * 
 * Add one letter 'a' to the end of each word per its word index in the
 * sentence, starting with 1. For example, the first word gets "a" added to the
 * end, the second word gets "aa" added to the end and so on. Return the final
 * sentence representing the conversion from S to Goat Latin.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: "I speak Goat Latin" Output: "Imaa peaksmaaa oatGmaaaa atinLmaaaaa"
 * Example 2:
 * 
 * Input: "The quick brown fox jumped over the lazy dog" Output: "heTmaa
 * uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa
 * azylmaaaaaaaaa ogdmaaaaaaaaaa"
 * 
 * 
 * Notes:
 * 
 * S contains only uppercase, lowercase and spaces. Exactly one space between
 * each word. 1 <= S.length <= 150
 * 
 * @author ezbanab
 *
 */
public class GoatLatin {

	public String toGoatLatin(String S) {

		String[] strArray = S.split(" ");
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < strArray.length; i++) {
			String str = strArray[i];
			System.out.println(str);
			Character ch = str.charAt(0);
			if (ch != 'a'&& ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' && ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U') {
				str = str + str.charAt(0);
				str = str.substring(1);
			}
			str = str.concat("ma");
			int j = -1;
			while (j < i) {
				str = str.concat("a");
				j++;
			}
			result.append(str).append(" ");
		}
		result.trimToSize();
		return result.toString().trim();

	}

	public static void main(String[] args) {
		GoatLatin goatLatin = new GoatLatin();
		System.out.println(goatLatin.toGoatLatin("The quick brown fox jumped over the lazy dog"));
	}

}
