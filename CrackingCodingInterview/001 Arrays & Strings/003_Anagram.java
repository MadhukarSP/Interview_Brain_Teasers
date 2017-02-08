class ReverseString {
	public static void main(String[] arg) {
		String str = "abcdefghijklmopqrstuvwxyz";
		String str2 = "ayxwvutsrqpomlkjihgfedcba";
		int i=0;
		
		if(str.length() == str2.length() && str.length() > 0) {			
			for(int j=str.length()-1; i < str.length(); i++, j--) {
				if(str.charAt(i) != str2.charAt(j)) break;
			}
		}
		
		if(str.length() == i) {
			System.out.println("Those are anagrams");
		} else {
			System.out.println("Those are not anagrams");
		}
		
	}
}