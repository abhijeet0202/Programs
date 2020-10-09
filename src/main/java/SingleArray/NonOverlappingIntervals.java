package SingleArray;

import java.util.Arrays;

/**
 * Given a collection of intervals, find the minimum number of intervals you
 * need to remove to make the rest of the intervals non-overlapping.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: [[1,2],[2,3],[3,4],[1,3]] 
 * Output: 1 
 * Explanation: [1,3] can be removed and the rest of intervals are non-overlapping. 
 * 
 * Example 2: 
 * Input: [[1,2],[1,2],[1,2]] 
 * Output: 2 
 * Explanation: You need to remove two [1,2] to make the rest of intervals non-overlapping. 
 * 
 * Example 3:
 * 
 * Input: [[1,2],[2,3]] 
 * Output: 0 
 * Explanation: You don't need to remove any of the intervals since they're already non-overlapping.
 * 
 * 
 * Note:
 * 
 * You may assume the interval's end point is always bigger than its start
 * point. Intervals like [1,2] and [2,3] have borders "touching" but they don't
 * overlap each other.
 * 
 * @author ezbanab
 *
 */
public class NonOverlappingIntervals {
	
	public int eraseOverlapIntervals(int[][] intervals) {
		if(intervals.length == 0)return 0;
		//Sorted the Array based on 2nd value
		Arrays.sort(intervals, (i1, i2)-> i1[1] -i2[1]);
		int count =0;
		//int start = intervals[0][0];
		int end  = intervals[0][1];
		for (int i=1;i <intervals.length ;i++) {
			if(intervals[i][0] >= end) {
				end = intervals[i][1];
			}else {
				count++;
			}
		}
		return count;
        
    }
	public static void main(String[] args) {
		NonOverlappingIntervals intervals = new NonOverlappingIntervals();
		int[][] myArr = new int[][] {{1,2},{2,3},{3,4},{1,3}};
		System.out.println(intervals.eraseOverlapIntervals(myArr));
		
		
		int[][] myArr1 = new int[][] {{1,2},{1,2},{1,2}};
		System.out.println(intervals.eraseOverlapIntervals(myArr1));
		
		int[][] myArr2 = new int[][] {{1,2},{2,3}};
		System.out.println(intervals.eraseOverlapIntervals(myArr2));
		
		int[][] myArr3 = new int[][] {{1,100},{11,22},{1,11},{2,12}};
		System.out.println(intervals.eraseOverlapIntervals(myArr3));
		
	}

}
