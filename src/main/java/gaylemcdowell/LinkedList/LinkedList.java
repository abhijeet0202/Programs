package gaylemcdowell.LinkedList;

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		this.next = null;
	}
}

public class LinkedList {
	Node head = null;

	public Node insertFirst(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
		} else {
			node.next = head;
			head = node;
		}
		return head;
	}

	public void display() {
		Node current = head;
		System.out.println();
		while (current != null) {
			System.out.print(current.data + "->");
			current = current.next;
		}
	}

	public void display(Node temp) {
		Node current = temp;
		System.out.println();
		while (current != null) {
			System.out.print(current.data + "->");
			current = current.next;
		}
	}

}