package EasyAlgorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class SpiralAttributes {
	int height;
	int length;
	String data;

	public SpiralAttributes(int height, int length, String data) {
		this.height = height;
		this.length = length;
		this.data = data;
	}
}

public class SpiralRombus {
	static List<SpiralAttributes> spAttr = null;
	private static Scanner scan;

	static void display(SpiralAttributes spiral) {
		int n = spiral.height;
		int size = 2 * n - 1;

		char[][] sol = new char[size][size];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				sol[i][j] = ' ';
			}
		}

		int i = size / 2;
		int j = 0;
		String s = spiral.data;
		int len = s.length();
		int in = 0;
		int left = 0, top = 0, right = size - 1;
		int bottom = size - 1;
		boolean flag = false;
		while (i != j) {
			while (i >= top && !flag) {
				sol[i][j] = s.charAt((in++) % len);
				if (i == size / 2 && j == size / 2)
					flag = true;
				i--;
				j++;
			}
			if (flag == true)
				break;
			i += 2;
			top++;
			left++;
			while (j <= right && !flag) {
				sol[i][j] = s.charAt((in++) % len);
				i++;
				j++;
			}
			j -= 2;
			right--;
			while (i <= bottom && !flag) {
				sol[i][j] = s.charAt((in++) % len);
				i++;
				j--;
			}
			bottom--;
			i -= 2;
			while (j >= left && !flag) {
				sol[i][j] = s.charAt((in++) % len);
				i--;
				j--;
			}
			j++;
		}
		sol[i][j] = s.charAt((in++) % len);
		for (int a = 0; a < size; a++) {
			for (int b = 0; b < size; b++) {
				System.out.print(sol[a][b]);
			}
			System.out.println();
		}

	}
	
	public static void main(String[] args) {

		scan = new Scanner(System.in);
		int testCases = 0;
		try {
			testCases = scan.nextInt();
			if (testCases > 1000 || testCases < 1)
				throw new NumberFormatException();
			spAttr = new ArrayList<SpiralAttributes>();
		} catch (NumberFormatException ex) {
			System.out.println("Not a Valid Test Numbers" + ex);
		}

		for (int i = 0; i < testCases; i++) {
			int height = scan.nextInt();
			int length = scan.nextInt();
			String data = scan.next();
			SpiralAttributes sp = new SpiralAttributes(height, length, data);
			spAttr.add(sp);
		}

		for (SpiralAttributes sp : spAttr) {
			display(sp);
		}
	}
}
