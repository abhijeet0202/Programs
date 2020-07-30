package gaylemcdowell.Trees;

/*
 * Implement a function to check if a binary tree is a binary search tree.
 */

public class ValidateBST {
	public static Integer lastPrinted = null;

	public boolean checkBST(TreeNode node) {
		return checkBST(node, true);
	}

	
	/***
	 * First go to deep left and copy "lastPrinted" value.
	 * Now once 
	 * @param n
	 * @param isLeft
	 * @return
	 */
	public boolean checkBST(TreeNode n, boolean isLeft) {
		if (n == null) {
			return true;
		}

		// Check / recurse left
		if (!checkBST(n.left, true)) {
			return false;
		}

		// Check current
		if (lastPrinted != null) {
			if (isLeft) {
				// left child "is allowed" be equal to parent.
				if (n.val < lastPrinted) {
					return false;
				}
			} else {
				// Right child "is not allowed" be equal to parent.
				if (n.val <= lastPrinted) {
					return false;
				}
			}
		}
		lastPrinted = n.val;

		// Check / recurse right
		if (!checkBST(n.right, false)) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// PreRequiste
		InOrdertoTree inOrder = new InOrdertoTree();
		int[] sortedArray = new int[] { 1, 2, 23, 4, 5, -12, 7, 8 };
		TreeNode current = inOrder.solution(sortedArray);
		ValidateBST bst = new ValidateBST();
		System.out.println(bst.checkBST(current));
	}

}
