package Assignment_36;
import java.util.Scanner;

public class Program36_3 
{
    public static boolean checkPath(int arr[][], int i, int j, int R, int C)
    {
        // Out of boundary
        if(i >= R || j >= C)
        {
            return false;
        }

        // Obstacle
        if(arr[i][j] == -1)
        {
            return false;
        }

        // Destination reached
        if(i == R-1 && j == C-1)
        {
            return true;
        }

        // Move Right
        if(checkPath(arr, i, j+1, R, C))
        {
            return true;
        }

        // Move Down
        if(checkPath(arr, i+1, j, R, C))
        {
            return true;
        }

        return false;
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int R = sobj.nextInt();
        int C = sobj.nextInt();

        if(R <= 0 || C <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        int arr[][] = new int[R][C];

        for(int i = 0; i < R; i++)
        {
            for(int j = 0; j < C; j++)
            {
                arr[i][j] = sobj.nextInt();

                if(arr[i][j] != 0 && arr[i][j] != -1)
                {
                    System.out.println("Invalid Input");
                    return;
                }
            }
        }

        boolean result = checkPath(arr,0,0,R,C);

        if(result)
        {
            System.out.println("Path Available");
        }
        else
        {
            System.out.println("No Path Found");
        }

        sobj.close();
    }
}
