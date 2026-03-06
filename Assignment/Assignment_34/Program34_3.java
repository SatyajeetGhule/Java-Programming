package Assignment_34;
import java.util.*;

public class Program34_3
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        int[] steps = new int[7];
        int goalAchivedDays = 0;
        int maxSteps = 0;
        int dailyGoal = 10000;

        System.out.println("Enter steps for 7 Days :");

        for(int i = 0; i < 7; i++)
        {
            steps[i] = sobj.nextInt();

            if(steps[i] < 0)
            {
                System.out.println("Invalid Input");
                sobj.close();
                return;
            }

            if(steps[i] >= dailyGoal)
            {
                goalAchivedDays++;
            }
            
            if(steps[i] > maxSteps)
            {
                maxSteps = steps[i];
            }
        }

        System.out.println("Goal Achived Days : "+goalAchivedDays);
        System.out.println("Maximum Steps in Week : "+maxSteps);

        sobj.close();
    }   
}
