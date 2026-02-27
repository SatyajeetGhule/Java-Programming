import java.util.Scanner;

class Program31_1
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        
        int Distance = 0;
        String PeakHour = null;
        float fare = 0.0f;

        System.out.println("Enter the Distance :");
        Distance = sobj.nextInt();

        System.out.println("Peak Hour (Yes/No) :");
        PeakHour = sobj.next();

        if
        (
            Distance < 0 || 
            !(PeakHour.equalsIgnoreCase("Yes") ||
            PeakHour.equalsIgnoreCase("No"))
        )
        {
            System.out.println("Invalid Input");
            return;
        }

        fare = 50;
        
        if(Distance <= 10)                                          //First 10KM -> 12
        {
            fare = fare + (Distance * 12);
        }
        else                                                        //Beyond 10KM -> 15  
        {
            fare = fare +(10 * 12) + (Distance - 10) * 15;
        }

        if(PeakHour.equalsIgnoreCase("yes"))         // Peak Hour -> 20%
        {
            fare = fare + (fare * 0.2f);
        }
        
        System.out.println("Total Distance : "+Distance);
        System.out.println("Peak Hour : "+PeakHour);
        System.out.println("Total Fare Amount : "+fare);

        sobj.close();
    }
}
