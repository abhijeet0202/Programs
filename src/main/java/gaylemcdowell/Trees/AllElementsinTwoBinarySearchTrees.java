package gaylemcdowell.Trees;

import java.util.ArrayList;
import java.util.List;

/**
 * Given two binary search trees root1 and root2.
 * 
 * Return a list containing all the integers from both trees sorted in ascending
 * order.
 * 
 * Example 1: 
 * Input: root1 = [2,1,4], root2 = [1,0,3] 
 * Output: [0,1,1,2,3,4] 
 * 
 * Example 2: 
 * Input: root1 = [0,-10,10], root2 = [5,1,7,0,2] 
 * Output: [-10,0,0,1,2,5,7,10]
 * 
 * 
 * Example 3: 
 * Input: root1 = [], root2 = [5,1,7,0,2] 
 * Output: [0,1,2,5,7] 
 * 
 * Example 4: 
 * Input: root1 = [0,-10,10], root2 = [] 
 * Output: [-10,0,10] 
 * 
 * 
 * Example 5: 
 * Input: root1 = [1,null,8], root2 = [8,1] 
 * Output: [1,1,8,8]
 * 
 * 
 * Constraints:
 * 
 * Each tree has at most 5000 nodes. Each node's value is between [-10^5, 10^5].
 * 
 * Hide Hint #1 Traverse the first tree in list1 and the second tree in list2.
 * Hide Hint #2 Merge the two trees in one list and sort it.
 * 
 * @author ezbanab
 *
 */
public class AllElementsinTwoBinarySearchTrees {
	public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
		List<Integer> l1 = new ArrayList<Integer>();
		List<Integer> l2 = new ArrayList<Integer>();
		List<Integer> result = new ArrayList<Integer>();

		inorderTraverse(l1, root1);
		inorderTraverse(l2, root2);

		int i = 0;
		int j = 0;
		while (i < l1.size() && j < l2.size()) {
			if (l1.get(i) < l2.get(j)) {
				result.add(l1.get(i));
				++i;
			} else {
				result.add(l2.get(j));
				++j;
			}
		}
		while (i < l1.size()) {
			result.add(l1.get(i));
			++i;
		}
		while (j < l2.size()) {
			result.add(l2.get(j));
			++j;
		}
		return result;
	}

	private void inorderTraverse(List<Integer> list, TreeNode root) {
		if (root == null) {
			return;
		}
		inorderTraverse(list, root.left);
		list.add(root.val);
		inorderTraverse(list, root.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
