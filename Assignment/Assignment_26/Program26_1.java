////////////////////////////////////////////////////////////////////////////
//
//  Package / Import Section
//
////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program26_1
//  Description     :   Display total number of bytes from file
//  Author          :   Satyajeet Manohar Ghule
//  Date            :   30/01/2026
//
////////////////////////////////////////////////////////////////////////////

class Program26_1
{
    ////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name :   main
    //  Description :   Counts total bytes in file
    //  Input       :   File name
    //  Output      :   Total bytes
    //
    ////////////////////////////////////////////////////////////////////////////

    public static void main(String args[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter file name:");
        String fname = sobj.nextLine();

        FileInputStream fin = new FileInputStream(fname);
        int count = 0;

        while(fin.read() != -1)
        {
            count++;
        }

        fin.close();
        sobj.close();

        System.out.println("Total bytes : " + count);
    }
}

////////////////////////////////////////////////////////////////////////////
//
//  Test Case
//
//  Input   :   Demo.txt
//  Output  :   Total bytes : 120
//
////////////////////////////////////////////////////////////////////////////
