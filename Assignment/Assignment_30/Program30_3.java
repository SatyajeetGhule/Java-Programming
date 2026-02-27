import java.util.Scanner;

class Program30_3
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        
        int Marks[] = new int[5];
        int i = 0, iSum = 0;

        boolean Pass = true;
        boolean Invalide = false;

        System.out.println("Enter Marks");
        for(i = 0; i < Marks.length; i++)
        {
            Marks[i] = sobj.nextInt();
            if(Marks[i] < 35)
            {
                Pass = false;
            }

            if(Marks[i] < 0 || Marks[i] > 100)
            {
                Invalide = true;
            }
            iSum = iSum + Marks[i];
        }

        if(Invalide == true)
        {
            System.out.println("Invalide Marks");
            return;
        }

        if(Pass == false)
        {
            System.out.println("Result : Failed");
            return;
        }
        
        float Avrage = ((float)iSum/5);

        System.out.println("Avrage Marks : "+Avrage);

        if(Avrage >= 75.0f)
        {
            System.out.println("Final Result : Distinction");
        }
        else if(Avrage >= 60.0f)
        {
            System.out.println("Final Result : Fist Class");
        }
        else if(Avrage >= 50.0f)
        {
            System.out.println("Final Result : Second Class");
        }
        else if(Avrage < 50.0f)
        {
            System.out.println("Final Result : Pass");
        }

        sobj.close();
    }
}