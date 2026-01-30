////////////////////////////////////////////////////////////////////////////
//
//  Package / Import Section
//
////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program26_3
//  Description     :   Copy last N bytes into new file
//  Author          :   Satyajeet Manohar Ghule
//  Date            :   30/01/2026
//
////////////////////////////////////////////////////////////////////////////

class Program26_3
{
    ////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name :   main
    //  Description :   Copies last N bytes
    //  Input       :   File name, Integer N
    //  Output      :   New file with last N bytes
    //
    ////////////////////////////////////////////////////////////////////////////

    public static void main(String args[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter file name:");
        String fname = sobj.nextLine();

        System.out.println("Enter number of bytes:");
        int N = sobj.nextInt();

        File file = new File(fname);
        long size = file.length();

        FileInputStream fin = new FileInputStream(file);
        FileOutputStream fout = new FileOutputStream("LastNBytes.txt");

        fin.skip(size - N);

        int ch;
        while((ch = fin.read()) != -1)
        {
            fout.write(ch);
        }

        fin.close();
        fout.close();
        sobj.close();

        System.out.println("Last N bytes copied successfully");
    }
}

////////////////////////////////////////////////////////////////////////////
//
//  Test Case
//
//  Input   :   Demo.txt , 15
//  Output  :   LastNBytes.txt created
//
////////////////////////////////////////////////////////////////////////////
