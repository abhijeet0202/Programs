package SingleArray;

/**
 * Given an integer array nums, find the contiguous subarray (containing at
 * least one number) which has the largest sum and return its sum.
 * 
 * Example:
 * 
 * Input: [-2,1,-3,4,-1,2,1,-5,4], 
 * Output: 6 
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 * 
 * Follow up:
 * 
 * If you have figured out the O(n) solution, try coding another solution using
 * the divide and conquer approach, which is more subtle.
 * 
 * @author Abhijeet
 *
 */

public class MaximumSubArray {

	
	//Approch1: using O(n)
	public int maxSubArraySum(int a[]) {
		int size = a.length;
		int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;

		for (int i = 0; i < size; i++) {
			max_ending_here += a[i];

			if (max_so_far < max_ending_here)
				max_so_far = max_ending_here;

			if (max_ending_here < 0) //reseting -ve value to 0 because if we keep -ve after adding to new value it will be always leser so its of no use
				max_ending_here = 0;
		}
		return max_so_far;
	}
	

}
