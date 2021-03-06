package gaylemcdowell.LinkedList;

public class kthToLast {

	/*
	Return Kth to Last: Implement an algorithm to find the kth to last element of a singly linked list : USING RECURSSION
	*/
	public int kthToLastRecurrsion(int k, Node head){
		 Node current = head;
		return kthToLastRecurrsion(current,k);
	}
	public int kthToLastRecurrsion(Node current, int k){
		int result =-1;
		if(current == null)
			return 0;
		
		int index = kthToLastRecurrsion(current.next, k)+1;
		if(index == k){
			System.out.println("The kth: "+k +" from last index is:"+ current.data);
			result = index;
		}
		return result;
	}
	
	
	
	/*
	Return Kth to Last: Implement an algorithm to find the kth to last element of a singly linked list : USING ITERATIVE
	*/
	public int kthToLastIterative(int k, Node head){
		Node current = head;
		Node kth = head;
		
		for(int i=0;i <k ;i++){
			if(current.next != null) {
				current = current.next;
			}else{
				return -1;
			}
		}
		
		while(current.next !=null){
			current=current.next;
			kth=kth.next;
		}
		System.out.println("The kth: "+k +" from last index is:"+ kth.data);
		return kth.data;
	}
	
	/*******************************************/
	public static class Index {
		public int value = 0;
	}	
	public Node kthToLastInterative(int k, Node head) {
		Index idx = new Index();
		return kthToLastInterative(head, k, idx);
	}
	
	public Node kthToLastInterative(Node head, int k, Index idx) {
		if (head == null) {
			return null;
		}
		Node node = kthToLastInterative(head.next, k, idx);
		idx.value = idx.value + 1;
		if (idx.value == k) {
			return head;
		} 
		return node;
	}		
}
