package EasyAlgorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * iven a set of non-overlapping intervals, insert a new interval into the
 * intervals (merge if necessary).
 * 
 * You may assume that the intervals were initially sorted according to their
 * start times.
 * 
 * Example 1:
 * 
 * Input: intervals = [[1,3],[6,9]], newInterval = [2,5] Output: [[1,5],[6,9]]
 * 
 * Example 2:
 * 
 * Input: intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]
 * Output: [[1,2],[3,10],[12,16]] Explanation: Because the new interval [4,8]
 * overlaps with [3,5],[6,7],[8,10].
 * 
 * NOTE: input types have been changed on April 15, 2019. Please reset to
 * default code definition to get new method signature.
 * 
 * @author ezbanab
 *
 */
public class InsertInterval {

	public int[][] insert(int[][] intervals, int[] newInterval) {

		List<int[]> result = new ArrayList<int[]>();

		for (int i = 0; i < intervals.length; i++) {
			if (intervals[i][1] < newInterval[0]) {
				result.add(intervals[i]);
			}else if(newInterval[1] < intervals[i][0]) {
				result.add(newInterval);
				newInterval = intervals[i]; 
			} else {
				newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
				newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
			}
		}
		result.add(newInterval);
		return result.toArray(new int[result.size()][]);
	}

	public static void main(String[] args) {
		InsertInterval insertInterval = new InsertInterval();
		int[][] interval = new int[][] {{1,3},{6,9}};
		int[] newInterval = new int[] {2,5};
		
		int[][] result = insertInterval.insert(interval, newInterval);
		System.out.println(result);
		
		int[][] interval1 = new int[][] {{1,2},{3,5},{6,7},{8,10},{12,16}};
		int[] newInterval1 = new int[] {4,8};
		int[][] result1 = insertInterval.insert(interval1, newInterval1);
		System.out.println(result1);
		
 
	}

}
