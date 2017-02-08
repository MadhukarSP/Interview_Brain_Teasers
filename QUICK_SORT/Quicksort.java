class Quicksort {
	
	public static void main(String[] arg) {
		int[] arr = {38, 27, 43, 3, 9, 82, 10, 22, 34, 47, 2, 6, 11, 27, 26, 6};
		
		new Quicksort().sort(arr, 0, arr.length - 1);
		
		for(int i=0; i< arr.length; i++) {
			System.out.print(" " + arr[i]);
		}		
	}
	
	int partition(int[] arr, int l, int r) {
		
		int p = arr[l];
		int i = l+1;
		int j = r;
		
		while(i<=j) {
			while(i<=r && p > arr[i]){
				i++;
			}
			while(j>=l && p < arr[j]){
				j--;
			}
			
			if(i < j) {
				swap(arr, i, j);
				i++;
				j--;
			}
		}
		
		swap(arr, l, j);
		return j;		
	}
	
	void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
	
	void sort(int[] arr, int l, int r) {
		
		if(l < r){
			int p = partition(arr, l, r);
			
			sort(arr, l, p-1);
			sort(arr, p+1, r);
		}
	}
}