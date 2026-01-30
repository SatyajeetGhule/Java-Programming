////////////////////////////////////////////////////////////////////////////
//
//  Package / Import Section
//
////////////////////////////////////////////////////////////////////////////

import java.io.File;
import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program23_4
//  Description     :   Count total files and directories
//  Author          :   Satyajeet Manohar Ghule
//  Date            :   30/01/2026
//
////////////////////////////////////////////////////////////////////////////

class Program23_4
{
    ////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name :   main
    //  Description :   Counts files and folders
    //  Input       :   Directory name
    //  Output      :   Total file count and folder count
    //
    ////////////////////////////////////////////////////////////////////////////

    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter directory name:");
        String dname = sobj.nextLine();

        File dobj = new File(dname);

        int fCount = 0, dCount = 0;

        if(dobj.exists() && dobj.isDirectory())
        {
            File arr[] = dobj.listFiles();
            for(File f : arr)
            {
                if(f.isFile())
                {
                    fCount++;
                }
                else if(f.isDirectory())
                {
                    dCount++;
                }
            }

            System.out.println("Total Files   : " + fCount);
            System.out.println("Total Folders : " + dCount);
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
//              Total Files   : 2
//              Total Folders : 2
//
////////////////////////////////////////////////////////////////////////////
