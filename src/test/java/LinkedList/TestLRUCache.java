package LinkedList;

import org.junit.Test;

public class TestLRUCache {

//	@Test
//	public void testLRUCache() {
//		LRUCache cache = new LRUCache(3);
//		cache.put(1, 1);
//		cache.put(2, 2);
//		cache.put(3, 3);
//		cache.put(1, 4);
//		cache.put(3, 5);
//	}

	@Test
	public void testGet() {
		LRUCache cache = new LRUCache(2);
		cache.put(1, 1);
		cache.put(2, 2);
		cache.get(1);
		cache.put(3, 3);
		cache.get(2);
		cache.put(4, 4);
		cache.get(1);
		cache.get(3);
		cache.get(4);
	}

	@Test
	public void testPut() {
		LRUCache cache = new LRUCache(1);
		cache.put(2, 1);
		cache.get(2);
	}

}
