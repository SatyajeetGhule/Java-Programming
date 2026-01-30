////////////////////////////////////////////////////////////////////////////
//
//  Package / Import Section
//
////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program27_1
//  Description     :   Copy file using buffered streams
//  Author          :   Satyajeet Manohar Ghule
//  Date            :   30/01/2026
//
////////////////////////////////////////////////////////////////////////////

class Program27_1
{
    ////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name :   main
    //  Description :   Copies file using buffering
    //  Input       :   Source file, Destination file
    //  Output      :   Copied file
    //
    ////////////////////////////////////////////////////////////////////////////

    public static void main(String args[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter source file:");
        String src = sobj.nextLine();

        System.out.println("Enter destination file:");
        String dest = sobj.nextLine();

        BufferedInputStream bin = new BufferedInputStream(new FileInputStream(src));
        BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream(dest));

        int ch;
        while((ch = bin.read()) != -1)
        {
            bout.write(ch);
        }

        bin.close();
        bout.close();
        sobj.close();

        System.out.println("File copied using buffered streams");
    }
}

////////////////////////////////////////////////////////////////////////////
//
//  Test Case
//
//  Input   :   Demo.txt , CopyBuffered.txt
//  Output  :   CopyBuffered.txt created
//
////////////////////////////////////////////////////////////////////////////
