package SingleArray;

/**
 * Given two integers dividend and divisor, divide two integers without using multiplication, division and mod operator.

Return the quotient after dividing dividend by divisor.

The integer division should truncate toward zero, which means losing its fractional part. For example, truncate(8.345) = 8 and truncate(-2.7335) = -2.

Example 1:

Input: dividend = 10, divisor = 3
Output: 3
Explanation: 10/3 = truncate(3.33333..) = 3.

Example 2:

Input: dividend = 7, divisor = -3
Output: -2
Explanation: 7/-3 = truncate(-2.33333..) = -2.

Note:

    Both dividend and divisor will be 32-bit signed integers.
    The divisor will never be 0.
    Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 231 − 1 when the division result overflows.


 * @author ezbanab
 *
 */
public class DivideTwoIntegers {

	public int divide(int dividend, int divisor) {
        boolean isNegative = (dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0);
        
        if (divisor == 0) return 0;
        
        if(dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        
        long a = Math.abs((long)dividend);
        long b = Math.abs((long)divisor);
        int result=0;
        while(a>=b){
            long c = b;
           for (int i =0; a >=c ;i++){
                a=a-c;
                result = result + (1 << i);
                c = c<< 1 ;
            }
        }
        if(isNegative)return -result;
        
        return result;
    }
	public static void main(String[] args) {
		DivideTwoIntegers twoIntegers = new DivideTwoIntegers();
		System.out.println(twoIntegers.divide(10, 3));
	}

}
