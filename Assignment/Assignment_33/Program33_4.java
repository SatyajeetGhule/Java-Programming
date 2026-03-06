package Assignment_33;
import java.util.Scanner;

class Program33_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter Water Units : ");
        int units = sobj.nextInt();

        System.out.print("Enter Weeks Late : ");
        int weeksLate = sobj.nextInt();

        if(units < 0 || weeksLate < 0)
        {
            System.out.println("Invalid Input");
            sobj.close();
            return;
        }

        double billAmount;

        // Progressive slabs
        if(units <= 100)
        {
            billAmount = units * 5;
        }
        else if(units <= 300)
        {
            billAmount = (100 * 5) + ((units - 100) * 8);
        }
        else
        {
            billAmount = (100 * 5) + (200 * 8) + ((units - 300) * 12);
        }

        // Fixed meter charge
        billAmount += 100;

        // Late payment penalty (2% per week, max 10%)
        double lateRate = weeksLate * 0.02;
        if(lateRate > 0.10)
        {
            lateRate = 0.10;
        }

        double penalty = billAmount * lateRate;
        billAmount += penalty;

        System.out.println("Final Water Bill Amount : ₹" + billAmount);

        sobj.close();
    }
}