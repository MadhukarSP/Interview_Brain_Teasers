class HeapSort {
	
	void sort(int[] arr) {
		int n = arr.length;
		
		for(int i=n/2-1;i>=0;i--) {
			heapify(arr, n, i);
		}
		
		for(int i=n-1; i>=0; i--) {
			swap(arr, i, 0);
			heapify(arr, i, 0);
		}
	}
	
	void heapify(int[] arr, int n, int i) {
		int largest = i;
		int leftChild = 2*i + 1;
		int rightChild = 2*i + 2;
		
		if(leftChild < n && arr[leftChild] > arr[largest])
			largest = leftChild;
		
		if(rightChild < n && arr[rightChild] > arr[largest])
			largest = rightChild;
		
		if(largest != i) {
			swap(arr, largest, i);
			heapify(arr, n, largest);
		}		
	} 
	
	void swap(int[] arr, int index1, int index2) {
		int tmp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = tmp;
	}
	
	public static void main(String[] arg) {
		int[] arr = {12, 11, 13, 5, 6, 7, 21};
		
		HeapSort heap = new HeapSort();
		heap.sort(arr);
		
		printArray(arr);
	}
	
	static void printArray(int[] arr) {
		for(int element: arr) 
			System.out.println(element);
	}
}