package HackerRank.DanskeBank;

import java.util.Arrays;
import java.util.Comparator;

//Question1: What is expected result?
class VLA2 implements Comparator<VLA2>{
	
	int dishSize;
	
	public static void Main1() {
		VLA2[] va = { new VLA2(40), new VLA2(200), new VLA2(60)	};
		Arrays.sort(va, va[0]);
		int index = Arrays.binarySearch(va, new VLA2(200), va[0]);
		System.out.println("index :"+ index);
		index = Arrays.binarySearch(va, new VLA2(80), va[0]);
		System.out.println("index :"+ index);
		
}

	VLA2(int size){
		dishSize = size;
	}

	@Override
	public int compare(VLA2 a, VLA2 b) {
		return b.dishSize - a.dishSize;
	}
	
}

//class MySort implements Comparator{
//
//	@Override
//	public int compare(String a, String b) {
//		// TODO Auto-generated method stub
//		return b.compareTo(a);
//	}
//}
	
public class Danske {	
	//Question 2
	public static void Output1(){
		try {
			Float f1 = new Float("3.0");
			int x = f1.intValue();
			byte b = f1.byteValue();
			double d = f1.doubleValue();
			System.out.println("x="+x+",b="+b+",d="+d+" Total="+x+b+d);
		}catch (NumberFormatException ex) {
			System.out.println("BAd Mumber");
		}
	}
	
	//Question 3
	public static void Compares() {
		String[] cities = {"Bangalore", "Pune", "San Fransisco","New york City"};
		//MySort ms = new MySort();
		//Arrays.sort(cities, ms);
		System.out.println(Arrays.binarySearch(cities, "New York City"));
	}
	
	
	public static void main(String[] args) {
		VLA2.Main1();
		
		Output1();

	}

}
