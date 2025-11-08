import java.util.*;

class Number
{
    public int CalculateFactorial(int iNo)
    {
        int i = 0, iFact = 0;
        iFact = 1;
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        for(i = 1; i <= iNo; i++)
        {
            iFact *= i;
        }
        return iFact;
    }
} // End of Number Class

class Program87
{
    public static void main(String[] args)
    {
        int iValue = 0, iRet = 0;

        System.out.println("Enter Number :");
        Scanner sobj = new Scanner(System.in);
        iValue = sobj.nextInt();

        Number nobj = new Number();
        iRet = nobj.CalculateFactorial(iValue);

        System.out.println("Factorial is "+iRet);

        // Below Important
        sobj = null;
        nobj = null;

        System.gc();
        
    }
}