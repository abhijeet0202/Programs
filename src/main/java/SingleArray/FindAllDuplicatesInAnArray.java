package SingleArray;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements
 * appear twice and others appear once.
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
	
	
	public List<Integer> findDuplicatesOption2(int[] nums){
		int[] fra = new int[nums.length+1];
		List<Integer> result = new ArrayList<Integer>();
		
		for(int n:nums)
            fra[n]++;
        for(int i=0;i<fra.length;i++){
            if(fra[i]==2)
                result.add(i);
        }
        return result;
	}

	public List<Integer> findDuplicates(int[] nums) {
		
		List<Integer> obj = new ArrayList<Integer>();

		 if(nums.length <0)return null;
	        
			for (int i = 0; i < nums.length; i++){ 
	            if (nums[(Math.abs(nums[i]))-1] >= 0){
	            	nums[Math.abs(nums[i])-1] = -nums[Math.abs(nums[i])-1];
	            }else{
	                obj.add(Math.abs(nums[i]));
	            }
	   
	} 
			 return obj;	
		
	}
	public static void main(String[] args) {
		FindAllDuplicatesInAnArray array = new FindAllDuplicatesInAnArray();
		int[] arr = new int[] { 4, 3, 2, 7, 8, 2, 3, 1 };
		//System.out.println(array.findDuplicates(arr));
		System.out.println(array.findDuplicatesOption2(arr));

		int[] arr1 = new int[] { 2, 2 };
		//System.out.println(array.findDuplicates(arr1));
		System.out.println(array.findDuplicatesOption2(arr));

	}

}
