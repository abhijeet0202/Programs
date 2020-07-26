package gaylemcdowell.StackAndQueue;

import java.util.Stack;

import org.junit.Assert;

public class StockSpanner {

	Stack<int[]> myData;

	public StockSpanner() {
		myData = new Stack<int[]>();
	}

	public int next(int price) {
		int span = 1;
		while (!myData.isEmpty() && myData.peek()[0] <= price) {
			span += myData.pop()[1];
		}
		myData.push(new int[] { price, span });
		return span;

	}

	public static void main(String[] args) {
		StockSpanner spanner = new StockSpanner();
		Assert.assertEquals(1, spanner.next(100));
		Assert.assertEquals(1, spanner.next(80));
		Assert.assertEquals(1, spanner.next(60));
		Assert.assertEquals(2, spanner.next(70));
		Assert.assertEquals(1, spanner.next(60));
		Assert.assertEquals(4, spanner.next(75));
		Assert.assertEquals(6, spanner.next(80));
	}

}
