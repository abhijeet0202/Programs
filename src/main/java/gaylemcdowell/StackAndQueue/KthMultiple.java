package gaylemcdowell.StackAndQueue;

import java.util.*;
/*
 * Kth Multiple: Design an algorithm to find the kth number such that the only prime factors are 3, 5,
and 7. Note that 3, 5, and 7 do not have to be factors, but it should not have any other prime factors.
For example, the first several multiples would be (in order) 1, 3, 5,7,9, 15,21.
 */
public class KthMultiple {

    TreeSet<Integer> myTree = new TreeSet<Integer>();
    public int findKth(int k){
        int val = -1;

        myTree.add(3);
        myTree.add(5);
        myTree.add(7);


        for(int i=0; i<k;i++){
            val = removeMinimum();
            multiplyWithMin(val);
        }
        return val;

    }
	private int removeMinimum(){
        int val = myTree.pollFirst();

        return val;
    }
    

    private void multiplyWithMin(int val){
        
        myTree.add(3 * val);
        myTree.add(5 * val);
        myTree.add(7 * val);
    }
	public static void main(String[] args) {
	    KthMultiple kth = new KthMultiple();	
        System.out.println(kth.findKth(5));
        System.out.println(kth.findKth(11));
        System.out.println(kth.findKth(12));
        System.out.println(kth.findKth(13));
	}

}
