import java.util.Scanner;

class Program31_5
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        int Battery = 0;
        String Status = "Normal";

        System.out.println("Enter the Battery Percentage");
        Battery = sobj.nextInt();

        if(Battery < 0 || Battery > 100)
        {
            System.out.println("Invalid Input");
            return;
        }

        if(Battery <= 5)
        {
            Status = "Critical";
        }
        else if(Battery <= 15)
        {
            Status = "Low";
        }

        System.out.println("Battery Percentage : "+Battery+"%");
        System.out.println("Status : "+Status);

        sobj.close();
    }
}