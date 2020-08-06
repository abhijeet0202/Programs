package gaylemcdowell.LinkedList;

public class Partition {
	/*
	Partition: Write code to partition a linked list around a value x, such that all nodes less than x come
				before all nodes greater than or equal to x. lf x is contained within the list, the values of x only need
				to be after the elements less than x (see below). The partition element x can appear anywhere in the
				"right partition"; it does not need to appear between the left and right partitions.
			EXAMPLE
			Input: 3 -> 5 -> 8 -> 5 -> 10 -> 2 -> 1 [partition = 5)
			Output: 3 -> 1 -> 2 -> 10 -> 5 -> 5 -> 8
		*/
	public Node partition(int partition, Node head){
		Node afterPartitionHead = null;
		Node afterPartitioncurrent = null;
		Node beforePartitionHead = null;
		Node beforePartitionCurrent = null;
		
		Node current = head;
		
		while(current != null){
			Node temp = current.next;
			current.next = null;
			if (current.data < partition){
				if (beforePartitionHead == null){
					beforePartitionHead = current;
					beforePartitionCurrent = current;
				}else{
					beforePartitionCurrent.next = current;
					beforePartitionCurrent = current;
				}
				
			}else{
				if (afterPartitionHead == null){
					afterPartitionHead = current;
					afterPartitioncurrent = current;
				}else{
					afterPartitioncurrent.next = current;
					afterPartitioncurrent = current;
				}
					
			}
			current =temp;
		}
		
		if (beforePartitionHead == null) return afterPartitionHead;
		
		beforePartitionCurrent.next = afterPartitionHead;
		
		return beforePartitionHead;
	}
	
}
