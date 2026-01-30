////////////////////////////////////////////////////////////////////////////
//
//  Package / Import Section
//
////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program25_2
//  Description     :   Copy file data using byte buffer
//  Author          :   Satyajeet Manohar Ghule
//  Date            :   30/01/2026
//
////////////////////////////////////////////////////////////////////////////

class Program25_2
{
    ////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name :   main
    //  Description :   Copies file using byte array
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

        FileInputStream fin = new FileInputStream(src);
        FileOutputStream fout = new FileOutputStream(dest);

        byte buffer[] = new byte[1024];
        int length;

        while((length = fin.read(buffer)) > 0)
        {
            fout.write(buffer, 0, length);
        }

        fin.close();
        fout.close();
        sobj.close();

        System.out.println("File copied using buffer");
    }
}

////////////////////////////////////////////////////////////////////////////
//
//  Test Case
//
//  Input   :   Demo.txt , CopyBuffer.txt
//  Output  :   CopyBuffer.txt created successfully
//
////////////////////////////////////////////////////////////////////////////
