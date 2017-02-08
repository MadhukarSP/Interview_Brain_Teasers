class MatrixRotate {
	public static void main(String[] arg) {
		int n = 1;
		if(arg.length > 0)
			n = Integer.parseInt(arg[0]);
		
		int[][] matrix = new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n;j++) {
				matrix[i][j] = i+1;
			}
		}
		
		System.out.println("Before Sort");
		for(int i=0; i<n; i++) {
			for(int j=0; j<n;j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		rotate(matrix, n);
		System.out.println("After Sort");
		for(int i=0; i<n; i++) {
			for(int j=0; j<n;j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}			
	}
	
	public static void rotate(int[][] m, int n) {
		for(int layer=0; layer < n/2; layer++) {
			int f = layer;
			int l = n - 1 - layer;
			
			for(int i=f; i<l; i++) {
				int tmp = m[f][i];
				m[f][i] = m[l-i+f][f];
				m[l-i+f][f] = m[l][l-i+f];
				m[l][l-i+f] = m[i][l];
				m[i][l] = tmp;
			}
		}
	}
}