package LinkedList;

import java.util.HashMap;

/**
 * Design and implement a data structure for Least Recently Used (LRU) cache. It
 * should support the following operations: get and put.
 * 
 * get(key) - Get the value (will always be positive) of the key if the key
 * exists in the cache, otherwise return -1. 
 * 
 * put(key, value) - Set or insert the value if the key is not already present. 
 * When the cache reached its capacity, it should invalidate the least recently 
 * used item before inserting a new item.
 * 
 * The cache is initialized with a positive capacity.
 * 
 * Follow up: Could you do both operations in O(1) time complexity?
 * 
 * Example:
 * 
 * LRUCache cache = new LRUCache( 2 capacity );
 * 
 * cache.put(1,1);cache.put(2,2);cache.get(1); // returns 1 cache.put(3,3); //
 * evicts key 2 cache.get(2); // returns -1 (not found) cache.put(4,4); //
 * evicts key 1 cache.get(1); // returns -1 (not found) cache.get(3); // returns
 * 3 cache.get(4); // returns 4
 * 
 * @author Abhijeet
 *
 */

class Node{
	int key;
	int value;
	Node next;
	Node prev;
	
	public Node(int key, int value) {
		this.key = key;
		this.value = value;
	}
}
public class LRUCache {
	HashMap<Integer, Node> myData;
	int capacity;
	Node head;
	Node tail;
	
	public LRUCache(int capacity) {
        myData = new HashMap<>();
        this.capacity =capacity;
    }
    
    public int get(int key) {
    	if(!myData.containsKey(key)) {
    		return -1;
    	}
    		 //move to tail
            Node t = myData.get(key);
            remove(t);
            insert(t);
            return t.value;
    }
    
    public void put(int key, int value) {
        if(myData.containsKey(key)){
            Node t = myData.get(key);
            t.value = value;
 
            //move to tail
            remove(t);
            insert(t);
        }else{
            if(myData.size()>=capacity){
                //delete head
            	myData.remove(head.key);
                remove(head);
            }
 
            //add to tail
            Node node = new Node(key, value);
            insert(node);
            myData.put(key, node);
        }
    }
    
    private void remove(Node node){
        if(node.prev!=null){
            node.prev.next = node.next;
        }else{
            head = node.next;
        }
 
        if(node.next!=null){
            node.next.prev = node.prev;
        }else{
            tail = node.prev;
        }
    }
 
	private void insert(Node node) {
		if (tail != null) {
			tail.next = node;
		}
		node.prev = tail;
		node.next = null;
		tail = node;

		if (head == null) {
			head = tail;
		}
	}
}
