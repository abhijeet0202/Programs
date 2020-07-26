package gaylemcdowell.Trees;

/**
 * Minimal Tree: Given a sorted (increasing order) array with unique integer
 * elements, write an algorithm to create a binary search tree with minimal
 * height.
 */
public class InOrdertoTree {

	public TreeNode solution(int[] arr) {
		return inOrder(arr, 0, arr.length - 1);
	}

	public TreeNode inOrder(int[] arr, int start, int end) {

		if (start > end) {
			return null;
		}
		int mid = (start + end) / 2;
		TreeNode node = new TreeNode(arr[mid]);
		node.left = inOrder(arr, start, mid - 1);
		node.right = inOrder(arr, mid + 1, end);

		return node;
	}

	public static void main(String[] args) {
		InOrdertoTree inOrder = new InOrdertoTree();
		int[] sortedArray = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
		TreeNode current = inOrder.solution(sortedArray);
		current.InOrderTraversal(current);
		System.out.println();
		current.PreOrderTraversal(current);
	}

}
