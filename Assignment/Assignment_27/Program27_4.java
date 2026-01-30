////////////////////////////////////////////////////////////////////////////
//
//  Package / Import Section
//
////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program27_4
//  Description     :   Store data of all files into Combined.bin
//  Author          :   Satyajeet Manohar Ghule
//  Date            :   30/01/2026
//
////////////////////////////////////////////////////////////////////////////

class Program27_4
{
    ////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name :   main
    //  Description :   Combines file data sequentially
    //  Input       :   Directory name
    //  Output      :   Combined.bin file
    //
    ////////////////////////////////////////////////////////////////////////////

    public static void main(String args[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter directory name:");
        String dname = sobj.nextLine();

        File dir = new File(dname);
        FileOutputStream fout = new FileOutputStream("Combined.bin");

        File files[] = dir.listFiles();

        for(File f : files)
        {
            if(f.isFile())
            {
                FileInputStream fin = new FileInputStream(f);
                int ch;
                while((ch = fin.read()) != -1)
                {
                    fout.write(ch);
                }
                fin.close();
            }
        }

        fout.close();
        sobj.close();

        System.out.println("Combined.bin created successfully");
    }
}

////////////////////////////////////////////////////////////////////////////
//
//  Test Case
//
//  Input   :   C:\TestFolder
//  Output  :   Combined.bin created
//
////////////////////////////////////////////////////////////////////////////
