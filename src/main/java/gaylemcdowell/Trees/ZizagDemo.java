package gaylemcdowell.Trees;

import java.util.ArrayList;
import java.util.LinkedList;

class Tree{
	int data;
	Tree leftChild;
	Tree rightChild;
}
public class ZizagDemo {

	public ArrayList<ArrayList<Integer>> sendZizag(Tree root){
		ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> nodeData = new ArrayList<Integer>();
		if(root == null) {
			return a;
		}
		
		LinkedList<Tree> current = new LinkedList<Tree>();
		current.add(root);
		LinkedList<Tree> next = new LinkedList<Tree>();
		
		while(!current.isEmpty()) {
			Tree node = current.remove();
			
			if(node.leftChild !=null) {
				next.add(node.leftChild);
			}
			if(node.rightChild !=null) {
				next.add(node.rightChild);
			}
			
			nodeData.add(node.data);
			
			if(current.isEmpty()) {
				current = next;
				next = new LinkedList<Tree>();
				a.add(nodeData);
				nodeData = new ArrayList<Integer>();
			}
		}
		return a;
	}
	public static void main(String[] args) {
		Tree tree = new Tree();
	}

}
