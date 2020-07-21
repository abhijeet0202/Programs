package gaylemcdowell.ArrayAndStrings;

public class StringCompression{
	
	public static String encrypt(String str){
		int count=0;
		StringBuilder sb = new StringBuilder();

		for(int i=0;i<str.length();i++){
			count++;
			if(i + 1 >= str.length() || str.charAt(i) != str.charAt(i+1)){
				sb.append(str.charAt(i)).append(count);
				count=0;
			}
		}
		return sb.length() >= str.length() ? str:sb.toString();
	}
	
	
	public static void main(String[] args){
		System.out.println(StringCompression.encrypt("Abhijeet"));
		System.out.println(StringCompression.encrypt("Abcd"));
		System.out.println(StringCompression.encrypt("aaBBccAAbbCC"));
	}

}