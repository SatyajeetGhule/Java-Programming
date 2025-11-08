//OOP Design
import java.util.Scanner;

class ArrayX
{
    private int Arr[];
    private int iSize;
    
    public ArrayX(int no)
    {
        System.out.println("Inside Constructor...");

        iSize = no;
        Arr = new int[iSize];
    }

    public void Access()
    {
        Scanner sobj = new Scanner(System.in);
        int i = 0;
        System.out.println("Enter the Elements of Array :");
        for(i = 0; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }
    }
    public void Dispaly()
    {
        System.out.println("Elements the Array are :");
        int i = 0;
        for(i = 0; i< Arr.length; i++)
        {
            System.out.println(Arr[i]);
        }
    }
} // End of ArrayX Class

class Program107
{
    public static void main(String[] args)
    {
        ArrayX aobj1 = new ArrayX(5);
        aobj1.Access();
        aobj1.Dispaly();

        ArrayX aobj2 = new ArrayX(7);
        aobj2.Access();
        aobj2.Dispaly();
    }
}