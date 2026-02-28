package Assignment_32;

import java.util.Scanner;

public class Program32_3
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        
        int CurrentStock = 0;
        int RemainingStock = 0;
        int Quantity = 0;

        System.out.println("Enter the Current Stock");
        CurrentStock = sobj.nextInt();

        System.out.println("Enter Requested Quantity");
        Quantity = sobj.nextInt();

        if(CurrentStock < 0 || Quantity <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }
        
        if(Quantity > CurrentStock)
        {
            System.out.println("Order Failed: Insufficient Stock.");
            return;
        }

        RemainingStock = CurrentStock - Quantity;

        System.out.println("Order Processed Successfully.");
            
        System.out.println("Remaining Stock : "+RemainingStock);
        

        if(RemainingStock < 5)
        {
            System.out.println("Low Stock Alert!");
        }

        sobj.close();

    }
}