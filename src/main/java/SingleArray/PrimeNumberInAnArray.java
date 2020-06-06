package SingleArray;

import java.util.HashMap;
import java.util.Map;

/**
 * Find The Lonely Prime Number In An Array.
 * 
 * A program to find the unique prime number in the array. There will be only
 * one prime number in the unique list of numbers.
 * 
 * Input: A comma Separated numbers Expected Output: Print the lonely prime
 * number
 * 
 * Example: 12,3,4,5,5,4,3,2,2,21,23,40,7,6,4,7
 * 
 * Output: 23
 * 
 * @author ezbanab
 *
 */
public class PrimeNumberInAnArray {

	public static void main(String[] args) {
		
		String inputString = "12,3,4,5,5,4,3,2,2,21,23,40,7,6,4,7"; 
		Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();

		String[] strArr = inputString.split(",");
		for (String s : strArr) {
			int num = Integer.valueOf(s);
			myMap.put(num, myMap.getOrDefault(num, 0) + 1);
		}

		for (Map.Entry<Integer, Integer> entry : myMap.entrySet()) {
			Integer k = entry.getKey();
			Integer v = entry.getValue();
			if (v == 1) {
				System.out.println("Key: " + k + ", value " + v);
				if (isPrime(k)) {
					System.out.println(k);
					return;
				}
			}
		}

	}

	public static boolean isPrime(int data) {
		if (data % 2 == 0)
			return false;

		for (int j = 2; j < data; j++) {
			if (data % j == 0) {
				return false;
			}
		}
		return true;
	}

}
