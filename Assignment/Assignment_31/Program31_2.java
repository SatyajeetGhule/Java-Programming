import java.util.Scanner;

class Program31_2
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        
        int Marks = 0, Attendance = 0, FamilyIncome = 0;   
        boolean Result = false;

        System.out.println("Enter your Marks :");
        Marks = sobj.nextInt();

        System.out.println("Enter Your Attendance :");
        Attendance = sobj.nextInt();

        System.out.println("Enter Your Family Income :");
        FamilyIncome = sobj.nextInt();

        if((Marks < 0 || Marks > 100) || (Attendance < 0 || Attendance > 100))      // Filter
        {
            System.out.println("Marks and attendance must be 0-100");
            return;
        }

        if(FamilyIncome  < 0)           // Filter
        {
            System.out.println("Income Can not be Negative");
            return;
        }

        if(Marks >= 80)
        {
            Result = true;
        }
        else
        {
            System.out.println("Scholarship Rejected : Marks is Not equal to 80%");
            return;
        }

        if(Attendance >= 75)
        {
            Result = true;
        }
        else
        {
            System.out.println("Scholarship Rejected : Attendance is not equal to 75%");
            return;
        }

        if(FamilyIncome <= 300000)
        {
            Result = true;
        }
        else
        {
            System.out.println("Scholarship Rejected : Family Income more than 3 Lakhs");
            return;
        }

        if(Result == true)
        {
            System.out.println("Scholarship Approved");
        }


        sobj.close();
    }
}