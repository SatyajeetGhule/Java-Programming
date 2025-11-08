import java.util.*;

class Digit
{
    public int SumDigit(int iNo)
    {
        int iDigit = 1;
        int iSum = 0;
        
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iSum += iDigit;
            iNo = iNo / 10;
        }
        return iSum;
    }
}

class Program91
{
    public static void main(String[] args)
    {
        int iValue = 0, iRet = 0;

        System.out.println("Enter Number :");
        Scanner sobj = new Scanner(System.in);
        iValue = sobj.nextInt();

        Digit dobj = new Digit();
        iRet = dobj.SumDigit(iValue);

        System.out.println("Addition of Digit : "+iRet);

        // Below Important
        sobj = null;
        dobj = null;

        System.gc();
        
    }
}