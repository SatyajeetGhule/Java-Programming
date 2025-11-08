import java.util.*;

class ArrayX
{
    public void Dispaly(int Brr[])
    {
        int i = 0;
        for(i= 0; i < Brr.length; i++)
        {
            System.out.println(Brr[i]);
        }
    }
}
class Program100
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        int iSize = 0;

        System.out.println("Enter the Size of Array..");
        iSize = sobj.nextInt();
        int i = 0;

        int Arr[] = new int[iSize];

        System.out.println("Enter the Element :");

        for(i = 0; i<Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }       

        ArrayX aobj = new ArrayX();
        aobj.Dispaly(Arr);

        //Below Line Important...

        aobj = null;
        Arr = null;
        sobj = null;

        System.gc();

     }
}