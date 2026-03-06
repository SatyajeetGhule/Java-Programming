package Assignment_34;
import java.util.Scanner;

public class Program34_4 
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Call Duration in minutes : ");
        int minutes = sobj.nextInt();

        if(minutes < 0)
        {
            System.out.println("Invalid Input");
            sobj.close();
            return;
        }

        int charges = 0;

        if(minutes > 15)
        {
            charges = charges + (minutes - 15) * 2;
            minutes = 15;
        }

        if(minutes > 5)
        {
            charges = charges + (minutes - 5) * 1;
        }

        System.out.println("Call Duration : "+minutes+" minutes");
        System.out.println("Total Calls Charges : "+charges);

        sobj.close();

    }   
}
