package gaylemcdowell.ArrayAndStrings;

/*
There are three types of edits that can be performed on strings: insert a character,
remove a character, or replace a character. Given two strings, write a function to check if they are
one edit (or zero edits) away.
EXAMPLE
pale, pIe -> true
pales. pale -> true
pale. bale -> true
pale. bake -> false
*/
public class OneWay{
	
	public static boolean singleEdit(String str1, String str2){
		if (str1.length()== str2.length()){
			return singleUpdate(str1,str2);
		}else if (str1.length() < str2.length()){
			return SingleAdd(str1,str2);
		}else{
			return SingleAdd(str2,str1);
		}
	}
	
	private static boolean singleUpdate(String str1, String str2){
		boolean notMatching=false;
		for (int i=0; i<str1.length();i++)
		{
			if (str1.charAt(i) != str2.charAt(i)){
				if(notMatching)return false;
				
				notMatching=true;
			}
		}
		return true;
	}
	
	private static boolean SingleAdd(String str1, String str2){
		boolean notMatching=false;
		int index1=0,index2=0;
		while(str1.length() > index1)
		{
			if (str1.charAt(index1) != str2.charAt(index2)){
				if(notMatching){
					return false;
				}
				notMatching=true;
				index2++;
			}else{
				index1++;
				index2++;
			}
		}
		return true;
	}
	public static void main(String[] args){
		System.out.println(OneWay.singleEdit("pale","ple"));
		System.out.println(OneWay.singleEdit("pales","pale"));
		System.out.println(OneWay.singleEdit("pale","bale"));
		System.out.println(OneWay.singleEdit("pale","bake"));
		System.out.println(OneWay.singleEdit("pa","pule"));
	}

}