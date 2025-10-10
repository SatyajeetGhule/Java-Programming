import java.util.Scanner;

class Dynamic {
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int length = 0;
        int Arr[];

        System.out.println("Enter the Number of elements :");
        length = sobj.nextInt();

        Arr = new int[length];

        if(Arr == null)
        {
            System.out.println("Unable to allocate memory :");
        }
        else
        {
            System.out.println("Memory get successfully allocated");
        }

        Arr =null;
        System.gc();  

    }
}