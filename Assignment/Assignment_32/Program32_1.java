package Assignment_32;

import java.util.Scanner;

public class Program32_1
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        int Hour = 0;
        int Fees = 0;

        System.out.println("Enter the Total Parking Hours");
        Hour = sobj.nextInt();

        if(Hour < 0)
        {
            System.out.println("Invalid Inpute");
            return;
        }

        if(Hour <= 2)
        {
            Fees = 20;
        }
        else if(Hour >= 2)
        {
            Fees = 20 + (Hour - 2) * 10;
        }

        //  Condition for :- (Penalty) 
        if(Hour > 10)
        {
            Fees = Fees + 50; 
        }

        System.out.println("Total Parking Duration : "+Hour+" Hours");
        System.out.println("Total Parking Fees : "+Fees);

        sobj.close();

    }
}
