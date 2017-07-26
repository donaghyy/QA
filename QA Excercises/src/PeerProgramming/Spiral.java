package PeerProgramming;

import java.util.Scanner;

public class Spiral {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting number : ");
        int n = sc.nextInt();

        int A[][] = new int[n][n];
        int k = 1;
        
        int c1 = 0;	
        int c2 = n-1;
        int r1 = 0;
        int r2 = n-1;

        while(k <= n*n)	// while its not itself squared
            {
                for(int i = c1; i <= c2; i++)	// First row
                {
                    A[r1][i] = k++;
                }

                for(int j = r1 + 1; j <= r2; j++) // Final column
                {
                    A[j][c2] = k++;
                }

                for(int i = c2-1; i >= c1; i--)	// Final row (reversed)
                {
                    A[r2][i] = k++;
                }

                for(int j = r2 - 1; j >= r1 + 1; j--) 	// First column (reversed)
                {
                    A[j][c1] = k++;
                }

             c1++;
             c2--;
             r1++;
             r2--;
             
            }

        /* Printing the Circular matrix */
        System.out.println("The Circular Matrix is:");
        for(int i=0; i<n; i++)
            {
                for(int j=0;j<n;j++)
                    {
                        System.out.print(A[i][j]+ "\t");
                    }
                
             System.out.println("\n");
            }
	}

}
