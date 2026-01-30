////////////////////////////////////////////////////////////////////////////
//
//  Package / Import Section
//
////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program27_3
//  Description     :   Copy all files from one directory to another
//  Author          :   Satyajeet Manohar Ghule
//  Date            :   30/01/2026
//
////////////////////////////////////////////////////////////////////////////

class Program27_3
{
    ////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name :   main
    //  Description :   Copies directory files
    //  Input       :   Source directory, Destination directory
    //  Output      :   Files copied
    //
    ////////////////////////////////////////////////////////////////////////////

    public static void main(String args[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter source directory:");
        String srcDir = sobj.nextLine();

        System.out.println("Enter destination directory:");
        String destDir = sobj.nextLine();

        File src = new File(srcDir);
        File dest = new File(destDir);

        if(!dest.exists())
        {
            dest.mkdir();
        }

        File files[] = src.listFiles();

        for(File f : files)
        {
            if(f.isFile())
            {
                FileInputStream fin = new FileInputStream(f);
                FileOutputStream fout = new FileOutputStream(destDir + "\\" + f.getName());

                int ch;
                while((ch = fin.read()) != -1)
                {
                    fout.write(ch);
                }

                fin.close();
                fout.close();
            }
        }

        sobj.close();
        System.out.println("All files copied successfully");
    }
}

////////////////////////////////////////////////////////////////////////////
//
//  Test Case
//
//  Input   :   C:\SrcFolder , C:\DestFolder
//  Output  :   All files copied
//
////////////////////////////////////////////////////////////////////////////
