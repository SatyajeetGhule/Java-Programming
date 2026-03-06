package Assignment_33;

import java.util.Scanner;

public class Program33_1 
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        int Day = 0;
        float medicineBill = 0.0f, consultationFee = 0.0f;
        String wardType = null, insured = null; 

        float RoomCharges = 0.0f, TotalBill = 0.0f, FinalPay = 0.0f;
        float insuranceCover = 0;

        System.out.println("Enter the Days");
        Day = sobj.nextInt();

        System.out.println("Enter the Medicien Bill");
        medicineBill = sobj.nextFloat();

        System.out.println("Enter the Consultation Fees");
        consultationFee = sobj.nextFloat();

        System.out.println("Enter the ward Type : (Normal/ICU)");
        wardType = sobj.next();
        
        System.out.println("are you insured? (Yes/No)");
        insured = sobj.next();
        
        sobj.close();

        if(Day < 0 || medicineBill < 0 || consultationFee < 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        if
        (
            (((wardType.equalsIgnoreCase("Normal") == false)) && (wardType.equalsIgnoreCase("ICU") == false)) ||
            ((insured.equalsIgnoreCase("Yes") == false) && (insured.equalsIgnoreCase("No") == false)) 
        )
        {
            System.out.println("Invalid Input");
            return;
        }

        // Room Charges for Normal
        if(wardType.equalsIgnoreCase("Normal"))
        {
            RoomCharges = 2000;
        }
        else    // Room Charges for ICU
        {
            RoomCharges = 5000;
        }

        TotalBill = (Day * RoomCharges) + medicineBill + consultationFee;

        if(insured.equalsIgnoreCase("Yes"))
        {
            float sevenPercent = TotalBill * 0.7f;
            insuranceCover = Math.min(50000, sevenPercent);
        }

        FinalPay = TotalBill - insuranceCover;

        System.out.println("Total Bill : "+TotalBill);
        System.out.println("Insurance Cover : "+insuranceCover);
        System.out.println("Final Payble Amount : "+FinalPay);

    }   
}
