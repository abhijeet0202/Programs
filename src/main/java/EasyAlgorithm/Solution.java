package EasyAlgorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class SpiralAttributes{
	int height;
	int length;
	String data;
	public SpiralAttributes(int height,int length,	String data) {
		this.height = height;
		this.length = length;
		this.data = data;
	}
}

public class Solution {
	static List<SpiralAttributes> spAttr =null;
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int testCases = 0;
		try {
			testCases = scan.nextInt();
			if (testCases > 1000 || testCases < 1) {
				scan.close();
				throw new NumberFormatException();
			}
			spAttr = new ArrayList<SpiralAttributes>();
		} catch (NumberFormatException ex) {
			System.out.println("Not a Valid Test Numbers" + ex);
		}

		for (int i = 0; i < testCases; i++) {
			int height = scan.nextInt();
			int length = scan.nextInt();
			String data = scan.next();
			SpiralAttributes sp = new SpiralAttributes(height,length,data);
			spAttr.add(sp);
			 
		}
		System.out.println(spAttr);
		for(SpiralAttributes sp: spAttr) {
//			display(sp);
		}
		scan.close();
	}

	static void display(SpiralAttributes spiral) { 
        // sp stands for space 
        // st stands for number 
        //int sp = n / 2, st = 1; 
		int sp = spiral.height, st = 1;
		String str = spiral.data;
  
        // Outer for loop for number of lines 
        for (int i = 1; i <=sp; i++) { 
  
            // Inner for loop for printing space 
            for (int j = 1; j <= sp; j++) 
                System.out.print(" "); 
  
            // Inner for loop for printing number 
            int count = st / 2 + 1; 
            for (int k = 1; k <=st; k++) { 
                System.out.print(str.charAt(count)); 
                if (k <= st / 2) 
                    count--; 
                else
                    count++; 
            } 
  
            // To goto next line 
            System.out.println(); 
            if (i <= sp / 2) { 
  
                // sp decreased by 1 
                // st increased by 2 
                sp = sp - 1; 
                st = st + 2; 
            } 
  
            else { 
  
                // sp increased by 1 
                // st decreased by 2 
                sp = sp + 1; 
                st = st - 2; 
            }
        }
	}
}
