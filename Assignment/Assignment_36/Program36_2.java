package Assignment_36;

import java.util.Scanner;

public class Program36_2 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int N = sobj.nextInt();
        System.out.println("-------------------------------------");

        if(N <= 0)
        {
            System.out.println("Invalid Input");
            sobj.close();
            return;
        }

        int arr[][] = new int[N][N];

        for(int i = 0; i < N; i++)
        {
            for(int j = 0; j < N; j++)
            {
                arr[i][j] = sobj.nextInt();
            }
            System.out.println("-------------------------------------");
        }

        int targetSum = 0;

        // First row sum
        for(int j = 0; j < N; j++)
        {
            targetSum += arr[0][j];
        }

        boolean isMagic = true;

        // Check rows
        for(int i = 0; i < N; i++)
        {
            int rowSum = 0;

            for(int j = 0; j < N; j++)
            {
                rowSum += arr[i][j];
            }

            if(rowSum != targetSum)
            {
                isMagic = false;
                break;
            }
        }

        // Check columns
        for(int j = 0; j < N && isMagic; j++)
        {
            int colSum = 0;

            for(int i = 0; i < N; i++)
            {
                colSum += arr[i][j];
            }

            if(colSum != targetSum)
            {
                isMagic = false;
                break;
            }
        }

        // Check main diagonal
        int diag1 = 0;
        for(int i = 0; i < N; i++)
        {
            diag1 += arr[i][i];
        }

        if(diag1 != targetSum)
        {
            isMagic = false;
        }

        // Check second diagonal
        int diag2 = 0;
        for(int i = 0; i < N; i++)
        {
            diag2 += arr[i][N - i - 1];
        }

        if(diag2 != targetSum)
        {
            isMagic = false;
        }

        if(isMagic)
        {
            System.out.println("Matrix is a Magic Square");
        }
        else
        {
            System.out.println("Matrix is NOT a Magic Square");
        }

        sobj.close();
    }
}
