import java.util.*;

class ArrayX
{
    public void Dispaly(int Brr[])
    {
        int i = 0;
        System.out.println("Elements of the Array are : ");
        for(i= 0; i < Brr.length; i++)
        {
            System.out.println(Brr[i]);
        }
    }

    public int CountEven(int Brr[])
    {
        int i = 0, iCount = 0;

        for(i = 0; i < Brr.length; i++)
        {
            if((Brr[i] % 2) == 0)
            {
                iCount++;
            }
        }
        return iCount;
    }
}
class Program101
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        int iSize = 0, i = 0, iRet = 0;

        System.out.println("Enter the Size of Array..");
        iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        System.out.println("Enter the Element :");

        for(i = 0; i<Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }       

        ArrayX aobj = new ArrayX();
        aobj.Dispaly(Arr);

        iRet = aobj.CountEven(Arr);

        System.out.println("Even Elements are : "+iRet);

        //Below Line Important...

        aobj = null;
        Arr = null;
        sobj = null;

        System.gc();

     }
}