////////////////////////////////////////////////////////////////////////////
//
//  Package / Import Section
//
////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program26_2
//  Description     :   Copy first N bytes into new file
//  Author          :   Satyajeet Manohar Ghule
//  Date            :   30/01/2026
//
////////////////////////////////////////////////////////////////////////////

class Program26_2
{
    ////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name :   main
    //  Description :   Copies first N bytes
    //  Input       :   File name, Integer N
    //  Output      :   New file with first N bytes
    //
    ////////////////////////////////////////////////////////////////////////////

    public static void main(String args[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter file name:");
        String fname = sobj.nextLine();

        System.out.println("Enter number of bytes:");
        int N = sobj.nextInt();

        FileInputStream fin = new FileInputStream(fname);
        FileOutputStream fout = new FileOutputStream("FirstNBytes.txt");

        int ch, count = 0;

        while((ch = fin.read()) != -1 && count < N)
        {
            fout.write(ch);
            count++;
        }

        fin.close();
        fout.close();
        sobj.close();

        System.out.println("First N bytes copied successfully");
    }
}

////////////////////////////////////////////////////////////////////////////
//
//  Test Case
//
//  Input   :   Demo.txt , 20
//  Output  :   FirstNBytes.txt created
//
////////////////////////////////////////////////////////////////////////////
