package Assignment_35;

import java.util.Scanner;

public class Program35_2 
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        int R, C;

        System.out.println("Enter Rows:");
        R = sobj.nextInt();

        System.out.println("Enter Columns:");
        C = sobj.nextInt();

        if(R <= 0 || C <= 0)
        {
            System.out.println("Invalid Input");
            sobj.close();
            return;
        }

        int arr[][] = new int[R][C];

        System.out.println("Enter Seat Matrix (0 or 1):");

        for(int i = 0; i < R; i++)
        {
            for(int j = 0; j < C; j++)
            {
                arr[i][j] = sobj.nextInt();

                if(arr[i][j] != 0 && arr[i][j] != 1)
                {
                    System.out.println("Invalid Input");
                    sobj.close();
                    return;
                }
            }
        }

        int totalBooked = 0;
        int maxBookings = 0;
        int maxRow = 0;
        boolean fullRow = false;

        for(int i = 0; i < R; i++)
        {
            int rowCount = 0;

            for(int j = 0; j < C; j++)
            {
                if(arr[i][j] == 1)
                {
                    totalBooked++;
                    rowCount++;
                }
            }

            if(rowCount > maxBookings)
            {
                maxBookings = rowCount;
                maxRow = i + 1;
            }

            if(rowCount == C)
            {
                fullRow = true;
            }
        }

        System.out.println("Total Booked Seats: " + totalBooked);
        System.out.println("Row With Maximum Bookings: Row " + maxRow);

        if(fullRow)
        {
            System.out.println("Full Row Exists: Yes");
        }
        else
        {
            System.out.println("Full Row Exists: No");
        }

        sobj.close();
    }
}
