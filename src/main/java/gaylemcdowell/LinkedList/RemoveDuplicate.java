package gaylemcdowell.LinkedList;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
	public void removeDupsUsingSet(Node head) {
		Node current = head;
		Node previous = null;
		
		Set<Integer> dups = new HashSet<Integer>();
		while (current != null) {
			if (!dups.add(current.data)) {
				previous.next = current.next;
				current = current.next;
			} else {
				previous = current;
				current = current.next;
			}
		}
	}

}
