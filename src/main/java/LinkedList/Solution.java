package LinkedList;

/**
 * Definition for singly-linked list.
 */
class ListNodeSum {
	int val;
	ListNodeSum next;

	ListNodeSum() {
	}

	ListNodeSum(int val) {
		this.val = val;
	}

	ListNodeSum(int val, ListNodeSum next) {
		this.val = val;
		this.next = next;
	}
}

public class Solution {
	public static ListNodeSum addTwoNumbers(ListNodeSum l1, ListNodeSum l2) {
		ListNodeSum current = null;
		ListNodeSum result = null;
		int carryFwd = 0;

		while (l1 != null && l2 != null) {
			int addition = l1.val + l2.val + carryFwd;
			carryFwd = addition / 10;
			ListNodeSum temp = new ListNodeSum(addition % 10);
			if (result == null) {
				current = temp;
				result = current;
			} else {
				current.next = temp;
				current = current.next;
			}
			l1 = l1.next;
			l2 = l2.next;
		}

		while (l1 != null) {
			int addition = l1.val + carryFwd;
			carryFwd = addition / 10;
			ListNodeSum temp = new ListNodeSum(addition % 10);
			if (result == null) {
				current = temp;
				result = current;
			} else {
				current.next = temp;
				current = current.next;
			}
			l1 = l1.next;
		}

		while (l2 != null) {
			int addition = l2.val + carryFwd;
			carryFwd = addition / 10;
			ListNodeSum temp = new ListNodeSum(addition % 10);
			if (result == null) {
				current = temp;
				result = current;
			} else {
				current.next = temp;
				current = current.next;
			}
			l2 = l2.next;
		}
		if (carryFwd != 0) {
			ListNodeSum temp = new ListNodeSum(carryFwd);
			current = temp;
			if (result == null) {
				result = current;
			}
		}
		// display(result.head);
		return result;
	}

	public static void main(String[] args) {
		ListNodeSum head = new ListNodeSum(2);
		ListNodeSum current = head;

		current.next = new ListNodeSum(4);
		current = current.next;
		current.next = new ListNodeSum(3);
		current = current.next;

		ListNodeSum head1 = new ListNodeSum(5);
		ListNodeSum current1 = head1;

		current1.next = new ListNodeSum(6);
		current1 = current1.next;
		current1.next = new ListNodeSum(4);
		current1 = current1.next;

		addTwoNumbers(head, head1);
	}
}