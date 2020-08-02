package SingleArray;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PairSums {

	public static int numberOfWays(int[] arr, int k) {
		Map<Integer, Integer> myData = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			myData.put(arr[i], myData.getOrDefault(arr[i], 0) + 1);
		}
		int count = 0;
		Set<Integer> mySet = myData.keySet();
		for (Integer key : mySet) {
			int find = k - key;
			if (k / 2 == key) {
				int value = myData.get(key);
				count = count+ (value * (value - 1)) / 2;
			} else if (myData.get(find) != null && myData.get(find) >0) {
				myData.put(key, myData.getOrDefault(key, 0) - 1);
				myData.put(find, myData.getOrDefault(find, 0) - 1);
				count++;
			}
		}
		System.out.println(count);
		return count;

	}

	public static void main(String[] args) {
		int k_1 = 6;
		int[] arr_1 = { 1, 2, 3, 4, 3 };
		int expected_1 = 2;
		int output_1 = PairSums.numberOfWays(arr_1, k_1);

	}
}