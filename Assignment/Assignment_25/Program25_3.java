////////////////////////////////////////////////////////////////////////////
//
//  Package / Import Section
//
////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program25_3
//  Description     :   Append string at end of file
//  Author          :   Satyajeet Manohar Ghule
//  Date            :   30/01/2026
//
////////////////////////////////////////////////////////////////////////////

class Program25_3
{
    ////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name :   main
    //  Description :   Appends string into file
    //  Input       :   File name, String
    //  Output      :   Updated file
    //
    ////////////////////////////////////////////////////////////////////////////

    public static void main(String args[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter file name:");
        String fname = sobj.nextLine();

        System.out.println("Enter string to append:");
        String data = sobj.nextLine();

        FileOutputStream fout = new FileOutputStream(fname, true);
        fout.write(data.getBytes());

        fout.close();
        sobj.close();

        System.out.println("Data appended successfully");
    }
}

////////////////////////////////////////////////////////////////////////////
//
//  Test Case
//
//  Input   :   Demo.txt , " Hello Java"
//  Output  :   String appended at end of Demo.txt
//
////////////////////////////////////////////////////////////////////////////
