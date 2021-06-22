package SingleArray;


/*
 * 0 represent Villagers, and 1 represent villagers,
 * 1 will always stood front of every village.
 * The less number of defenders, a high risk enemy will attack that village.
 * 
 * Find the Weakest village, where attackers can attck easily
 * 
 * Ex:
 * 	1  1  1  0
 *  1  0  0  0
 *  1  1  0  0
 *  1  1  1  0
 *   output Row 1: "1 0 0 0" only 1 defender
 */
public class VillagersAndDefenders {

	public int findVillageToAttack(int arr[][]) {

		int iIndex = -1;
		int j = arr.length - 1;
		int jIndex = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			for (; j >= 0; j--) {
				if (arr[i][j] == 1) {
					if (j < jIndex) {
						jIndex = j;
						iIndex = i;
					}
					break;
				}
			}
			if(j==-1)return i;
		}

		return iIndex;
	}

}
