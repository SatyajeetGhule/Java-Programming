import java.util.Scanner;

class Program30_2
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Please enter your Current Balance");
        int Current_Balance = sobj.nextInt();

        System.out.println("Please enter amout that you want to withdraw");
        int Withdraw_Amount = sobj.nextInt();

        if(Current_Balance < 0 || Withdraw_Amount <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        if(Withdraw_Amount % 100 != 0)
        {
            System.out.println("Transaction Failed : Withdraw amount must be a multiple of 100");
        }

        else if(Withdraw_Amount > 25000)
        {
            System.out.println("Transaction Failed : Maximum Sithdrawal per transaction is 25000");
        }

        else if(Current_Balance - Withdraw_Amount < 1000)
        {
            System.out.println("Transaction Failed : After withdrawal balance must remain at least 1000");
        }

        else
        {
            System.out.println("Transaction Successful.");
            System.out.println("Remaining Balance : "+(Current_Balance - Withdraw_Amount));
        }

        sobj.close();
    }
}