package SingleArray;

import org.junit.Test;

public class TestGroupAnagram {

	@Test
	public void testGroupAnagrams() {
		GroupAnagrams anagrams = new GroupAnagrams();
		String[] strs = new String[] {"eat", "tea", "tan", "ate", "nat", "bat"};
		System.out.println(anagrams.groupAnagrams(strs).toString());
	}

}
