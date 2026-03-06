package Assignment_33;
import java.util.Scanner;

class Program33_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter Distance : ");
        int distance = sobj.nextInt();

        System.out.print("Enter Class (Sleeper/3AC/2AC) : ");
        String classType = sobj.next();

        System.out.print("Enter Booking Hours Before : ");
        int bookingHours = sobj.nextInt();

        System.out.print("Enter Age : ");
        int age = sobj.nextInt();
        
        
        if(distance < 0 || bookingHours < 0 || age < 0)
        {
            System.out.println("Invalid Input");
            sobj.close();
            return;
        }
        

        double baseFare;
        if(distance <= 100)
            baseFare = 100;
        else if(distance <= 500)
            baseFare = 300;
        else
            baseFare = 500;

        double classCharge;
        if(classType.equalsIgnoreCase("Sleeper"))
            classCharge = 0;
        else if(classType.equalsIgnoreCase("3AC"))
            classCharge = 500;
        else if(classType.equalsIgnoreCase("2AC"))
            classCharge = 1000;
        else
        {
            System.out.println("Invalid Class Type");
            sobj.close();
            return;
        }

        double fare = baseFare + classCharge;

        double tatkalCharge = 0;
        if(bookingHours < 24)
        {
            tatkalCharge = fare * 0.30;
            fare += tatkalCharge;
        }

        double seniorDiscount = 0;
        if(age >= 65)
        {
            seniorDiscount = fare * 0.40;
            fare -= seniorDiscount;
        }

        System.out.println("\n----- Fare Breakdown -----");
        System.out.println("Base Fare        : ₹" + baseFare);
        System.out.println("Class Charge     : ₹" + classCharge);
        System.out.println("Tatkal Charge    : ₹" + tatkalCharge);
        System.out.println("Senior Discount  : -₹" + seniorDiscount);
        System.out.println("--------------------------");
        System.out.println("Final Fare       : ₹" + fare);

        sobj.close();
    }
}