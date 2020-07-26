package gaylemcdowell.Trees;

/**
 * Definition for a binary tree node.
 */
public class PreOrderToTree {

	public TreeNode bstFromPreorder(int[] preorder) {
		TreeNode root = null;
		TreeNode current = null;

		for (int i = 0; i < preorder.length; i++) {
			int element = preorder[i];
			TreeNode temp = new TreeNode(element);

			if (root == null) {
				root = temp;
			} else {
				current = root;
				while (true) {
					if (element <= current.val) {
						if (current.left != null) {
							current = current.left;
						} else {
							current.left = temp;
							break;
						}
					} else {
						if (current.right != null) {
							current = current.right;
						} else {
							current.right = temp;
							break;
						}
					}
				}
			}

		}
		return root;
	}
}
