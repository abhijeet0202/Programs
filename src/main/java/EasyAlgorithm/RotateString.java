package EasyAlgorithm;

public class RotateString {
	
	public String rotate(String s, int left, int right) {
		if (s.length() < 1)return s;
		boolean isRight =true;
		int totalShift = 0;
		if (left < right) {
			totalShift = right-left;
//			if (s.length() <= totalShift) {
//				totalShift = s.length() -totalShift;
//			}
		}else {
			totalShift = left-right;
			isRight =false;
			
		}
		while(s.length() < totalShift) {
			//if (s.length() <= totalShift) {
				totalShift = s.length() -totalShift;
				totalShift = Math.abs(totalShift);
			//}
		}
		String str = new String();
		if(!isRight) {
			str=s.substring(totalShift);
			str+=s.substring(0,totalShift);
			
		}else {
			str=s.substring(s.length()-totalShift);
			str+=s.substring(0,s.length()-totalShift);
		}
		return str;
	}

	public static void main(String[] args) {
		RotateString obj = new RotateString();
		System.out.println(obj.rotate("abcd", 12, 1)); //bcda
		System.out.println(obj.rotate("abcd", 1, 10)); //dabc
		System.out.println(obj.rotate("a", 0, 1));

	}

}
