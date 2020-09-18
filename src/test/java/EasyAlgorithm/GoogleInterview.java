package EasyAlgorithm;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class GoogleInterview {
	Map<String, Integer> myData = new LinkedHashMap<String, Integer>();

	public String Solution(String[] str, int N) {

		for (String s : str) {
			findAndCalculate(s, N);
		}

		Iterator<Map.Entry<String, Integer>> myDataItr = myData.entrySet().iterator();
		int max =0;
		String result = new String();
		while (myDataItr.hasNext()) {
			Map.Entry<String, Integer> entry = myDataItr.next();
			//System.out.println(entry.getKey() + " => " + entry.getValue());
			if (max < entry.getValue()) {
				max = entry.getValue();
				result = entry.getKey();
			}
		}
		return result;
	}

	private void findAndCalculate(String str, int N) {
		// check
		for (int i = 0; i <= str.length() - N; i++) {
			String temp= str.substring(i, i + N);
			myData.put(temp, myData.getOrDefault(temp, 0) + 1);
		}
	}

	public static void main(String[] args) {

		GoogleInterview googleInterview = new GoogleInterview();
		String str[] = new String[] { "  ", "__hi", "hello", "__hey", "hilist", "  "};
		System.out.println(googleInterview.Solution(str, 2));
	}

}
