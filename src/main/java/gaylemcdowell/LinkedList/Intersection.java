package gaylemcdowell.LinkedList;

import java.util.*;
/*
 *Given two (singly) linked lists, determine if the two lists intersect. Return the intersecting
node. Note that the intersection is defined based on reference, not value. That is, if the kth
node of the first linked list is the exact same node (by reference) as the jth node of the second
linked list, then they are intersecting.
 *
 */
public class Intersection {
    
    public void  intersectionJunctionUsingSet(Node node1, Node node2){
        Map<Node, Integer> myData = new HashMap<Node, Integer>();
        int i = 0;
        while(node1 != null){
            myData.put(node1,i++);
            node1 = node1.next;
        }
        i=0;
        while(node2 !=null){
            if (myData.get(node2)!= null){
                System.out.println("Both listed Intersected at indexes : Node1 Index is:"+ myData.get(node2)+ "Node2 Index is:"+i +"and Data is"+node2.data);
                node2 = node2.next;
            }
            i++;
        }
    }
}
