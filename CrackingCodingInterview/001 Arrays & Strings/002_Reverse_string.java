class ReverseString {
	public static void main(String[] arg) {
		char[] str = "abcdefghijklmopqrstuvwxyz\0".toCharArray();
		char[] str2 = new char[str.length];
		
		for(int i=0, j=str.length-2; i <= j; i++, j--) {
			str2[i] = str[j];
			str2[j] = str[i];
		}
		str2[str2.length-1] = '\0';
		
		System.out.println(str2);
	}
}