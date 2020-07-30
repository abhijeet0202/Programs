package gaylemcdowell.Trees;

/**
 * Implement a function to check if a binary tree is balanced. For the purposes
 * of this question, a balanced tree is defined to be a tree such that the
 * heights of the two subtrees of any node never differ by more than one.
 * 
 * @author ezbanab
 *
 */

public class CheckBalanced {
	
	public boolean Solution(TreeNode root) {
		
		if (recursiveCheckBalance(root) != Integer.MIN_VALUE) {
			return true;
		}
		return false;
	}
	
	private int recursiveCheckBalance(TreeNode root) {
		if(root == null) {
			return -1 ;
		}
			int leftHeight = recursiveCheckBalance(root.left);
			if (leftHeight == Integer.MIN_VALUE) return Integer.MIN_VALUE;
			
			int rightHeight = recursiveCheckBalance(root.right);
			if (rightHeight == Integer.MIN_VALUE) return Integer.MIN_VALUE;
			
			if(Math.abs(leftHeight-rightHeight)> 1) {
				return Integer.MIN_VALUE;
			}else {
				return Math.max(leftHeight,rightHeight)+1;
			}
	}

	public static void main(String[] args) {
		InOrdertoTree inOrder = new InOrdertoTree();
		int[] sortedArray = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
		TreeNode current = inOrder.solution(sortedArray);
		
		CheckBalanced balanced = new CheckBalanced();
		System.out.println(balanced.Solution(current));

	}

}
