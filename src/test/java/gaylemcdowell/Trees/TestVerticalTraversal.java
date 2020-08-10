package gaylemcdowell.Trees;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestVerticalTraversal {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testHashCode() {
		InOrdertoTree inOrder = new InOrdertoTree();
		int[] sortedArray = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
		TreeNode current = inOrder.solution(sortedArray);
		
		VerticalTraversal verticalTraversal = new VerticalTraversal();
		verticalTraversal.traverseVerticallyRecursively(current);
	}

}
