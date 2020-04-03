package LinkedList;

import java.util.HashSet;
import java.util.Set;

/**
Given a linked list, determine if it has a cycle in it.
To represent a cycle in the given linked list, we use an integer pos which represents the position (0-indexed)
in the linked list where tail connects to. If pos is -1, then there is no cycle in the linked list.

Example 1:

Input: head = [3,2,0,-4], pos = 1 //pos represent last index connect with pos i.e index 1 node here -4 is connected the 2
Output: true
Explanation: There is a cycle in the linked list, where tail connects to the second node.

Example 2:
Input: head = [1,2], pos = 0
Output: true
Explanation: There is a cycle in the linked list, where tail connects to the first node.

Example 3:

Input: head = [1], pos = -1
Output: false
Explanation: There is no cycle in the linked list.

*/


 class ListNode {
     int val;
      ListNode next;
    ListNode(int x) {
         val = x;
          next = null;
     }
 }
/**
 * Below Program will not run, as Prerequisite, we need to place a linked list insertion logic 
 * @author ezbanab
 *
 */
public class FindLoopInList {

	/*
	 * Approach 1: take 2 nodes slow (it will move 1 step at a time) and fast (it will move 2 step at a time)
	 *   Ex: 3->2->0->-4->2
	 *   slow | fast | slow==fast
	 *     2  |  0   |   No
	 *     0  |  2   |   No
	 *     4  |  4   |   Yes
	 */
	 public boolean hasCycleComapringTwoNodes(ListNode head) {
		 if (head == null) {
			return false;
		 }
		 if (head.next == null) {
	        return false;
	     }
	     ListNode slow = head;
	     slow = slow.next;
	     ListNode fast = head;
		 fast = fast.next.next;
		 
		 while (fast != null && fast.next != null) {
			 if (fast == slow) {
			     return true;
			 }
			 slow = slow.next;
			 fast = fast.next.next;
		 }
		 return false;
	}
	 
	 /*
		 * Approach 2: USe Hash Set
		 */
	public boolean hasCycle(ListNode head) {

		Set<ListNode> nodeSet = new HashSet<ListNode>();
		while (head != null) {
			if (nodeSet.contains(head)) {
				return true;
			} else {
				nodeSet.add(head);
			}
			head = head.next;
		}
		return false;
	}
}
