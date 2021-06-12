package EasyAlgorithm;

public class DistributeCandies {

	public static int distributeCandies(int candies, int num_people, int id) {
		//int[] distributed = new int[num_people];
		int result = -1;
		int i = id;
		while (candies != 0) {
			if (i >= num_people) {
				i = 0;
			}else if(candies == 1) {
				result= ++i;
				candies--;
			} else {
				candies--;
				i++;
				
			}
		}
		System.out.println(result);
		return result;
	}


	public static void main(String[] args) {
	DistributeCandies.distributeCandies(5, 2, 1);

	}

}
