import java.util.*;

class Digit
{
    public void DisplayDigit(int iNo)
    {
        int iDigit = 1;
        
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            System.out.println(iDigit);
            iNo = iNo / 10;
        }
    }
}

class Program90
{
    public static void main(String[] args)
    {
        int iValue = 0;

        System.out.println("Enter Number :");
        Scanner sobj = new Scanner(System.in);
        iValue = sobj.nextInt();

        Digit dobj = new Digit();
        dobj.DisplayDigit(iValue);

        // Below Important
        sobj = null;
        dobj = null;

        System.gc();
        
    }
}