import java.util.Scanner;

class Program30_1
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        int TotalDays = 0;
        int Fine = 0;

        System.out.println("Enter the number of days");
        TotalDays = sobj.nextInt();

        if(TotalDays < 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        if(TotalDays <= 7)
        {
            System.out.println("No Fine Applicable");
            return;
        }

        else if(TotalDays >= 8 && TotalDays <= 12)
        {
            Fine = (TotalDays - 7) * 5; 
        }

        else if(TotalDays > 12)
        {
            Fine = (5 *5) + ((TotalDays - 12) * 10);
        }

        System.out.println("Total Days Fine to be paid : "+Fine);

        sobj.close();
    }
}
