package EasyAlgorithm;

public class RepeatedSubstringPattern {

	public boolean repeatedSubstringPattern1(String s) {
		return (s + s).substring(1, 2 * s.length() - 1).contains(s);
	}

	public boolean repeatedSubstringPattern(String str) {
        int n = str.length();
        
        for (int i = n / 2; i > 0; i--) {
            if (n % i == 0) {
                int left = 0;
                int right = i;
              
                while (right < n && str.charAt(left++) == str.charAt(right)) {
                	right++;
                }
                if (right == n) {
                    return true;
                }                
            }
        }
        
        return false;
    }
	public static void main(String[] args) {
		RepeatedSubstringPattern pattern = new RepeatedSubstringPattern();
		System.out.println(pattern.repeatedSubstringPattern("bb"));
		System.out.println(pattern.repeatedSubstringPattern("abab"));

	}

}
