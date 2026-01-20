// to print the matrix and its transpose
import java.util.Scanner;

public class matrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of rows ");
		int m=sc.nextInt();
		System.out.println("enter no of columns");
		int n=sc.nextInt();
		
		int input[][]=new int [m][n];	
		System.out.println("enter matrix");
		for(int row=0; row<m; row++)
		{
			for(int col=0; col<n; col++)
			{
				input[row][col]=sc.nextInt();
				
						
			}
		}
		System.out.println("You enterd matrix");
		for(int row=0; row<m; row++)
		{
			for(int col=0; col<n; col++)
			{
				System.out.print(input[row][col]+"\t");
			}
			System.out.println("");
		}
		System.out.println("matrix in transpose");
		for(int row=0; row<m; row++)
		{
			for(int col=0; col<n; col++)
			{
				System.out.print(input[col][row]+"\t");
				
						
			}
			System.out.println();
		}

	}

}


