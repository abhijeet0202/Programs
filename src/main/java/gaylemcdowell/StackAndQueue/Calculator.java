package gaylemcdowell.StackAndQueue;

/*
 * Calculator: Given an arithmetic equation consisting of positive integers, +, -, * and / (no parentheses),compute the result.
 * EXAMPLE
 *    Input:  2*3+5/6*3+15
 *    Output: 23.5
 * 
 * - Each time we see a number, it gets pushed onto numberStack.
 * - Operators get pushed onto operatorS tack-as long as the operator has higher priority than the
	 current top of the stack. If priority (currentOperator) <= priority( operatorStack.
	 top ( ) ), then we "collapse"the top of the stacks:
 * 		- Collapsing: pop two elements off numberStack, pop an operator off operatorStack, apply
					  the operator, and push the result onto numberStack.
		- Priority: addition and subtraction have equal priority, which is lower than the priority of multiplication
					and division (also equal priority).
   - This collapsing continues until the above inequality is broken, at which point currentOperator is
     pushed onto operatorStack.
 *
 *  At the very end, we collapse the stack.Let's see this with an example: 2 - 6 - 7 * 8 / 2 + 5
				action 				numberStack 			operatorStack
	2   	numberStack.push(2) 		2 						[empty]
	- 		operatorStack.push(-) 		2 							-
	6 		numberStack.push(6) 		6, 2 						-
	- 		collapseStacks [2 - 6] 		-4 						[empty]
			operatorStack.push(-) 		-4 							-
	7 		numberStack.push(7) 7, 		-4 							-
 	* 		operatorStack.push(*) 		7, -4 						* , -
	8 		numberStack.push(8) 		8, 7, -4 					* , -
	/ 		collapseStack [7 * 8] 		56, -4 						-
			numberStack.push(/) 		56, -4 						/, -
	2 		numberStack.push(2) 		2, 56, -4 					/, -
	+ 		collapseStack [56 / 2] 		28, -4 						-
			collapseStack [-4 - 28] 	-32 					[empty]
			operatorStack.push(+) 		-32 						+
	5 		numberStack.push(5) 		5, -32 						+
			collapseStack [ - 32 + 5] 	-27 					[empty]
			return -27
 *
 *
 *
 */


public class Calculator {
	MyStack operator;
	MyStack operand;

	enum OP {MINUS, PLUS, MULTIPLY, DIVIDE, BLANK;
		}
	public static void main(String[] args) {
		
	}
	
	

}
