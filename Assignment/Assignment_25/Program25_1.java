////////////////////////////////////////////////////////////////////////////
//
//  Package / Import Section
//
////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program25_1
//  Description     :   Copy data from source file to destination file
//                      (byte by byte)
//  Author          :   Satyajeet Manohar Ghule
//  Date            :   30/01/2026
//
////////////////////////////////////////////////////////////////////////////

class Program25_1
{
    ////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name :   main
    //  Description :   Copies file data byte by byte
    //  Input       :   Source file name, Destination file name
    //  Output      :   Copied file
    //
    ////////////////////////////////////////////////////////////////////////////

    public static void main(String args[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter source file name:");
        String src = sobj.nextLine();

        System.out.println("Enter destination file name:");
        String dest = sobj.nextLine();

        FileInputStream fin = new FileInputStream(src);
        FileOutputStream fout = new FileOutputStream(dest);

        int ch;
        while((ch = fin.read()) != -1)
        {
            fout.write(ch);
        }

        fin.close();
        fout.close();
        sobj.close();

        System.out.println("File copied successfully");
    }
}

////////////////////////////////////////////////////////////////////////////
//
//  Test Case
//
//  Input   :   Source : Demo.txt
//              Destination : Copy.txt
//  Output  :   Copy.txt created with same data
//
////////////////////////////////////////////////////////////////////////////
