import java.util.*;

class ExceptionDemo10
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int Arr[] = {10,20,30,40,50};
        int iIndex = 0, iData = 0;

        System.out.println("Enter Index Number");
        iIndex = sobj.nextInt();

        try
        {
            System.out.println("Inside Try Block");
            iData = Arr[iIndex];
        }
        catch(Exception eobj)
        {
            System.out.println("Inside Catch Block");
            System.out.println(eobj);
        }    
        finally
        {
            System.out.println("Inside Finally Block");
        }    

        System.out.println("Element at that Index is : "+iData);
    }   
}
