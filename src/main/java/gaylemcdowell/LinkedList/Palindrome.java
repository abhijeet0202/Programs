package gaylemcdowell.LinkedList;

public class Palindrome {
	public Node palindromRecursive(Node first, Node last){
		if(last == null)
			return first;
		
		
		first =palindromRecursive(first,last.next);
		if(first.data != last.data){
			System.out.println ("Not palindrom");
		}else{
			first= first.next;
		}
		return first;
	}
}
