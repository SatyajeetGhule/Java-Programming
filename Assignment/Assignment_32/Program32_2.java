package Assignment_32;

import java.util.Scanner;

public class Program32_2
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        
        int Age = 0, MonthlyIncome = 0, CreditScore = 0;
        String loan = null;
        boolean Reason = false;

        System.out.println("Enter your Age :");
        Age = sobj.nextInt();

        System.out.println("Enter Monthly Income :");
        MonthlyIncome = sobj.nextInt();

        System.out.println("Enter Your Credit Score :");
        CreditScore = sobj.nextInt();

        System.out.println("You have any an existing unpaid LOAN");
        loan = sobj.next();

        if(Age < 0 || MonthlyIncome < 0 || CreditScore < 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        if((loan.equalsIgnoreCase("Yes") == false) &&
            (loan.equalsIgnoreCase("No") == false))
        {
            System.out.println("Invalid Input");
            return;
        }

        if(Age >= 21 && Age <= 60)
        {
            Reason = true;
        }
        else
        {
            System.out.println("Loan Rejected : Your Age is Not Eligible !");
            return;
        }

        if(MonthlyIncome >= 25000)
        {
            Reason = true;
        }
        else
        {
            System.out.println("Loan Rejected : Your Monthly Income less than 25000");
            return;
        }

        if(CreditScore >= 700)
        {
            Reason = true;
        }
        else
        {
            System.out.println("Loan Rejected : Your Creadit Score less than 700");
            return;
        }

        if(loan.equalsIgnoreCase("No"))
        {
            Reason = true;
        }
        else
        {
            System.out.println("Loan Rejected : Must NOT have an existing unpaid loan");
            return;
        }

        if(Reason == true)
        {
            System.out.println("Loan Approved");
        }

        sobj.close();

    }
}