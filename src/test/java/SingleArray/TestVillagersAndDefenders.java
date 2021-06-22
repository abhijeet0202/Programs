package SingleArray;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestVillagersAndDefenders {


	@Test
	public void testFindVillageToAttack() {
		VillagersAndDefenders defenders = new VillagersAndDefenders();
		System.out.println(defenders.findVillageToAttack(new int[][] {{1,1,1,0},{1,1,1,0},{1,0,0,0},{1,1,0,0}}));
	}
	
	@Test
	public void testFindVillageToAttack1() {
		VillagersAndDefenders defenders = new VillagersAndDefenders();
		System.out.println(defenders.findVillageToAttack(new int[][] {{1,0,0,0},{1,1,1,0},{1,0,0,0},{1,1,0,0}}));
	}
	
	@Test
	public void testFindVillageToAttack2() {
		VillagersAndDefenders defenders = new VillagersAndDefenders();
		System.out.println(defenders.findVillageToAttack(new int[][] {{1,1,1,0},{1,1,1,0},{1,1,0,0},{1,0,0,0}}));
	}
	
	
	@Test
	public void testFindVillageToAttack3() {
		VillagersAndDefenders defenders = new VillagersAndDefenders();
		System.out.println(defenders.findVillageToAttack(new int[][] {{1,1,1,0},{1,1,1,0},{0,0,0,0},{1,0,0,0}}));
	}

}
