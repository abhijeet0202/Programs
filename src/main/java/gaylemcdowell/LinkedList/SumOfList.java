package gaylemcdowell.LinkedList;

public class SumOfList {
	/*
	Sum Lists: You have two numbers represented by a linked list, where each node contains a single
				digit. The digits are stored in reverse order, such that the 1 's digit is at the head of the list. Write a
				function that adds the two numbers and returns the sum as a linked list.
		EXAMPLE
				Input: (7-> 1 -> 6) + (5 -> 9 -> 2) .Thatis,617 + 295.
				Output: 2 -> 1 -> 9. That is, 912.
		FOLLOW UP
			Suppose the digits are stored in forward order. Repeat the above problem.
			EXAMPLE
			Input: (6 -> 1 -> 7) + (2 -> 9 -> 5).Thatis,617 + 295.
				Output: 9 -> 1 -> 2. That is, 912.
				
				392+ 3158= 3550   07
	*/
	public Node sumOfList(Node n1, Node n2){
		LinkedList result = new LinkedList();
		int carryFwd = 0;
		
		while(n1 != null && n2 != null) {
			int addition = n1.data+ n2.data+carryFwd;
			carryFwd = addition/10;
			result.insertFirst(addition%10);
			
			n1 = n1.next;
			n2 = n2.next;			
		}
		
		while(n1 != null) {
			int addition = n1.data+carryFwd;
			carryFwd = addition/10;
			result.insertFirst(addition%10);
			n1 = n1.next;		
		}
		
		while(n2 != null) {
			int addition = n2.data+carryFwd;
			carryFwd = addition/10;
			result.insertFirst(addition%10);
			n2 = n2.next;		
		}
		if (carryFwd!=0)
			result.insertFirst(carryFwd);
		
		result.display();
		return result.head;
		
	}

}
