/**
 * 
 */
package SingleArray;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author Aryan
 *
 */
public class BracketCheck {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Enter a string with Delimeter brackets like '[','{','(',']','}',')':");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		System.out.println(str.length());

		Stack<Character> bracketCheck = new Stack<Character>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			System.out.print(ch);
			switch (ch) {
			case '[':
			case '{':
			case '(':
				bracketCheck.push(ch);
				break;
			case ']':
			case '}':
			case ')':
				if (!bracketCheck.isEmpty()) {
					char chx = bracketCheck.pop();
					if ((chx == '[' && ch == ']') || (chx == '{' && ch == '}') || (chx == '(' && ch == ')')) {
						continue;
					}
				} else {
					System.out.println("Error: " + ch + " at " + i);
					break;
				}
			default:
				// System.out.println("Non Delimeter Found "+ch+" at "+i+ " No action will be
				// taken");
				break;
			}
		}
		if (!bracketCheck.isEmpty()) {
			System.out.print("Error: " + bracketCheck.pop() + " at :");
		}
		scanner.close();
	}

}
