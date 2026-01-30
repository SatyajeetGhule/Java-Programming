////////////////////////////////////////////////////////////////////////////
//
//  Package / Import Section
//
////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program25_4
//  Description     :   Merge two files into one output file
//  Author          :   Satyajeet Manohar Ghule
//  Date            :   30/01/2026
//
////////////////////////////////////////////////////////////////////////////

class Program25_4
{
    ////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name :   main
    //  Description :   Merges two files
    //  Input       :   Two input files, One output file
    //  Output      :   Merged file
    //
    ////////////////////////////////////////////////////////////////////////////

    public static void main(String args[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first file:");
        String f1 = sobj.nextLine();

        System.out.println("Enter second file:");
        String f2 = sobj.nextLine();

        System.out.println("Enter output file:");
        String out = sobj.nextLine();

        FileOutputStream fout = new FileOutputStream(out);

        FileInputStream fin1 = new FileInputStream(f1);
        FileInputStream fin2 = new FileInputStream(f2);

        int ch;

        while((ch = fin1.read()) != -1)
        {
            fout.write(ch);
        }

        while((ch = fin2.read()) != -1)
        {
            fout.write(ch);
        }

        fin1.close();
        fin2.close();
        fout.close();
        sobj.close();

        System.out.println("Files merged successfully");
    }
}

////////////////////////////////////////////////////////////////////////////
//
//  Test Case
//
//  Input   :   File1.txt , File2.txt , Merge.txt
//  Output  :   Merge.txt contains data of both files
//
////////////////////////////////////////////////////////////////////////////
