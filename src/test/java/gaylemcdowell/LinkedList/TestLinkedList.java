package gaylemcdowell.LinkedList;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestLinkedList {
	LinkedList linkedList ;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		linkedList = new LinkedList();
		linkedList.insertFirst(1);
		linkedList.insertFirst(1);
		linkedList.insertFirst(2);
		linkedList.insertFirst(2);
		linkedList.insertFirst(2);
		linkedList.insertFirst(3);
		linkedList.insertFirst(3);
		linkedList.insertFirst(4);
	}

	@Test
	public void sumToListn1Small() throws Exception {
		LinkedList node1 = new LinkedList();
		node1.insertFirst(3);
		node1.insertFirst(9);
		node1.insertFirst(2);
		
		LinkedList node2 = new LinkedList();
		node2.insertFirst(3);
		node2.insertFirst(1);
		node2.insertFirst(5);
		node2.insertFirst(8);
		
		SumOfList sumOfList = new SumOfList();
		sumOfList.sumOfList(node1.head, node2.head);
	}
	
	@Test
	public void sumToListn2Small() throws Exception {
		LinkedList node2 = new LinkedList();
		node2.insertFirst(9);
		node2.insertFirst(9);
		node2.insertFirst(9);
		
		LinkedList node1 = new LinkedList();
		node1.insertFirst(9);
		node1.insertFirst(9);
		node1.insertFirst(9);
		node1.insertFirst(9);
		
		SumOfList sumOfList = new SumOfList();
		sumOfList.sumOfList(node1.head, node2.head);
		linkedList.display();
	}

	@Test
	public void testPartition() {
		linkedList.insertFirst(33);
		linkedList.insertFirst(9);
		linkedList.insertFirst(2);
		linkedList.insertFirst(3);
		linkedList.insertFirst(10);
		linkedList.insertFirst(10389);
		linkedList.insertFirst(838);
		linkedList.insertFirst(874578);
		
		Partition partition = new Partition();
		Node output = partition.partition(5, linkedList.head);
		linkedList.display(output);
	}

	@Test
	public void testDisplay() {
		linkedList.display();
	}

	@Test
	public void testRemoveDups() {
		RemoveDuplicate rd = new RemoveDuplicate();
		linkedList.display();
		rd.removeDupsUsingSet(linkedList.head);
		linkedList.display();
	}

	@Test
	public void testKthToLastRecurrsion() {
		kthToLast kth = new kthToLast();
		kth.kthToLastRecurrsion(3, linkedList.head);
		kth.kthToLastRecurrsion(18, linkedList.head);
	}
	
	@Test
	public void testKthToLastIterative() {
		kthToLast kth = new kthToLast();
		kth.kthToLastIterative(4, linkedList.head);
		kth.kthToLastIterative(18, linkedList.head);
	}
	
	@Test
	public void palindrom() {
		Palindrome palObj = new Palindrome();
		LinkedList head1 = new LinkedList();
		head1.insertFirst(1);
		head1.insertFirst(2);
		head1.insertFirst(2);
		head1.insertFirst(1);
		
		palObj.palindromRecursive(head1.head,head1.head);
	}
	
	@Test
	public void testIntersectionJunctionUsingSet() {
		Intersection palObj = new Intersection();
		LinkedList head1 = new LinkedList();
		head1.insertFirst(1);
		head1.insertFirst(2);
		head1.insertFirst(2);
		head1.insertFirst(2);
		head1.insertFirst(4);
		head1.insertFirst(6);
		
		
		palObj.intersectionJunctionUsingSet(head1.head,head1.head.next.next.next.next.next);
	}

	@Test
	public void testIntersectionJunctionUsingSetNegative() {
		Intersection palObj = new Intersection();
		LinkedList head1 = new LinkedList();
		head1.insertFirst(1);
		head1.insertFirst(2);
		head1.insertFirst(2);
		head1.insertFirst(2);
		head1.insertFirst(4);
		head1.insertFirst(6);
		
		LinkedList head2 = new LinkedList();
		head1.insertFirst(1);
		head1.insertFirst(2);
		head1.insertFirst(2);
		head1.insertFirst(2);
		head1.insertFirst(4);
		head1.insertFirst(6);
		
		
		palObj.intersectionJunctionUsingSet(head1.head,head2.head);
	}
}
