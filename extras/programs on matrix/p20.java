// Addition of two matrix in java

import java.util.Scanner;
public class p20{
	public static void main(String[] args) {
		int m,n,c, d;
		Scanner sc = new Scanner(System.in);

		 System.out.println("Enter the number of rows and columns of matrix");

		m = sc.nextInt();
		n = sc.nextInt();

		int first[][] = new int[m][n];
		int second[][] = new int[m][n];
		int sum[][] = new int[m][n];

	System.out.println("Enter the elements of first matrix");
 
      for (  c = 0 ; c < m ; c++ )
         for ( d = 0 ; d < n ; d++ )
            first[c][d] = sc.nextInt();
 
      System.out.println("Enter the elements of second matrix");
 
      for ( c = 0 ; c < m ; c++ )
         for ( d = 0 ; d < n ; d++ )
            second[c][d] = sc.nextInt();
 

      for ( c = 0 ; c < m ; c++ )
         for ( d = 0 ; d < n ; d++ )
             sum[c][d] = first[c][d] + second[c][d];  //replace '+' with '-' to subtract matrices
 
 
      System.out.println("Sum of entered matrices:-");
 
 

      for ( c = 0 ; c < m ; c++ )
      {
         for ( d = 0 ; d < n ; d++ )
            System.out.print(sum[c][d]+"\t");
 
         System.out.println();
      }
	}
}