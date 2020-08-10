package Tree;

import java.util.LinkedList;
import java.util.Queue;

import org.junit.Assert;
import org.junit.Test;

import gaylemcdowell.Trees.PathSumIII;
import gaylemcdowell.Trees.PreOrderToTree;
import gaylemcdowell.Trees.TreeNode;

public class TestPreOrderToTree {
	public static TreeNode root;
	/************************************************************************************************************************
	 * INSERT
	 * **********************************************************************************************************************
	 * 1. Check If root is null or not, if root is null, then simply assign address of newly node to root.
	 * 2. Otherwise, Start Iterate infinitely,
	 * 3. Assign Current as root;
	 * 	3a. Check if node Data is less than newly node Data, if YES.
	 * 		3a1. Check if Current node left Data is null or not, if null, simply assign the newly node ref in current.leftChild 
	 * 		3a2. Else Move current = current.leftChild
	 * 	3b. If Node Data is greater than newly node data
	 * 		3b1. Check if Current node right Data is null or not, if null, simply assign the newly node ref in current.rightChild 
	 * 		3a2. Else Move current = current.rightChild
	 */
	public TreeNode insert(int element){
		TreeNode current = root;
		TreeNode node = new TreeNode(element);
		
		if (null == root){
			root = node;
			return root;
			
		} else {
			while (true){
				if (element < current.val){
					if (current.left == null){
						current.left = node;
						return current;
					} else{
						current = current.left;
					}
				}else {
					if (current.right == null){
						current.right = node;
						return current;
					} else {
						current = current.right;
					}
				}
			}
		}
	}
	
	public void insertBinaryTree(int key){
		
		if(root == null) {
			root = new TreeNode(key);
			return;
		}
		TreeNode current = root;
		
		//TreeNode root = new TreeNode(key);
		Queue<TreeNode> q = new LinkedList<TreeNode>(); 
        q.add(current); 
       
        // Do level order traversal until we find 
        // an empty place.  
        while (!q.isEmpty()) { 
        	current = q.peek(); 
            q.remove(); 
       
            if (current.left == null) { 
            	current.left = new TreeNode(key); 
                break; 
            } else
                q.add(current.left); 
       
            if (current.right == null) { 
            	current.right = new TreeNode(key); 
                break; 
            } else
                q.add(current.right); 
        } 
	}
	@Test
	public void testBstFromPreorder() {
		PreOrderToTree orderToTree = new PreOrderToTree();
		int arr[] = new int[] {8,5,1,7,10,12};
		orderToTree.bstFromPreorder(arr);
	}
	
	@Test
	public void testPathSumIII() {
		
		//PRE-REQUISTE
		TestPreOrderToTree insertBinTree = new TestPreOrderToTree();		
		int arr[] = new int[] {10,5,-3,3,2,0,11,3,-2,0,1};
		for(int i=0; i< arr.length;i++) {
			insertBinTree.insertBinaryTree(arr[i]);
		}
		//Test It
		PathSumIII pathSumIII = new PathSumIII();
		Assert.assertEquals(3,pathSumIII.Solution(root, 8));
		
	}

}
