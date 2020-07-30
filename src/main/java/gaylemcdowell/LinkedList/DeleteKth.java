package gaylemcdowell.LinkedList;

public class DeleteKth {

	// ListNode current = head;
	public Node removeNthFromEnd(Node head, int n) {
		Node dummy = new Node(0);
		dummy.next = head;
		Node first = dummy;

		removeNth(first, n);
		// head=dummy;
		return first;

	}

	public int removeNth(Node head, int n) {
		if (head == null)
			return 0;

		int i = removeNth(head.next, n);
		System.out.println(i + "::" + head.data);
		// System.out.println(head.val);
		if (i == n) {

			if (head.next.next != null) {
				System.out.println("Enterered");
				head.next = head.next.next;
			} else {
				System.out.println("Entered");
				head.next = null;
				head = null;
			}
		}
		return ++i;
	}

	public static void main(String[] args) {
		LinkedList ln = new LinkedList();
		ln.insertFirst(1);
		
		DeleteKth deleteKt = new DeleteKth();
		deleteKt.removeNthFromEnd(ln.head, 1);

	}

}
