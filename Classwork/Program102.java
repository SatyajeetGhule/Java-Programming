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

    public int Summetion(int Brr[])
    {
        int i = 0, iSum = 0;

        for(i = 0; i < Brr.length; i++)
        {
            iSum += i;
        }
        return iSum;
    }
}
class Program102
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

        iRet = aobj.Summetion(Arr);

        System.out.println("Summetion of All Elements are : "+iRet);

        //Below Line Important...

        aobj = null;
        Arr = null;
        sobj = null;

        System.gc();

     }
}