package gaylemcdowell.Trees;

import java.util.Stack;

public class SumofLeftLeaves {
	
	public int sumOfLeftLeaves(TreeNode root) {
        if(root == null)return 0;
        
        TreeNode current = root;
        Stack<TreeNode> myStack = new Stack<TreeNode>();
        myStack.push(current);
        int sum=0;
        while(!myStack.empty()){
            TreeNode node = myStack.pop();
            if(node.left != null){
                if(node.left.left ==null && node.left.right==null){
                    sum+= node.left.val;  
                }else{
                    myStack.push(node.left);
                }
            }
            
            if(node.right != null){
                    myStack.push(node.right);
                }
        }
        return sum;
    }

}
