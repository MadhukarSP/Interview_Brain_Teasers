class ReplaceSpaces {
	public static void main(String[] arg) {
		String str = "ab cd"; // efghij klm opqrs tuvwx
		int l = str.length();
		
		for(int i=0; i<l;) {
			if(str.charAt(i) == 32) {
				str = str.substring(0,i) + "%20" + str.substring(i+1, str.length());
				l = l+2;
				i = i+2;
			} else {
				i++;
			}
		}
		
		System.out.println(str);
	}
}