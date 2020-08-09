package SingleArray;

import org.junit.Assert;

/**
 * Given an array of integers nums, you start with an initial positive value
 * startValue.
 * 
 * In each iteration, you calculate the step by step sum of startValue plus
 * elements in nums (from left to right).
 * 
 * Return the minimum positive value of startValue such that the step by step
 * sum is never less than 1.
 * 
 * Example 1:
 * 
 * Input: nums = [-3,2,-3,4,2] 
 * Output: 5 
 * Explanation: If you choose startValue = 4, in the third iteration your step by step sum is less than 1. step by step
 * sum startValue = 4 | startValue = 5 | nums (4 -3 ) = 1 | (5 -3 ) = 2 | -3 (1
 * +2 ) = 3 | (2 +2 ) = 4 | 2 (3 -3 ) = 0 | (4 -3 ) = 1 | -3 (0 +4 ) = 4 | (1 +4
 * ) = 5 | 4 (4 +2 ) = 6 | (5 +2 ) = 7 | 2 Example 2:
 * 
 * Input: nums = [1,2] Output: 1 Explanation: Minimum start value should be
 * positive. Example 3:
 * 
 * Input: nums = [1,-2,-3] Output: 5
 * 
 * @author Abhijeet
 *
 */
public class MinimumValuetoGetPositiveStepbyStepSum {

	public int minimumRequirement(int arr[]) {
		int minRequired=1;
		for (int i=arr.length-1;i>=0;i--) {
			if(arr[i]<=0) {
				minRequired = minRequired-arr[i];
			}else {
				minRequired = Math.max(1, minRequired-arr[i]);
			}
		}
		return minRequired;
	}
	public static void main(String[] args) {
		MinimumValuetoGetPositiveStepbyStepSum stepSum = new MinimumValuetoGetPositiveStepbyStepSum();
		Assert.assertEquals(5, stepSum.minimumRequirement(new int[] {-3,2,-3,4,2}));
		Assert.assertEquals(1, stepSum.minimumRequirement(new int[] {2,4,-3,2,-3}));
		Assert.assertEquals(1, stepSum.minimumRequirement(new int[] {1,2}));
		Assert.assertEquals(5, stepSum.minimumRequirement(new int[] {1,-2,-3}));
		Assert.assertEquals(4, stepSum.minimumRequirement(new int[] {2,-5}));
		Assert.assertEquals(6, stepSum.minimumRequirement(new int[] {-5,2}));
	}

}
