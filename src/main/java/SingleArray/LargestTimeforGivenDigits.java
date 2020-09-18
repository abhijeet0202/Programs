package SingleArray;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an array of 4 digits, return the largest 24 hour time that can be made.
 * 
 * The smallest 24 hour time is 00:00, and the largest is 23:59. Starting from
 * 00:00, a time is larger if more time has elapsed since midnight.
 * 
 * Return the answer as a string of length 5. If no valid time can be made,
 * return an empty string.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: A = [1,2,3,4] Output: "23:41" Example 2:
 * 
 * Input: A = [5,5,5,5] Output: "" Example 3:
 * 
 * Input: A = [0,0,0,0] Output: "00:00" Example 4:
 * 
 * Input: A = [0,0,1,0] Output: "10:00"
 * 
 * 
 * Constraints:
 * 
 * arr.length == 4 0 <= arr[i] <= 9
 * 
 * @author ezbanab
 *
 */
public class LargestTimeforGivenDigits {
	String res = ""; // the final result.
	int elapsed = Integer.MIN_VALUE; // record max valid permutation elapsed time.

	public String largestTimeFromDigits(int[] arr) {
		backtrack(new ArrayList<Integer>(), arr);
		return res;
	}

	// Calculate all permutations of arr index, store them in the list.
	private void backtrack(List<Integer> list, int[] arr) {
		if (list.size() == 4) {
			String hh = arr[list.get(0)] + "" + arr[list.get(1)];
			String mm = arr[list.get(2)] + "" + arr[list.get(3)];
			int currElapsed = Integer.valueOf(hh) * 60 + Integer.valueOf(mm);
			if (hh.compareTo("24") < 0 && mm.compareTo("60") < 0 && currElapsed >= elapsed) {
				elapsed = currElapsed;
				res = hh + ":" + mm;
			}
			return;
		}

		for (int i = 0; i < 4; i++) {
			if (list.contains(i))
				continue;
			list.add(i);
			backtrack(list, arr);
			list.remove(list.size() - 1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LargestTimeforGivenDigits digits = new LargestTimeforGivenDigits();
		int arr[] = new int[] { 1, 2, 3, 4 };
		System.out.println(digits.largestTimeFromDigits(arr));
	}

}
