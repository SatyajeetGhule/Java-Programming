package Assignment_33;
import java.util.Scanner;

public class Program33_3 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Call Minutes: ");
        int mins = sc.nextInt();

        System.out.print("Enter Data Usage (GB): ");
        int gb = sc.nextInt();

        System.out.print("Enter SMS Count: ");
        int sms = sc.nextInt();

        if(mins < 0 || gb < 0 || sms < 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        int costA = calculateCost(mins, gb, sms, 100, 1, 100, 199);
        int costB = calculateCost(mins, gb, sms, 300, 2, 300, 399);
        int costC = calculateCost(mins, gb, sms, 600, 4, 500, 599);
        int costD = calculateCost(mins, gb, sms, 1000, 10, 1000, 999);

        int minCost = costA;
        String plan = "Plan A";

        if(costB < minCost)
        {
            minCost = costB; plan = "Plan B"; 
        }
        
        if(costC < minCost)
        { 
            minCost = costC;
            plan = "Plan C"; 
        }
        
        if(costD < minCost)
        { 
            minCost = costD;
            plan = "Plan D";
        }

        System.out.println("\nRecommended Plan : " + plan);
        System.out.println("Total Cost : ₹" + minCost);

        sc.close();
    }

    static int calculateCost(int mins, int gb, int sms,
                             int planMin, int planGB, int planSMS, int baseCost)
    {
        int extra = 0;

        if(mins > planMin)
            extra += (mins - planMin) * 2;

        if(gb > planGB)
            extra += (gb - planGB) * 10;

        if(sms > planSMS)
            extra += (sms - planSMS) * 5;

        return baseCost + extra;
    }
}
        