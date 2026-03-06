package Assignment_35;
import java.util.*;

public class Program35_1
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        int students, subjects;

        System.out.println("Enter number of Students:");
        students = sobj.nextInt();

        System.out.println("Enter number of Subjects:");
        subjects = sobj.nextInt();

        if(students <= 0 || subjects <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        int arr[][] = new int[students][subjects];

        System.out.println("Enter Marks:");

        for(int i = 0; i < students; i++)
        {
            for(int j = 0; j < subjects; j++)
            {
                arr[i][j] = sobj.nextInt();

                if(arr[i][j] < 0 || arr[i][j] > 100)
                {
                    System.out.println("Invalid Input");
                    return;
                }
            }
        }

        int topper = 0;
        int topperIndex = 0;

        System.out.println("\nStudent Totals:");

        for(int i = 0; i < students; i++)
        {
            int total = 0;

            for(int j = 0; j < subjects; j++)
            {
                total += arr[i][j];
            }

            System.out.println("Student " + (i+1) + ": " + total);

            if(total > topper)
            {
                topper = total;
                topperIndex = i+1;
            }
        }

        System.out.println("Topper: Student " + topperIndex);

        System.out.println("\nSubject Averages:");

        for(int j = 0; j < subjects; j++)
        {
            int sum = 0;

            for(int i = 0; i < students; i++)
            {
                sum += arr[i][j];
            }

            double avg = (double)sum / students;

            System.out.printf("Subject %d: %.2f\n", (j+1), avg);
        }

        System.out.println("\nStudents Failed:");

        for(int i = 0; i < students; i++)
        {
            boolean failed = false;

            for(int j = 0; j < subjects; j++)
            {
                if(arr[i][j] < 35)
                {
                    failed = true;
                }
            }

            if(failed)
            {
                System.out.println("Student " + (i+1));
            }
        }

        sobj.close();
    }
}
