package SingleArray;

/**
 * Given an array arr[] of n integers, 
 * construct a Product Array prod[] (of same size) such that prod[i] is equal to the product of all the elements of arr[]
 * except arr[i].
 * Solve it without division operator and in O(n).
 * 
 * Example: 
 * Input : arr[] = {10, 3, 5, 6, 2} 
 * Output : prod[] = {180, 600, 360, 300, 900}
 * 
 * @author Abhijeet
 *
 */
public class ProductOfArray {

	int[] productPuzzle1(int a[], int N) {
		int []products = new int[N];
		int p=1;
		
		for(int i=0;i<N;++i) {
		  products[i]=p;
		  p*=a[i];
		  System.out.print(products[i]+",");
		}
		System.out.println();
		
		p=1;
		for(int i=N-1;i>=0;--i) {
		  products[i]*=p;
		  p*=a[i];
		  //System.out.print(products[i]+",");
		}
		return products;
	}
	
	int[] productPuzzle(int a[], int n) {
		// to hold sum of all values
		int sum = 1,count =0;
		for (int i = 0; i < n; i++) {
			if(a[i] != 0) {
				sum *= a[i];
			}else {
				count++;
			}
		}
		// output product for each index
		// anti log to find original product value
		int[] product = new int[n];
		for (int i = 0; i < n; i++) {
			if(count < 2) {
				if(a[i] != 0 && count ==0) {
					product[i] = sum/a[i];
				}else if (a[i] == 0) {
					product[i] = sum;
				}
				else {
					product[i] = 0;
				}
			}else {
				product[i] =0;
			}
		}
		return product;
	}

}
