////////////////////////////////////////////////////////////////////////////
//
//  Package / Import Section
//
////////////////////////////////////////////////////////////////////////////

import java.io.File;
import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program23_2
//  Description     :   Display only regular files from directory
//  Author          :   Satyajeet Manohar Ghule
//  Date            :   30/01/2026
//
////////////////////////////////////////////////////////////////////////////

class Program23_2
{
    ////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name :   main
    //  Description :   Displays only files, ignores folders
    //  Input       :   Directory name
    //  Output      :   File names
    //
    ////////////////////////////////////////////////////////////////////////////

    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter directory name:");
        String dname = sobj.nextLine();

        File dobj = new File(dname);

        if(dobj.exists() && dobj.isDirectory())
        {
            File arr[] = dobj.listFiles();
            for(File f : arr)
            {
                if(f.isFile())
                {
                    System.out.println(f.getName());
                }
            }
        }
        else
        {
            System.out.println("Invalid directory");
        }

        sobj.close();
    }
}

////////////////////////////////////////////////////////////////////////////
//
//  Test Case
//
//  Input   :   C:\TestFolder
//  Output  :
//              file1.txt
//              file2.pdf
//
////////////////////////////////////////////////////////////////////////////
