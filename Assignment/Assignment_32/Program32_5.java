package Assignment_32;

import java.util.Scanner;

public class Program32_5
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        
        int AnnualIncome = 0;
        float TaxAmount = 0;
        
        System.out.println("Enter the Annual Income");
        AnnualIncome = sobj.nextInt();

        if(AnnualIncome < 0)
        {
            System.out.println("Invalid Input");
            return;
        }
        
        int OriginalIncome = AnnualIncome;

        if(AnnualIncome > 1000000)
        {
            TaxAmount += (AnnualIncome - 1000000) * 0.30f;
            AnnualIncome = 1000000; 
        }

        if(AnnualIncome > 500000)
        {
            TaxAmount += (AnnualIncome - 500000) * 0.20f;
            AnnualIncome = 500000; 
        }

        if(AnnualIncome > 250000)
        {
            TaxAmount += (AnnualIncome - 250000) * 0.05f;
        }

        System.out.println("Annual Income : ₹"+OriginalIncome);
        System.out.println("Total Tax Payble : ₹"+TaxAmount);

        sobj.close();

    }
}