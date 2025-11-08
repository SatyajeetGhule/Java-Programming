import java.util.*;

class Number
{
    public boolean CheckPerfect(int iNo)
    {
        int i = 0, iSum = 0;
        
        if(iNo < 0)
        {
            iNo = -iNo;
        }
        // Reverse Loop
        for(i = iNo/2;(i>=1) && (iSum < iNo);i--)
        {
            if((iNo % i) == 0)
            {
                iSum += i;
            }
        }
        return(iSum == iNo);
    }
} // End of Number Class

class Program85
{
    public static void main(String[] args)
    {
        int iValue = 0;
        boolean bRet = false;

        System.out.println("Enter Number :");
        Scanner sobj = new Scanner(System.in);
        iValue = sobj.nextInt();

        Number nobj = new Number();
        bRet = nobj.CheckPerfect(iValue);

        if(bRet == true)
        {
            System.out.println(iValue+" Is Perfect Number");
        }
        else
        {
            System.out.println(iValue+" Is Not a Perfect Number");
        }

        // Below Important
        sobj = null;
        nobj = null;

        System.gc();
        
    }
}