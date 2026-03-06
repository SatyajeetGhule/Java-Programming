package Assignment_34;
import java.util.Scanner;

public class Program34_1 
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter Number of Days Stayed : ");
        int days = sobj.nextInt();

        if(days < 0)
        {
            System.out.println("Invalid Input");
            sobj.close();
            return;
        }

        int perDayCharge = 3000;
        double totalBill = days * perDayCharge;

        if(days > 7)
        {
            double discount = totalBill * 0.05;
            totalBill -= discount;
        }

        System.out.println("Total Stay Duration : " + days + " days");
        System.out.println("Final Bill Amount   : ₹" + totalBill);

        sobj.close();
    }
}

