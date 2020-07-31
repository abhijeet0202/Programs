package EasyAlgorithm;

/*
 * Find A Number in Minimum Steps:
 * 
 * Given and infinite number line from -INFINITY to +INFINITY and we are on zero.
 * We can move "n" steps either side at each n'th time.
 * 
 * 1st Time: We can move Only 1 Steps to both ways, means 
 * -1 1
 * 
 * 2nd Time: We can move only 2 Steps to both ways, from -1, 1 means
 * -1: -3 (-1-2) 1(-1+2)
 *  1: -1 (1-2)  3(1+2)
 *  
 *  3rd Time: We can move only 3 Steps to both ways from -3, 1, -1, 3
 * -3: -6(-3-3) 0(-3+3)
 *  1: -2(1-3 )  4(1+3)
 * -1: -4(-1-3) 2(-1+3)
 *  3:  0(3-3 )  6(3+3)
 *  
 *  4th Time: We can move only 4 Steps to both ways from -6, 0, -2, 4, -4, 2, 0, 6
 * -6:  -10(-6-4)	-2(-6 +4)
 *  0:  -4(0-4 )	 4(0 +4 )
 * -2: 	-6(-2-4)	 2(-2 +4)
 *  4: 	0(4-4 )	     8(4 +4 )
 *  -4	-8(-4-4)	 0(-4 +4)
 *  2	-2(2-4 )	 6(2 +4 )
 *  0	-4(0-4 )	 4(0 +4 )
 *  6	2(6-4 )	    10(6 +4 )
 *  
 *  
 *  Examples: 
 *  
 *  Input : n = 10
 *	Output : 4
 *  We can reach 10 in 4 steps,  1, 3, 6, 10 
 *
 *
 *  Input : n = 13
 *  Output : 5
 *  We can reach 13 in 5 steps,  1, -1, 2, 5, 9, 13
 *  
 *  		  			0
 *           		  /   \
 *       		   -1      1  
 *      		  /  \     /  \
 *     			 1   -3    -1    3
 *   		   /  \   / \   / \  / \
 *   		  -2  4  -6  0  2 -4 0  6
 *           / \/ \ / \/ \ / \/ \/ \/ \
 *   
 */

import java.util.LinkedList;
import java.util.Queue;

class NumberContainer {
	int number;
	int level;

	NumberContainer() {
	}

	NumberContainer(int number, int level) {
		this.number = number;
		this.level = level;
	}

	@Override
	public String toString() {
		return "[number=" + number + ", level=" + level + "]";
	}
}

public class FindANumberInMinimumSteps {

	void logicToFindLevel(int number) {

		NumberContainer numberContainer = new NumberContainer(0, 1);
		Queue<NumberContainer> myqueue = new LinkedList<NumberContainer>();
		myqueue.add(numberContainer);

		while (!myqueue.isEmpty()) {
			NumberContainer temp = new NumberContainer();
			System.out.println(myqueue);
			temp = myqueue.poll();

			if (temp.number >= 999999 || temp.number <= -999999) {
				break;
			}
			if (temp.number == number) {
				System.out.println("Found the Number, Minimum Length to approch this number is :" + (temp.level - 1));
				break;
			}
			myqueue.add(new NumberContainer(temp.number - temp.level, temp.level + 1));
			myqueue.add(new NumberContainer(temp.number + temp.level, temp.level + 1));

//			try{
//				Thread.sleep(1000);
//			}catch(InterruptedException ex){
//				
//			}
		}
	}

	public static void main(String[] args) {
		FindANumberInMinimumSteps aNumberInMinimumSteps = new FindANumberInMinimumSteps();
		aNumberInMinimumSteps.logicToFindLevel(5);

		// 2nd Login :Airthmetic summation Logic
		/**
		 * Step 0: Get positive target value (step to get negative target is the same as
		 * to get positive value due to symmetry). 
		 * 
		 * Step 1: Find the smallest step that
		 * the summation from 1 to step just exceeds or equals target. 
		 * 
		 * Step 2: Find the
		 * difference between sum and target. The goal is to get rid of the difference
		 * to reach target. For ith move, if we switch the right move to the left, the
		 * change in summation will be 2*i less. Now the difference between sum and
		 * target has to be an even number in order for the math to check out. 
		 * 
		 * Step 2.1:
		 * If the difference value is even, we can return the current step. 
		 * 
		 * Step 2.2: If
		 * the difference value is odd, we need to increase the step until the
		 * difference is even (at most 2 more steps needed). 
		 * 
		 * Eg: target = 5 Step 0:
		 * target = 5. Step 1: sum = 1 + 2 + 3 = 6 > 5, step = 3. Step 2: Difference = 6
		 * - 5 = 1. Since the difference is an odd value, we will not reach the target
		 * by switching any right move to the left. So we increase our step. Step 2.2:
		 * We need to increase step by 2 to get an even difference (i.e. 1 + 2 + 3 + 4 +
		 * 5 = 15, now step = 5, difference = 15 - 5 = 10). Now that we have an even
		 * difference, we can simply switch any move to the left (i.e. change + to -) as
		 * long as the summation of the changed value equals to half of the difference.
		 * We can switch 1 and 4 or 2 and 3 or 5.
		 */
		int target = 5;
		target = Math.abs(target);
		int k = 0;
		while (target > 0)
			target -= ++k;
		// return target % 2 == 0 ? k : k + 1 + k%2;
		System.out.println(target % 2 == 0 ? k : k + 1 + k % 2);

	}
}
