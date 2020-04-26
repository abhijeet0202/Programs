package SingleArray;

import java.util.HashSet;

/**
 * 
 * Given an array A[] and a number x, check for pair in A[] with sum as x
 * 
 * Write a program that, given an array A[] of n numbers and another number x,
 * determines whether or not there exist two elements in S whose sum is exactly
 * x. Examples:
 * 
 * Input: arr[] = {0, -1, 2, -3, 1} sum = -2 Output: -3 ,1 Explanation: If we
 * calculate the sum, 1 + (-3) = -2
 * 
 * Input: arr[] = {1, -2, 1, 0, 5} sum = 0 Output: -1 Explanation: No valid pair
 * exists
 * 
 * @author Abhijeet
 *
 */
public class SumOf2ArrayElements {

	public void Solutions(int[] arr, int sum) {
		HashSet<Integer> s = new HashSet<Integer>();
		for (int i = 0; i < arr.length; ++i) {
			int temp = sum - arr[i];

			// checking for condition
			if (s.contains(temp)) {
				System.out.println("Pair with given sum " + sum + " is (" + arr[i] + ", " + temp + ")");
			}
			s.add(arr[i]);
		}
	}
}
