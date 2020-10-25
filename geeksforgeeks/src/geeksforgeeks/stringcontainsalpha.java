package geeksforgeeks;

public class stringcontainsalpha {
	public static boolean isStringAlpha(String str) {
		if(str==null || str.equals("")) {
			return false;
		}
		for(int i=0;i<str.length();i++) {
			char ch =str.charAt(i);
			if((!(ch>='A' && ch<='Z'))&&(!(ch>='a' && ch<='z'))) {
				return false;
			}
			
		}
		return true;
		
	}

	public static void main(String[] args) {
		
		String str="GeeksforGeeks";
		System.out.println("Input: " +str);
		System.out.println("Output: " +isStringAlpha(str));
		
		stringcontainsalpha str1=new stringcontainsalpha();
		
		System.out.println("Output: " +str1.isStringAlpha( "ritik"));
	}

}
