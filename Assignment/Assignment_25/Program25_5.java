////////////////////////////////////////////////////////////////////////////
//
//  Package / Import Section
//
////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program25_5
//  Description     :   Split file into two parts
//  Author          :   Satyajeet Manohar Ghule
//  Date            :   30/01/2026
//
////////////////////////////////////////////////////////////////////////////

class Program25_5
{
    ////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name :   main
    //  Description :   Splits file into first and second half
    //  Input       :   File name
    //  Output      :   Two files created
    //
    ////////////////////////////////////////////////////////////////////////////

    public static void main(String args[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter file name:");
        String fname = sobj.nextLine();

        File file = new File(fname);
        FileInputStream fin = new FileInputStream(file);

        long size = file.length();
        long half = size / 2;

        FileOutputStream fout1 = new FileOutputStream("FirstHalf.txt");
        FileOutputStream fout2 = new FileOutputStream("SecondHalf.txt");

        int ch;
        long count = 0;

        while((ch = fin.read()) != -1)
        {
            if(count < half)
                fout1.write(ch);
            else
                fout2.write(ch);

            count++;
        }

        fin.close();
        fout1.close();
        fout2.close();
        sobj.close();

        System.out.println("File split successfully");
    }
}

////////////////////////////////////////////////////////////////////////////
//
//  Test Case
//
//  Input   :   Demo.txt
//  Output  :   FirstHalf.txt , SecondHalf.txt created
//
////////////////////////////////////////////////////////////////////////////
