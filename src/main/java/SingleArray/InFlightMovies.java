package SingleArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InFlightMovies {

	public static List<Integer> findMovies(int[] list, int target) {
		target -= 30;
		List<Integer> ans = new ArrayList<>();
		ans.add(-1);
		ans.add(-1);

		// Sort the movies by length
		int[][] movies = new int[list.length][2];
		for (int i = 0; i < list.length; i++) {
			movies[i][0] = list[i]; // Movie duration
			movies[i][1] = i; // Original index of the movie
		}
		Arrays.sort(movies, (a, b) -> a[0] - b[0]);
		// for(int i = 0; i < movies.length; i++) {
		// System.out.println("d: " + movies[i][0] + " i: " + movies[i][1]);
		// }

		// Two pointer: shrink from begin/end
		int l = 0, r = list.length - 1;
		int max = 0;
		while (l < r) {
			if (movies[l][0] + movies[r][0] > target) {
				r--;
			} else {
				if (movies[l][0] + movies[r][0] > max) {
					max = movies[l][0] + movies[r][0];
					ans.set(0, movies[l][1]);
					ans.set(1, movies[r][1]);
				}
				l++;
			}
		}

		return ans;
	}

	public static void main(String[] args) {
		System.out.println(findMovies(new int[] { 90, 85, 75, 60, 120, 150, 125 }, 250));
		System.out.println(findMovies(new int[] { 90, 85, 75, 60, 155, 150, 125 }, 250));
		System.out.println(findMovies(new int[] { 90, 85, 75, 60, 120, 110, 110, 150, 125 }, 250));
		System.out.println(findMovies(new int[] { 95, 85, 75, 60, 120, 110, 110, 150, 125 }, 250));
		System.out.println(findMovies(new int[] { 1, 10, 25, 35, 60 }, 90));
		System.out.println(findMovies(new int[] { 20, 50, 40, 25, 30, 10 }, 90));
		System.out.println(findMovies(new int[] { 5, 55, 40, 20, 30, 30 }, 90));
	}

}
