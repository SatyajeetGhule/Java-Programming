import java.util.*;

class Program73
{
    public static void main(String[] args)
    {
        int iNo = 0;
        int i = 0;

        System.out.println("Enter Number :");
        Scanner sobj = new Scanner(System.in);
        iNo = sobj.nextInt();
        
        for(i = 1;i<=(iNo/2);i++)
        {
            if((iNo % i) == 0)
            {
                System.out.println(i);
            }
        }
    }
}