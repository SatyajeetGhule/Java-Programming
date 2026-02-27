import java.util.Scanner;

class Program31_4
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        int BudgetAmount = 0;
        int RemainingBalance = 0;
        int NumberOfItems = 0;
        
        System.out.println("Enter the  Budget Amount ");
        BudgetAmount = sobj.nextInt();
        
        System.out.println("Enter the Number of Items");
        NumberOfItems = sobj.nextInt();
        
        if(BudgetAmount < 0 || NumberOfItems < 0 )
        {
            System.out.println("Invalid Input");
            return;
        }
        
        RemainingBalance = BudgetAmount;

        int iCount = 0;
        for (int i = 0; i < NumberOfItems; i++)
        {
            System.out.println((i + 1) + ". Item price : ");
            int price = sobj.nextInt();

            if (price <= 0)
            {
                System.out.println("Invalid Input");
                return;
            }

            if (price <= RemainingBalance)
            {
                RemainingBalance = RemainingBalance - price;
                iCount++;
            }
            else
            {
                System.out.println("Budget Amount is less than item price");
                break;
            }
        }
        System.out.println("-----------------------------------------------");

        System.out.println("Item Purchase Count :"+iCount);
        System.out.println("Remaining Balance : "+RemainingBalance);


        sobj.close();
    }
}