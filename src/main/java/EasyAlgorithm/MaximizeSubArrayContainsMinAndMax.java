package EasyAlgorithm;

import java.util.ArrayList;

/**
 * You are given an array of N elements. 
 * You are allowed to delete at maximum one element from the provided array. 
 * The order of elements remains the same in the resultant array. 
 * You are required to maximize the number of subarrays that contain both maximum and minimum elements of the resultant arary.
 * Constraints TestCases [1,10] N [1,105] 1<= arri<=109 Input 6 7 2 5 4 3 1
 * Output 4 Explaination If we delete 1 from the array then resultant arary will
 * be 7 2 5 4 3. So the number of subarrays which will contain maximum 7 and
 * minimum 2 will be 4 [7,2] [7,2,5] [7,2,5,4] [7,2,5,4,3]
 * 
 * @author ezbanab
 *
 */
public class MaximizeSubArrayContainsMinAndMax {
	public long subarray(ArrayList<Integer> data) {

		int len = data.size();
		if (len <= 1)
			return len;

		long ans = proc(data);
		int low = data.get(0);
		int pos_low = 0;
		int high = data.get(0);
		int pos_high = 0;
		for (int i = 1; i < len; i++) {
			int x = data.get(i);
			if (x < low) {
				low = x;
				pos_low = i;
			} else if (x > high) {
				high = x;
				pos_high = i;
			}
		}

		ArrayList<Integer> temp = data;
		temp.remove(pos_low);
		ans = Math.max(ans, proc(temp));

		temp = data;
		temp.remove(pos_high);
		// u.erase(u.begin() + pos_high);

		return Math.max(ans, proc(temp));
	}

	long proc(ArrayList<Integer> data) {

		int low = data.get(data.size() - 1);
		int high = data.get(data.size() - 1);
		int p1 = data.size();
		int p2 = data.size();
		long ans = 0;

		for (int i = data.size() - 1; i >= 0; i--) {
			int x = data.get(i);
			if (x < low) {
				low = x;
				ans = 0;
			} else if (x > high) {
				high = x;
				ans = 0;
			}

			if (x == low) {
				p1 = i;
			}
			if (x == high) {
				p2 = i;
			}

			ans += data.size() - Math.max(p1, p2);
		}
		return ans;
	}

	public static <R> void main(String[] args) {

		MaximizeSubArrayContainsMinAndMax s = new MaximizeSubArrayContainsMinAndMax();

		// TestCAse1:
		int arr[] = new int[] { 7, 2, 5, 4, 3, 1 };
		ArrayList<Integer> list = arrToArrayList(arr);
		System.out.println(s.subarray(list));

		int arr1[] = new int[] { 9, 9, 8, 9, 8, 9, 9, 8, 9, 8 };
		list = arrToArrayList(arr1);
		System.out.println(s.subarray(list));
//    cout<<s->subarray({9,4,2,4,9,9,9,9,9,7})<<endl;
//    cout<<s->subarray({5,2,4,6,8,1,8,6,4,4})<<endl;
//    cout<<s->subarray({4,3,3,4,2,8,6,2,6,3})<<endl;
//    cout<<s->subarray({1,7,2,9,9,8,6,9,4,8})<<endl;
//    cout<<s->subarray({5,9,8,6,5,6,8,8,8,5})<<endl;
//    cout<<s->subarray({3,1,3,5,5,3,7,3,8,1})<<endl;
//    cout<<s->subarray({8,10,8,5,10,8,5,5,5,8})<<endl;
//    cout<<s->subarray({2,7,2,5,10,5,10,2,2,5})<<endl;
//    cout<<s->subarray({3,9,3,3,1,8,1,1,8,2})<<endl;
//    cout<<s->subarray({1,10,4,4,9,10,10,9,4,10})<<endl;
	}

	private static ArrayList<Integer> arrToArrayList(int arr[]) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		return list;
	}
}