package EasyAlgorithm;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class IteratorforCombination {

	Set<String> st;
	Iterator<String> cur;

	IteratorforCombination(String characters, int combinationLength) {
		st = GenaretallComb(characters, combinationLength);
		cur = st.iterator();
	}

	String next() {

		if (cur.hasNext()) {
			return cur.next();
		} else {
			return "";
		}
	}

	boolean hasNext() {
		return cur.hasNext();
	}

	Set<String> GenaretallComb(String s, int len) {
		int mask = 1 << s.length();
		Set<String> hold = new TreeSet<String>();
		String comString = "";
		for (int no = 1; no < mask; no++) {
			int num = no, i = 0;
			while (num >= 1) {
				if ((num & 1) != 0) {
					comString = comString + s.charAt(i);
				}
				i++;
				num >>= 1;
			}
			if (comString.length() == len)
				hold.add(comString);
			comString = "";
		}
		return hold;
	}
	
	public static void main(String[] args) {
		IteratorforCombination  obj = new IteratorforCombination("abc", 2);
		System.out.println(obj.hasNext());
		System.out.println(obj.next());
		System.out.println(obj.hasNext());
		System.out.println(obj.next());
		System.out.println(obj.hasNext());
		System.out.println(obj.next());
		System.out.println(obj.hasNext());
		
		
	}
}
