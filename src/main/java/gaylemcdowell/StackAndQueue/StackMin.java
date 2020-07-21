package gaylemcdowell.StackAndQueue;

/*
 * Stack Min: How would you design a stack which, in addition to push and pop, has a function min
which returns the minimum element? Push, pop and min should all operate in 0(1) time.
 */

class MinimumValue {
	int minimum;
	int value;

	public MinimumValue(int min, int val) {
		this.minimum = min;
		this.value = val;
	}
}

public class StackMin {
	MinimumValue[] myData;
	int top;
	int capacity;

	StackMin(int capacity) {
		this.capacity = capacity;
		this.top = -1;
		myData = new MinimumValue[capacity];
	}

	public int push(int data) {
		MinimumValue temp = null;
		if (top >= capacity-1) {
			System.out.println("OverFLow");
			return -1;
		}
		if (top ==-1 ||data < myData[top].minimum) {
			temp = new MinimumValue(data, data);
		} else {
			temp = new MinimumValue(myData[top].minimum, data);
		}
		myData[++top] = temp;
		return top;
	}

	public int pop() {
		MinimumValue temp = null;
		if (top == -1) {
			System.out.println("Under FLow");
			return -1;
		}
		temp = myData[top];
		myData[top] = null;
		--top;
		return temp.value;
	}

	public int peek() {
		if (top == -1) {
			System.out.println("Under FLow");
			return -1;
		}
		return myData[top].value;
	}

	public int min() {
		if (top == -1) {
			System.out.println("Under FLow");
			return -1;
		}
		return myData[top].minimum;
	}
}
