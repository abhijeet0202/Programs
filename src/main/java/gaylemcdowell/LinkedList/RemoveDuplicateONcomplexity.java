package gaylemcdowell.LinkedList;

public class RemoveDuplicateONcomplexity {

	public void removeDups(Node head) {
		Node current = head;
		Node previous = null;
		int bitarray = 0;
		while (current != null) {
			int data = 1; // 0000 0001
			int value = current.data;
			/***********
			 * Left shift inter x (1) by number of places equals to value If value =4, After
			 * below operation x will become 0000 1000
			 ***********/
			data = data << value;
			/*****************************
			 * Bitwise and operation to add above result in a bit array.
			 ********************************/
			if ((bitarray & data) != 0) {
				System.out.println("Duplicate found in given linked list: " + value);
				/**************************
				 * It will delete current node with O(1) time complexity and will return next
				 * node; We can't delete last node by using below operation so we need to check
				 * it.
				 *******************************/
				previous.next = null;
				current = current.next;

			} else {
				bitarray = bitarray | data;
				previous = current;
				current = current.next;
			}
		}
	}

}
