import java.util.Scanner;

class Program31_3
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        
        int ParcelWeight = 0;
        int Charges = 0;

        System.out.println("Enter the Parcel Weight :");
        ParcelWeight = sobj.nextInt();

        if(ParcelWeight <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        if(ParcelWeight <= 1)
        {
            Charges = 50;
        }
        else if(ParcelWeight <= 5)
        {
            Charges = 50 + (ParcelWeight -1) * 20;
        }
        else
        {
            Charges = 150 + (ParcelWeight - 5) * 30;
        }

        System.out.println("Parcel Weight : "+ParcelWeight);
        System.out.println("Couriel Charge : "+Charges);

        sobj.close();
    }
}