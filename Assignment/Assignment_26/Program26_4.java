////////////////////////////////////////////////////////////////////////////
//
//  Package / Import Section
//
////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program26_4
//  Description     :   Create backup copy of file
//  Author          :   Satyajeet Manohar Ghule
//  Date            :   30/01/2026
//
////////////////////////////////////////////////////////////////////////////

class Program26_4
{
    ////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name :   main
    //  Description :   Creates backup file
    //  Input       :   File name
    //  Output      :   Backup file
    //
    ////////////////////////////////////////////////////////////////////////////

    public static void main(String args[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter file name:");
        String fname = sobj.nextLine();

        FileInputStream fin = new FileInputStream(fname);

        String backupName = fname.substring(0, fname.lastIndexOf('.')) +
                            "_backup" +
                            fname.substring(fname.lastIndexOf('.'));

        FileOutputStream fout = new FileOutputStream(backupName);

        int ch;
        while((ch = fin.read()) != -1)
        {
            fout.write(ch);
        }

        fin.close();
        fout.close();
        sobj.close();

        System.out.println("Backup file created : " + backupName);
    }
}

////////////////////////////////////////////////////////////////////////////
//
//  Test Case
//
//  Input   :   Demo.txt
//  Output  :   Demo_backup.txt created
//
////////////////////////////////////////////////////////////////////////////