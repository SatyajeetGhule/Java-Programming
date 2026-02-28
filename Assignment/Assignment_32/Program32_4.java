package Assignment_32;

import java.util.Scanner;

public class Program32_4
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        
        int amount = 0;

        System.out.println("Enter the Helmet Worn (Yes/No)");
        String helmet = sobj.next();

        System.out.println("Enter the License (Yes/No)");
        String license = sobj.next();

        System.out.println("Enter the over speeding (Yes/No)");
        String overspeeding = sobj.next();

        if
        (
            ((helmet.equalsIgnoreCase("yes") == false) && (helmet.equalsIgnoreCase("No") == false)) ||
            ((license.equalsIgnoreCase("yes") == false) && license.equalsIgnoreCase("No") == false) ||
            ((overspeeding.equalsIgnoreCase("yes") == false) && overspeeding.equalsIgnoreCase("No") == false)
        )
        {
            System.out.println("Invalid Input");
            return;
        }

        if(helmet.equalsIgnoreCase("no"))
        {
            amount = amount + 500;
        }
        if(license.equalsIgnoreCase("no"))
        {
            amount = amount + 1000;
        }

        if(overspeeding.equalsIgnoreCase("yes"))
        {
            amount = amount + 1500;
        }
        
        System.out.println("Total Fine Amount : "+amount);
        

        sobj.close();

    }
}