import java.util.Scanner;

class Program30_4
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        
        int Unit = 0;
        int Amount = 0;

        System.out.println("Enter the unit");
        Unit = sobj.nextInt();

        if(Unit < 0)
        {
            System.out.println("Unit Can not be Negative");
            return;
        }
        
        if(Unit <= 100)
        {
            Amount = Unit * 5;
        }
        else if(Unit <= 200)
        {
            Amount = 500 + (Unit -100) * 7;
        }
        else
        {
            Amount = 500 + 700 + ((Unit - 200) * 10);
        }

        System.out.println("Total Units Consumed : "+Unit);
        System.out.println("Toatal Electricity Amount : "+Amount);
        sobj.close();
    }
}