package EasyAlgorithm;

public class RepeatedSubstringPattern {

	/**
	 * Best Approach:
	 * Step 1: Concatenation the incoming string twice (i.e if input is "abab" make it "abababab".
	 * Step 2: Remove 0th index char and last index char "abababab" == bababab
	 * Step3: now check input string contains in substring index "abab"==>present in==> "bababab"
	 * @param s
	 * @return
	 */
	public boolean repeatedSubstringPattern1(String s) {
		System.out.println((s + s).substring(1, 2 * s.length() - 1));
		return (s + s).substring(1, 2 * s.length() - 1).contains(s);
		
	}

	public boolean repeatedSubstringPattern(String str) {
		int n = str.length();

		int i = n / 2;
		// When we checking substring pattern, it means there should be 2 str
		// concatenation ,
		if (n % i == 0) {// length will always be even, if odd it means skip and return false
			int left = 0;
			int right = i;

			while (right < n && str.charAt(left++) == str.charAt(right)) {
				right++;
			}
			if (right == n) {
				return true;
			}
		} else {
			return false;
		}

		return false;

	}
	public static void main(String[] args) {
		RepeatedSubstringPattern pattern = new RepeatedSubstringPattern();
		//System.out.println(pattern.repeatedSubstringPattern("bb"));
		System.out.println(pattern.repeatedSubstringPattern("ababk"));
		
		System.out.println(pattern.repeatedSubstringPattern1("aa"));
		System.out.println(pattern.repeatedSubstringPattern1("abcab"));
	

	}

}
