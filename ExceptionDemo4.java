import java.util.*;

class ExceptionDemo4
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo1 = 0, iNo2 = 0; 
        int iAns = 0;

        System.out.println("Enter first Number");
        iNo1 = sobj.nextInt();

        System.out.println("Enter Second Number");
        iNo2 = sobj.nextInt();

        try
        {
            System.out.println("Inside Try Block");
            iAns = iNo1 / iNo2;
        }
        catch(ArithmeticException aobj)
        {
            System.out.println("Inside Catch Block");
            System.out.println(aobj);
        }

        System.out.println("Division is : "+iAns);
    }   
}
