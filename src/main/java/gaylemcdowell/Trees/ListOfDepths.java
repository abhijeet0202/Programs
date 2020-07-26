package gaylemcdowell.Trees;

import java.util.*;

/**
 * Given a binary tree, design an algorithm which creates a linked list of all
 * the nodes at each depth (e.g., if you have a tree with depth 0, you'll have 0
 * linked lists).
 * 
 * @author Abhijeet
 *
 */
public class ListOfDepths {

	public ArrayList<LinkedList<TreeNode>> RecursiveSolution(TreeNode root) {
		ArrayList<LinkedList<TreeNode>> result = new ArrayList<LinkedList<TreeNode>>();
		return recursiveDFS(root, result, 0);

	}

	public ArrayList<LinkedList<TreeNode>> recursiveDFS(TreeNode root, ArrayList<LinkedList<TreeNode>> result,
			int level) {

		if (root == null) {
			return null;
		}

		LinkedList<TreeNode> myData;
		if (result.size() == level) {
			/* Levels are always traversed in order. So, if this is the first time we've visited level i,
			 * we must have seen levels 0 through i - 1. We can therefore safely add the level at the end. */
			myData = new LinkedList<TreeNode>();
			result.add(myData);
		} else {
			myData = result.get(level);
		}
		
		myData.add(root);
		recursiveDFS(root.left, result, level + 1);
		recursiveDFS(root.right, result, level + 1);
		
		return result;
	}

	public ArrayList<LinkedList<TreeNode>> IterativeSolution(TreeNode root) {
		ArrayList<LinkedList<TreeNode>> result = new ArrayList<LinkedList<TreeNode>>();

		LinkedList<TreeNode> current = new LinkedList<TreeNode>();
		current.add(root);

		while (!current.isEmpty()) {
			result.add(current);

			LinkedList<TreeNode> temp = current;
			current = new LinkedList<TreeNode>();
			for (TreeNode parent : temp) {
				if (parent.left != null) {
					current.add(parent.left);
				}
				if (parent.right != null) {
					current.add(parent.right);
				}
			}
		}
		return result;

	}

	public static void main(String[] args) {

		// PreRequiste
		InOrdertoTree inOrder = new InOrdertoTree();
		int[] sortedArray = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
		TreeNode current = inOrder.solution(sortedArray);

		// Problem Solving using Breath First Search
		ListOfDepths bfs = new ListOfDepths();
		ArrayList<LinkedList<TreeNode>> ans = bfs.IterativeSolution(current);
		System.out.println(ans);

		// Problem Solving using Depth First Search
		ListOfDepths dfs = new ListOfDepths();
		ans = dfs.RecursiveSolution(current);
		System.out.println(ans);
	}

}
