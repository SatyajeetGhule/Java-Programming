import java.util.*;

class Number
{
    public void DisplayFactors(int iNo)
    {
        int i = 0;
        for(i = 1;i<=(iNo/2);i++)
        {
            if((iNo % i) == 0)
            {
                System.out.println(i);
            }
        }
    }
} // End of Number Class

class Program77
{
    public static void main(String[] args)
    {
        int iValue = 0;

        System.out.println("Enter Number :");
        Scanner sobj = new Scanner(System.in);
        iValue = sobj.nextInt();

        Number nobj = new Number();
        nobj.DisplayFactors(iValue);
        
    }
}