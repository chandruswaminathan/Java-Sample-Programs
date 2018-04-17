package week4day1;


import java.util.Scanner;

public class MatrixInSpiral {
	Scanner scan;
	static int matrix[][];
	int row, column;

	void matrixbuilder() {

		scan = new Scanner(System.in);

		
		System.out.println("\nEnter number of rows :");
		row = Integer.parseInt(scan.nextLine());

		System.out.println("Enter number of columns :");
		column = Integer.parseInt(scan.nextLine());
		
		matrix = new int[row][column];
		System.out.println("Enter the data :");

		for(int i=0; i<row; i++) {

			for(int j=0; j<column; j++) {

				matrix[i][j] = scan.nextInt();
			}
		}
	}



	void printmatrix() {

		System.out.println("\nThe Matrix is :");

		for(int i=0; i<row; i++) {

			for(int j=0; j<column; j++) {

				System.out.print("\t" + matrix[i][j]);
			}
			System.out.println();
		}
	}
	void printMatrixInSpiral(int[][] matrix){

		int rowStart=0;
		int rowLength=matrix.length-1;

		int colStart=0;
		int colLength = matrix[0].length-1;

		while(rowStart <= rowLength && colStart <= colLength){

			for (int i = rowStart; i <= colLength; i++) {
				System.out.print(matrix[rowStart][i] + " ");
			}

			for (int j = rowStart+1; j <= rowLength; j++) {
				System.out.print(matrix[j][colLength] + " ");
			}

			if(rowStart+1 <= rowLength){
				for (int k = colLength-1; k >= colStart; k--) {
					System.out.print(matrix[rowLength][k] + " ");
				}
			}
			if(colStart+1 <= colLength){
				for (int k = rowLength-1; k > rowStart; k--) {
					System.out.print(matrix[k][colStart] + " ");
				}
			}

			rowStart++;
			rowLength--;
			colStart++;
			colLength--;
		}
	}


	public static void main(String args[]) {

		MatrixInSpiral obj = new MatrixInSpiral();

		obj.matrixbuilder();
		obj.printmatrix();
		obj.printMatrixInSpiral(matrix);
	}

}

