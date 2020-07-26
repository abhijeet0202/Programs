package gaylemcdowell.Trees;

public class TreeNode {
	public int val;
	public TreeNode left;
	public TreeNode right;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return val+"";
	}
	public TreeNode(int x) {
		val = x;
	}

	public void InOrderTraversal(TreeNode current) {
		if (current == null)
			return;
		InOrderTraversal(current.left);
		System.out.print(current.val + "->");
		InOrderTraversal(current.right);
	}

	public void PreOrderTraversal(TreeNode current) {
		if (current == null)
			return;
		System.out.print(current.val + "->");
		PreOrderTraversal(current.left);
		PreOrderTraversal(current.right);
	}
}
