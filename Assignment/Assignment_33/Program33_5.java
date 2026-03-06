package Assignment_33;
import java.util.*;

public class Program33_5 
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter Rows : ");
        int rows = sobj.nextInt();

        System.out.print("Enter Columns : ");
        int cols = sobj.nextInt();

        sobj.nextLine(); // buffer clear

        System.out.print("Enter Already Booked Seats (comma separated, ex: 1-2,2-3) : ");
        String bookedInput = sobj.nextLine();

        System.out.print("Enter Requested Seats (comma separated) : ");
        String requestInput = sobj.nextLine();

        // Store booked seats
        Set<String> bookedSeats = new HashSet<>();
        if(!bookedInput.isEmpty())
        {
            bookedSeats.addAll(Arrays.asList(bookedInput.split(",")));
        }

        String[] requestedSeats = requestInput.split(",");

        // Check availability
        for(String seat : requestedSeats)
        {
            if(bookedSeats.contains(seat))
            {
                System.out.println("Booking Failed : Seat " + seat + " already booked");
                sobj.close();
                return;
            }
        }

        // Price calculation
        int totalCost = 0;

        for(String seat : requestedSeats)
        {
            int row = Integer.parseInt(seat.split("-")[0]);

            if(row == 1)
                totalCost += 300;
            else if(row == 2)
                totalCost += 250;
            else
                totalCost += 200;

            bookedSeats.add(seat); // mark booked
        }

        // Group discount
        if(requestedSeats.length >= 6)
        {
            totalCost = (int)(totalCost * 0.90);
        }

        int totalSeats = rows * cols;
        int remainingSeats = totalSeats - bookedSeats.size();

        System.out.println("\nBooking Successful!");
        System.out.println("Total Cost : ₹" + totalCost);
        System.out.println("Remaining Seats : " + remainingSeats);

        sobj.close();
    }   
}
