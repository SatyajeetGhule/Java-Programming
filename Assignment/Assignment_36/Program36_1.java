package Assignment_36;

import java.util.Scanner;

public class Program36_1 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int N = sobj.nextInt();
        System.out.println("--------------------------------");
        
        if(N <= 0)
        {
            System.out.println("Invalid Input");
            sobj.close();
            return;
        }

        int arr[][] = new int[N][7];

        for(int i = 0; i < N; i++)
        {
            for(int j = 0; j < 7; j++)
            {
                arr[i][j] = sobj.nextInt();

                if(arr[i][j] < 0)
                {
                    System.out.println("Invalid Input");
                    sobj.close();
                    return;
                }
            }
            System.out.println("--------------------------------");
        }

        int cityTotal[] = new int[N];
        int highest = 0;
        int highestCity = 0;

        // Weekly total for each city
        for(int i = 0; i < N; i++)
        {
            int sum = 0;

            for(int j = 0; j < 7; j++)
            {
                sum += arr[i][j];
            }

            cityTotal[i] = sum;

            if(sum > highest)
            {
                highest = sum;
                highestCity = i + 1;
            }
        }

        // Day with maximum consumption
        int maxDay = 0;
        int peakDay = 0;

        for(int j = 0; j < 7; j++)
        {
            int daySum = 0;

            for(int i = 0; i < N; i++)
            {
                daySum += arr[i][j];
            }

            if(daySum > maxDay)
            {
                maxDay = daySum;
                peakDay = j + 1;
            }
        }

        System.out.println("Weekly Consumption:");
        for(int i = 0; i < N; i++)
        {
            System.out.println("City " + (i+1) + ": " + cityTotal[i]);
        }

        System.out.println("Highest Consumption: City " + highestCity);
        System.out.println("Peak Consumption Day: Day " + peakDay);

        System.out.println("Cities consuming more than 500 units:");
        for(int i = 0; i < N; i++)
        {
            if(cityTotal[i] > 500)
            {
                System.out.println("City " + (i+1));
            }
        }

        sobj.close();
    }
}
