package gaylemcdowell.LinkedList;

/**
 * Given a singly linked list L: L0->L1->…→Ln-1→Ln, reorder it
 * to:L0→Ln→L1→Ln-1→L2→Ln-2→…
 * 
 * You may not modify the values in the list's nodes, only nodes itself may be
 * changed.
 * 
 * Example 1:
 * 
 * Given 1->2->3->4, reorder it to 1->4->2->3. Example 2:
 * 
 * Given 1->2->3->4->5, reorder it to 1->5->2->4->3.
 */
public class ReorderList {

	public void reOrderList(Node head) {
		Node counting = head;
		 Node current = head;
		 int count=0;
		 while(counting!=null) {
			 ++count;
			 counting = counting.next;
		 }
		reOrderList(current,current, 0,count/2);
	}

	private Node reOrderList(Node right,Node left,int rightIndex, int leftIndex) {
		if(right.next == null) {
			return left;
		}
		
		left = reOrderList(right.next,left, ++rightIndex,leftIndex);
		if(leftIndex< rightIndex) {
			Node temp = right.next;
			right.next = right.next.next;
			temp.next=left.next;
			left.next =temp;
			return left = left.next.next;
			
		}
		return left;
		//return leftIndex+=2;
		//System.out.println();
		
	}
}
