package Assignment_34;
import java.util.*;

public class Program34_2 
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        
        int iVotes = 0;
  
        System.out.println("Enter the Number of Votes :");
        iVotes = sobj.nextInt();

        if(iVotes < 0)
        {
            System.out.println("Invalid Input");
            sobj.close();
            return;
        }

        Set<Integer> uniqueVoters = new HashSet<>();
        int duplicateCount = 0;

        System.out.println("Enter Voter_IDs :");
        for(int i = 0; i < iVotes; i++)
        {
            int VoterId = sobj.nextInt();

            if(VoterId < 0)
            {
                System.out.println("Invalid Input");
                sobj.close();
                return;
            }

            if(!uniqueVoters.add(VoterId))
            {
                duplicateCount++;
            }
        }

        int validVotes = uniqueVoters.size();

        System.out.println("Valid Votes : "+validVotes);
        System.out.println("Reject Duplicate Votes : "+duplicateCount);

        sobj.close();
    }   
}
