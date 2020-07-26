package Tree;

import org.junit.Test;

import gaylemcdowell.Trees.PreOrderToTree;

public class TestPreOrderToTree {

	@Test
	public void testBstFromPreorder() {
		PreOrderToTree orderToTree = new PreOrderToTree();
		int arr[] = new int[] {8,5,1,7,10,12};
		orderToTree.bstFromPreorder(arr);
	}

}
