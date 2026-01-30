////////////////////////////////////////////////////////////////////////////
//
//  Package / Import Section
//
////////////////////////////////////////////////////////////////////////////

import java.io.File;
import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program23_1
//  Description     :   Display all file and folder names from directory
//  Author          :   Satyajeet Manohar Ghule
//  Date            :   30/01/2026
//
////////////////////////////////////////////////////////////////////////////

class Program23_1
{
    ////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name :   main
    //  Description :   Accepts directory name and displays all entries
    //  Input       :   Directory name
    //  Output      :   File and folder names
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
                System.out.println(f.getName());
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
//  Input   :   D:\TestFolder
//  Output  :
//              file1.txt
//              file2.pdf
//              Docs
//              Images
//
////////////////////////////////////////////////////////////////////////////
