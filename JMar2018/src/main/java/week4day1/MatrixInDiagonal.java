package week4day1;

import java.util.Scanner;

public class MatrixInDiagonal {

	public static void main(String[] args) {
		int matrix[][];
		int row, column,row1 = 0,column1 = 0,sum = 0,sum1=0,p=0,u=0;
		Scanner scan=new Scanner(System.in);

		System.out.println("\nEnter number of rows :");
		row = Integer.parseInt(scan.nextLine());

		System.out.println("Enter number of columns :");
		column = Integer.parseInt(scan.nextLine());
		row1=row;
		column1=column;
		
		matrix = new int[row][column];
		System.out.println("Enter the data :");

		for(int i=0; i<row; i++) {

			for(int j=0; j<column; j++) {

				matrix[i][j] = scan.nextInt();
			}
		}
		
		
		System.out.println("\nThe Matrix is :");

		for(int i=0; i<row; i++) {

			for(int j=0; j<column; j++) {

				System.out.print("\t" + matrix[i][j]);
			}
			System.out.println();
		}
	
		
		for(int k=0;k<row-1;k++) {
			for(int l=column-2;l>=0;l--)
			{
				sum=sum+matrix[k][l];
				//System.out.println(matrix[k][l]);
				
			}
			column--;
		}
		System.out.println(sum);
		
		
		for(int m=row1-1;m>=0;m--) {
			for(int n=column1-1;n>p;n--)
			{
				sum1=sum1+matrix[m][n];
				//System.out.println(matrix[m][n]);
				
			}
			p=p+1;
		}
		System.out.println(sum1);
		
		
		if(sum>sum1)
		{
			for(int q=0;q<row-1;q++) {
				for(int r=column-2;r>=0;r--)
				{
					//sum=sum+matrix[k][l];
					System.out.print(matrix[q][r]+" ");
					
				}
				column--;
			}
		}
			
				for(int s=row1-1;s>=0;s--) {
					for(int t=column1-1;t>u;t--)
					{
						//sum1=sum1+matrix[m][n];
						System.out.print(matrix[s][t]+" ");
						
					}
					u=u+1;
				}
			}
		
		
		
		}
		


