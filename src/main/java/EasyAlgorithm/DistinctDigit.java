package EasyAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class DistinctDigit {

	public void findDis(List<List<Integer>> arr) {
		// System.out.println(arr);
		int count = 0;
		for (List<Integer> perData : arr) {
			int l = perData.get(0);
			int r = perData.get(1);
			count = 0;
			for (int i = l; i <= r; i++) {
				int num = i;
				boolean visited[] = new boolean[10];

				// Find digits and maintain its hash
				while (num != 0) {
					// if a digit occurs more than 1 time
					// then break
					if (visited[num % 10])
						break;

					visited[num % 10] = true;

					num = num / 10;
				}

				// num will be 0 only when above loop
				// doesn't get break that means the
				// number is unique so print it.
				if (num == 0)
					count++;
			}
			System.out.println(count);
		}
		// System.out.println(count);
	}

	int uniqueDigitsOfLength(int n) {
		if (n < 1)
			return 0;
		int count = 9;
		int numOptions = 9;
		while (--n > 0) {
			if (numOptions == 0) {
				return 0;
			}
			count *= numOptions;
			numOptions--;
		}
		return count;
	}

	int getInt(char c) {
		return c - '0';
	}

	int factorial(int n) {
		if (n > 9)
			return -1;
		if (n < 2)
			return 1;
		int res = 1;
		for (int i = 2; i <= n; i++) {
			res *= i;
		}
		return res;
	}

	public void findDestint(List<List<Integer>> arr) {
		int rUniq = 0;
		int lUniq = 0;
		for (List<Integer> myData : arr) {
			rUniq=0;
			lUniq=0;
			int l = myData.get(0);
			String lseq = String.valueOf(l);
			char[] lca = lseq.toCharArray();
			
			int r = myData.get(1);
			int[] rUsed = new int[10];
			int[] lUsed = new int[10];
			String seq = String.valueOf(r);
			char[] ca = seq.toCharArray();
			rUniq = 0;
			lUniq += (getInt(lca[0]) - 1) * factorial(9) / factorial(9 - lca.length + 1);
			lUsed[getInt(lca[0])] = 1;
			for (int i = 1; i < lca.length; i++) {
				int count = 0;
				for (int j = 0; j < getInt(lca[i]); j++) {
					if (lUsed[j] != 1)
						count++;
				}
				lUniq += count * factorial(9 - i) / factorial(9 - lca.length + 1);
				if (lUsed[getInt(lca[i])] == 1)
					break;
				lUsed[getInt(lca[i])] = 1;
			}

			for (int i = lca.length; i <= ca.length - 1; i++) {
				rUniq += uniqueDigitsOfLength(i);
			}

			//System.out.println(getInt(ca[0]) - 1);
			//System.out.println(factorial(9));
			//System.out.println(factorial(9 - ca.length + 1));
			//System.out.println( factorial(9) / factorial(9 - ca.length + 1));
			rUniq += (getInt(ca[0]) - 1) * factorial(9) / factorial(9 - ca.length + 1);
			rUsed[getInt(ca[0])] = 1;
			for (int i = 1; i < ca.length; i++) {
				int count = 0;
				for (int j = 0; j < getInt(ca[i]); j++) {
					if (rUsed[j] != 1)
						count++;
				}
				rUniq += count * factorial(9 - i) / factorial(9 - ca.length + 1);
				if (rUsed[getInt(ca[i])] == 1)
					break;
				rUsed[getInt(ca[i])] = 1;
			}

			if (isUniqueDigits(r)) {
				rUniq += 1;
			}
			System.out.println(rUniq-lUniq);
		}
		
	}

	boolean isUniqueDigits(int n) {
		int[] used = new int[10];
		if (n < 10)
			return true;
		while (n > 0) {
			int digit = n % 10;
			if (used[digit] == 1)
				return false;
			used[digit] = 1;
			n = n / 10;
		}
		return true;
	}

	public static void main(String[] args) {
		List<List<Integer>> obj = new ArrayList<>();
		List<Integer> o1 = new ArrayList<Integer>();
		o1.add(80);
		o1.add(120);
		obj.add(o1);

//		List<Integer> o2 = new ArrayList<Integer>();
//		o2.add(5107);
//		o2.add(5324);
//		obj.add(o2);
//
//		List<Integer> o3 = new ArrayList<Integer>();
//		o3.add(7);
//		o3.add(8);
//		obj.add(o3);
		DistinctDigit ds = new DistinctDigit();
		ds.findDis(obj);
		ds.findDestint(obj);
	}

}
