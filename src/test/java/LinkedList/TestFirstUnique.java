package LinkedList;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TestFirstUnique {

	@Test
	public void testFirstUnique() {
		int arr[] = new int[] {2,3,5};
		FirstUnique firstUnique = new FirstUnique(arr);
		Assert.assertEquals(2,firstUnique.showFirstUnique()); // return 2 
		 firstUnique.add(5); // the queue is now [2,3,5,5] 
		 Assert.assertEquals(2,firstUnique.showFirstUnique()); // return 2
		 firstUnique.add(2); // the queue is now [2,3,5,5,2]
		 Assert.assertEquals(3,firstUnique.showFirstUnique());// return 3 
		 firstUnique.add(3); // the queue is now [2,3,5,5,2,3] 
		 Assert.assertEquals(-1,firstUnique.showFirstUnique());// return -1
	}

	@Test
	public void testShowFirstUnique() {
		int arr[] = new int[] {7,7,7,7,7,7};
		FirstUnique firstUnique = new FirstUnique(arr);
		Assert.assertEquals(-1,firstUnique.showFirstUnique()); // return -1 
		firstUnique.add(7); // the queue is now [7,7,7,7,7,7,7] 
		firstUnique.add(3); // the queue is now [7,7,7,7,7,7,7,3] 
		firstUnique.add(3); // the queue is now [7,7,7,7,7,7,7,3,3]
		firstUnique.add(7); // the queue is now [7,7,7,7,7,7,7,3,3,7]
		firstUnique.add(17); // the queue is now [7,7,7,7,7,7,7,3,3,7,17]
		Assert.assertEquals(17,firstUnique.showFirstUnique()); // return 17
	}

	@Test
	public void testAdd() {
		int arr[] = new int[] {809};
		FirstUnique firstUnique = new FirstUnique(arr);
		Assert.assertEquals(809,firstUnique.showFirstUnique());// return 809 
		firstUnique.add(809); // the queue is now [809,809] 
		Assert.assertEquals(-1,firstUnique.showFirstUnique()); // return -1 
	}

}
