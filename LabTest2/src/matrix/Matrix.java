package matrix;

public class Matrix {
	
	
	// printing Matrix
	public static void printMatrix(int M[][],int rowSize,int colSize)
	{
		for (int i = 0; i < rowSize; i++)
		{
			for (int j = 0; j < colSize; j++)
			{
				System.out.print(M[i][j] + " ");
			}
			System.out.println();
		}
	}

	// add the 2 matrix
	public static int[][] add(int A[][], int B[][],
					int size)
	{
		int C[][] = new int[size][size];

		for (int i = 0; i < size; i++)
		{
			for (int j = 0; j < size; j++)
			{
				C[i][j] = A[i][j] + B[i][j];
			}
		}

		return C;
	}
	
	// Main Method
		public static void main(String[] args)
		{
		
			int size = 3;
			
			//1st matrix
			int A[][] = { { 10, 20, 30}, 
						  { 40, 50, 60},
						  { 70, 80, 90} 
						};
			// Print the matrices A
			System.out.println("\nMatrix 1:");
			printMatrix(A, size, size);
			
			//2nd matrix
			int B[][] = { { 1, 2, 3}, 
	                      { 4, 5, 6},
						  { 7, 8, 9} 
	                     };
			
			// matrices B
			System.out.println("\nMatrix 2:");
			printMatrix(B, size, size);

			// Add the two matrix
			int C[][] = add(A, B, size);

			// result
			System.out.println("\nResultant Matrix:");
			printMatrix(C, size, size);
		
		}
	
	
}
