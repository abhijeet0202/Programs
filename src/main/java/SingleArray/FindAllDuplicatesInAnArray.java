package SingleArray;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 
 * Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some
 * elements appear twice and others appear once.
 * 
 * Find all the elements that appear twice in this array.
 * 
 * Could you do it without extra space and in O(n) runtime?
 * 
 * Example: Input: [4,3,2,7,8,2,3,1]
 * 
 * Output: [2,3]
 */
public class FindAllDuplicatesInAnArray {

	/**
	 * Option1: findDuplicates() 
	 * Space Complexity: 0 
	 * Time Complexity: O(n2)nSquare
	 */
	public List<Integer> findDuplicates(int[] nums) {

		// Taking List<>, Just to keep Output
		List<Integer> obj = new ArrayList<>();
		if (nums.length < 0)
			return null;

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				// Adding Math.abs(), in case,if requirement is need to find duplicate, doesn't
				// matter if its -ve, i.e. 4 == -4
				// if(nums[i] == nums[j]) {
				if (Math.abs(nums[i]) == Math.abs(nums[j])) {
					System.out.println(nums[j]);
					obj.add(nums[j]);
				}
			}

		}
		return obj;

	}

	/**
	 * Option2: findDuplicates2() 
	 * Space Complexity: O(n) 
	 * Time Complexity: O(n)
	 */
	public List<Integer> findDuplicates2(int[] nums) {
		// Taking List<>, Just to keep Output
		List<Integer> obj = new ArrayList<>();
		
		Set<Integer> temp = new HashSet<>();
		if (nums.length < 0)
			return null;

		for (int i = 0; i < nums.length; i++) {			
			if(temp.contains(nums[i])) {
				System.out.println(nums[i]);
				obj.add(nums[i]);
			}else {
				temp.add(nums[i]);
			}
		}
		return obj;

	}
	
	/**
	 * Option3: findDuplicates3() 
	 * Space Complexity: NA 
	 * Time Complexity: O(n)
	 * 
	 * Drawback: max range of an int is 2pow32-1, cant take more tha that
	 * Drawback: can't use -ve integer
	 */
	public List<Integer> findDuplicates3(int[] nums) {
		// Taking List<>, Just to keep Output
		List<Integer> obj = new ArrayList<>();
		
		if (nums.length < 0)
			return null;
		int result =0;
		for (int i = 0; i < nums.length; i++) {			
			int sum =1;
			sum = sum <<nums[i];
			if((sum & result) == 1) {
				System.out.println(nums[i]);
				obj.add(nums[i]);
			}else {
				result = result | sum;
			}
		}
		return obj;

	}

	public static void main(String[] args) {
		FindAllDuplicatesInAnArray array = new FindAllDuplicatesInAnArray();
		int[] arr = new int[] { 4, 3, 2, 7, 8, 2, 3, 1 };
		System.out.println(array.findDuplicates(arr));
		System.out.println(array.findDuplicates2(arr));
		System.out.println(array.findDuplicates3(arr));

		int[] arr1 = new int[] { 2, 2 };
		System.out.println(array.findDuplicates(arr1));
		System.out.println(array.findDuplicates2(arr1));
		System.out.println(array.findDuplicates3(arr1));

	}

}
