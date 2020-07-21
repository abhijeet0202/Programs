package gaylemcdowell.StackAndQueue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestStackAndQueue {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPeek() {
		ThreeInOne inOne = new ThreeInOne(3);

		inOne.push(100, 2);
		inOne.push(16, 2);
		inOne.push(19, 2);
		inOne.push(111, 2);
		System.out.println(inOne.peek(2));
		inOne.push(1, 0);
		inOne.push(11, 0);
		inOne.push(14, 0);
		inOne.push(17, 0);
		System.out.println(inOne.peek(0));
		inOne.push(13, 1);
		inOne.push(11, 1);
		inOne.push(15, 1);
		inOne.push(18, 1);
		inOne.push(21, 1);
		System.out.println(inOne.peek(1));
	}

	@Test
	public void testPush() {
		ThreeInOne inOne = new ThreeInOne(3);

		inOne.push(100, 2);
		inOne.push(16, 2);
		inOne.push(19, 2);
		inOne.push(111, 2);

		inOne.push(1, 0);
		inOne.push(11, 0);
		inOne.push(14, 0);
		inOne.push(17, 0);

		inOne.push(13, 1);
		inOne.push(11, 1);
		inOne.push(15, 1);
		inOne.push(18, 1);
		inOne.push(21, 1);
	}

	@Test
	public void testPop() {
		ThreeInOne inOne = new ThreeInOne(3);

		inOne.push(100, 2);
		inOne.push(16, 2);
		System.out.println(inOne.pop(2));
		System.out.println(inOne.pop(2));
		System.out.println(inOne.pop(2));
		System.out.println(inOne.peek(2));
		inOne.push(1, 0);
		inOne.push(11, 0);
		inOne.push(14, 0);
		inOne.push(17, 0);
		System.out.println(inOne.peek(0));
		inOne.push(13, 1);
		inOne.push(11, 1);
		inOne.push(15, 1);
		inOne.push(18, 1);
		inOne.push(21, 1);
		System.out.println(inOne.peek(1));
	}

	/*
	 * Stack Min: How would you design a stack which, in addition to push and pop,
	 * has a function min which returns the minimum element? Push, pop and min
	 * should all operate in 0(1) time.
	 */

	@Test
	public void Q2testPop() {
		StackMin min = new StackMin(4);
		System.out.println(min.push(5));
		System.out.println(min.min());
		System.out.println(min.push(3));
		System.out.println(min.peek());
		System.out.println(min.min());
		System.out.println(min.pop());
		System.out.println(min.min());
		System.out.println(min.push(2));
		System.out.println(min.push(7));
		System.out.println(min.push(8));
		System.out.println(min.peek());
		System.out.println(min.min());
		System.out.println(min.pop());
		System.out.println(min.min());
		System.out.println(min.push(1));
		System.out.println(min.push(11));
		System.out.println(min.push(-1));
	}
	
	
	/*
	 * Stack of Plates: Imagine a (literal) stack of plates. If the stack gets too high, it might topple.
	Therefore, in real life, we would likely start a new stack when the previous stack exceeds some
	threshold. Implement a data structure SetOfStacks that mimics this. SetOfStacks should be
	composed of several stacks and should create a new stack once the previous one exceeds capacity.
	SetOfStacks. push () and SetOfStacks. pop () should behave identically to a single stack
	(that is, pop ( ) should return the same values as it would if there were just a single stack).
	FOLLOW UP
	Implement a function popAt (int index) which performs a pop operation on a specific sub-stack.
	 */
	
	@Test
	public void Q3StackOfPlates() {
		StackOfPlates ofPlates = new StackOfPlates(3);
		ofPlates.push(1);
		ofPlates.push(2);
		ofPlates.push(3);
		ofPlates.push(4);
		ofPlates.push(5);
		ofPlates.push(6);
		ofPlates.push(7);
		ofPlates.push(8);
		ofPlates.push(9);
		ofPlates.push(10);
		
		ofPlates.peek();
		ofPlates.pop();
		
		ofPlates.peek();
		ofPlates.pop();
		ofPlates.peek();
		ofPlates.pop();
		ofPlates.peek();
		ofPlates.pop();
		ofPlates.peek();
		ofPlates.pop();
		ofPlates.peek();
		ofPlates.pop();
		ofPlates.peek();
		ofPlates.pop();
		ofPlates.peek();
		ofPlates.pop();
		ofPlates.peek();
		ofPlates.pop();
		ofPlates.peek();
		ofPlates.pop();
		ofPlates.peek();
		ofPlates.pop();
	}
	
	
	
	/*
	 * Queue via Stacks: Implement a MyQueue class which implements a queue using two stacks.
	 */
	
	@Test
	public void Q4QueueViaStack() {
		QueueViaStack queue = new QueueViaStack(3);
		
		queue.push(1);
		queue.push(2);
		queue.push(3);
		queue.push(4);
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.pop());
	
	}	
	
	
	/*
	 * Sort Stack: Write a program to sort a stack such that the smallest items are on the top. You can use
	an additional temporary stack, but you may not copy the elements into any other data structure
	(such as an array). The stack supports the following operations: push, pop, peek, and isEmpty.
	 */
	
	@Test
	public void Q5SortedStack() {
		SortedStack sortedStack = new SortedStack(4);
		sortedStack.push(1);
		sortedStack.push(10);
		sortedStack.push(100);
		sortedStack.push(1000);
	}
}
