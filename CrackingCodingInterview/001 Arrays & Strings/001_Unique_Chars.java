class UniqueChars {
	
	public static void main(String[] arg) {
		boolean[] arr = new boolean[256];
		String str;
		if(arg.length > 0) {
			str = arg[0];
		} else {
			str = "abc";
		}
		
		
		for(int i=0; i<str.length(); i++) {
			int c = str.charAt(i);
			if(arr[c] == true) {
				System.out.println("Its has duplicate chars");
				return;
			}				
			arr[c] = true;
		}
		System.out.println(str + " has Unique chars");
	}
}
