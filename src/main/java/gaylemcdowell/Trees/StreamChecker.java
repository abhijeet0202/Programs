package gaylemcdowell.Trees;

import org.junit.Assert;

class TrieNode {
	boolean isWord;
	TrieNode[] next = new TrieNode[26];
}

/**
 * Implement the StreamChecker class as follows:
 * 
 * StreamChecker(words): Constructor, init the data structure with the given
 * words. query(letter): returns true if and only if for some k >= 1, the last k
 * characters queried (in order from oldest to newest, including this letter
 * just queried) spell one of the words in the given list.
 * 
 * 
 * Example:
 * 
 * StreamChecker streamChecker = new StreamChecker(["cd","f","kl"]); // init the
 * dictionary. streamChecker.query('a'); // return false
 * streamChecker.query('b'); // return false streamChecker.query('c'); // return
 * false streamChecker.query('d'); // return true, because 'cd' is in the
 * wordlist streamChecker.query('e'); // return false streamChecker.query('f');
 * // return true, because 'f' is in the wordlist streamChecker.query('g'); //
 * return false streamChecker.query('h'); // return false
 * streamChecker.query('i'); // return false streamChecker.query('j'); // return
 * false streamChecker.query('k'); // return false streamChecker.query('l'); //
 * return true, because 'kl' is in the wordlist
 * 
 * @author ezbanab
 *
 */
public class StreamChecker {

	TrieNode root = new TrieNode();
	StringBuilder sb = new StringBuilder();

	public StreamChecker(String[] words) {
		createTrie(words);
	}

	public boolean query(char letter) {
		sb.append(letter);
		TrieNode node = root;
		for (int i = sb.length() - 1; i >= 0 && node != null; i--) {
			char c = sb.charAt(i);
			node = node.next[c - 'a'];
			if (node != null && node.isWord) {
				return true;
			}
		}
		return false;
	}

	private void createTrie(String[] words) {
		for (String s : words) {
			TrieNode node = root;
			int len = s.length();
			for (int i = len - 1; i >= 0; i--) {
				char c = s.charAt(i);
				if (node.next[c - 'a'] == null) {
					node.next[c - 'a'] = new TrieNode();
				}
				node = node.next[c - 'a'];
			}
			node.isWord = true;
		}
	}

	public static void main(String[] args) {
		String[] words = new String[] {"ab","ba","aaab","abab","baa"};
		StreamChecker sc = new StreamChecker(words);
	
		Assert.assertEquals(false, sc.query('a'));//;
		Assert.assertEquals(false, sc.query('a'));
		Assert.assertEquals(false, sc.query('a'));
		Assert.assertEquals(false, sc.query('a'));
		Assert.assertEquals(false, sc.query('a'));
		Assert.assertEquals(true, sc.query('b'));
		Assert.assertEquals(true, sc.query('a'));
		Assert.assertEquals(true, sc.query('b'));
		Assert.assertEquals(true, sc.query('a'));
		Assert.assertEquals(true, sc.query('b'));
		Assert.assertEquals(false, sc.query('b'));
		Assert.assertEquals(false, sc.query('b'));
		Assert.assertEquals(true, sc.query('a'));
		Assert.assertEquals(true, sc.query('b'));
		Assert.assertEquals(true, sc.query('a'));
		Assert.assertEquals(true, sc.query('b'));
		Assert.assertEquals(false, sc.query('b'));
		Assert.assertEquals(false, sc.query('b'));
		Assert.assertEquals(false, sc.query('b'));
		Assert.assertEquals(true, sc.query('a'));
		Assert.assertEquals(true, sc.query('b'));
		Assert.assertEquals(true, sc.query('a'));
		Assert.assertEquals(true, sc.query('b'));
		Assert.assertEquals(true, sc.query('a'));
		Assert.assertEquals(true, sc.query('a'));
		Assert.assertEquals(false, sc.query('a'));
		Assert.assertEquals(true, sc.query('b'));
		Assert.assertEquals(true, sc.query('a'));
		Assert.assertEquals(true, sc.query('a'));
		Assert.assertEquals(false, sc.query('a'));
	}

}
