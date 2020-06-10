package EasyAlgorithm;

import java.util.Scanner;

public class RhombusSpiralDiamond {

	public static void Solution(int numInput, int halfHeight, int length, String str) {
		int n = halfHeight;
		int size = 2 * n - 1;
		char[][] sol = new char[size][size];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				sol[i][j] = ' ';
			}
		}

		int i = size / 2;
		int j = 0;
		String s = str;
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
		/*
		 * 5 
		 * 3 26 
		 * abcdefghijklmnopqrstuvwxyz 
		 * 4 5 
		 * 12345 
		 * 5 2 
		 * 01 
		 * 6 6 
		 * spiral 
		 * 2 1 
		 * z
		 */
		// I
		Scanner scan = new Scanner(System.in);
		int noOftestCases = scan.nextInt();
		for (int i = 0; i < noOftestCases; i++) {

			int halfHeight = scan.nextInt();
			int stringLength = scan.nextInt();
			String string = scan.next();
			Solution(noOftestCases, halfHeight, stringLength, string);
		}
	}
}
