import java.util.*;

class Number
{
    public int CalculateFactorial(int iNo)
    {
        int i = 0;
        long iFact = 1;
        if(iNo < 0)
        {
            iNo = -iNo;
        }
        i = 1;
        while(i<= iNo)  // Change Loop
        {
            iFact = iFact * i;
            i++;
        }

        // for(i = 1; i <= iNo; i++)
        // {
        //     iFact  = iFact * i;
        // }
        return iFact;
    }
} // End of Number Class

class Program89
{
    public static void main(String[] args)
    {
        int iValue = 0;
        long iRet = 0;

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