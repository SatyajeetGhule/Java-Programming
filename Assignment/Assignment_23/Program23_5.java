////////////////////////////////////////////////////////////////////////////
//
//  Package / Import Section
//
////////////////////////////////////////////////////////////////////////////

import java.io.File;
import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program23_5
//  Description     :   Display file name with absolute path
//  Author          :   Satyajeet Manohar Ghule
//  Date            :   30/01/2026
//
////////////////////////////////////////////////////////////////////////////

class Program23_5
{
    ////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name :   main
    //  Description :   Displays file name with absolute path
    //  Input       :   Directory name
    //  Output      :   File name and absolute path
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
                System.out.println(f.getName() + " -> " + f.getAbsolutePath());
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
//              file1.txt -> C:\TestFolder\file1.txt
//              file2.pdf -> C:\TestFolder\file2.pdf
//              Docs      -> C:\TestFolder\Docs
//              Images    -> C:\TestFolder\Images
//
////////////////////////////////////////////////////////////////////////////
