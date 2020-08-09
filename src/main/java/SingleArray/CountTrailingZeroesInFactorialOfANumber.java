package SingleArray;

import org.junit.Assert;

/**
 * Given an integer n, write a function that returns count of trailing zeroes in
 * n!.
 * 
 * Examples :
 * 
 * Input: n = 5 
 * Output: 1 
 * Factorial of 5 is 120 which has one trailing 0.
 * 
 * Input: n = 20 
 * Output: 4 
 * Factorial of 20 is 2432902008176640000 which has 4 trailing zeroes.
 * 
 * Input: n = 100 
 * Output: 24
 * 
 * @author Abhijeet
 *
 */
public class CountTrailingZeroesInFactorialOfANumber {

	public int trailingZero(int number) {
		/**
		 * Basic Concepts: if we keep dividing any number by 10 we will get last digit
		 * i.e. 2500 (2500%10=0 ), again 250%10=0. Now keeping this in mind we can also
		 * do reverse. A trailing zero is always produced by prime factors 2 and 5. If
		 * we can count the number of 5s and 2s pairs, our task is done. Consider the
		 * following examples
		 * 
		 * n = 5: 5*4*3*2*1(4==2*2)
		 * There is one 5 and three 2s in prime factors of 5! (2 * 2 * 2 * 3 * 5). So
		 * count of trailing 0s is 1.
		 * 
		 * n = 11: 11*10*9*8*7*6*5*4*3*2*1
		 * There are two 5s and eight 2s in prime factors of 11! (11 *5*2 *9* 2*2*2* 7* 2*3* 5* 2*2* 3* 2* 1)
		 * . So count of trailing 0s is 2
		 * 
		 * We can easily observe that the number of 2s in prime factors is always more than 
		 * or equal to the number of 5s. So if we count 5s in prime factors, we are done.
		 * A simple way is to calculate floor(number/5).For example, 7! has one 5, 10! has two 5s
		 * 
		 * Hidden Case:
		 * It is not done yet, there is one more thing to consider. Numbers like 25 (5*5), 125, etc have more than one 5
		 * Whenever value 25-29 comes in value we need to recalculate that value 25, 125, 225,325 and so on.
		 * 
		 * For example if we consider 28!, we get one extra 5 and number of 0s become 6. 
		 * 
		 * Handling this is simple, 
		 * first divide n by 5 and remove all single 5s, 
		 * then divide by 25 to remove extra 5s and so on. 
		 * 
		 * Following is the summarized formula for counting trailing 0s.
		 * Trailing 0s in n! = Count of 5s in prime factors of n!
                  = floor(n/5) + floor(n/25) + floor(n/125) + ....
		 */
		int count =0;
		for(int i =5; number/i>=1;i=i*5) {
			count = count + number/i;
		}
		return count;
	}
	public static void main(String[] args) {
		CountTrailingZeroesInFactorialOfANumber aNumber = new CountTrailingZeroesInFactorialOfANumber();
		Assert.assertEquals(1, aNumber.trailingZero(7));
		Assert.assertEquals(4, aNumber.trailingZero(20));
		Assert.assertEquals(6, aNumber.trailingZero(26));
		Assert.assertEquals(31, aNumber.trailingZero(125));
		Assert.assertEquals(1829, aNumber.trailingZero(7325));

	}

}
