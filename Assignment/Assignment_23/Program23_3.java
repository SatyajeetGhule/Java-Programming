////////////////////////////////////////////////////////////////////////////
//
//  Package / Import Section
//
////////////////////////////////////////////////////////////////////////////

import java.io.File;
import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program23_3
//  Description     :   Display only sub-directories
//  Author          :   Satyajeet Manohar Ghule
//  Date            :   30/01/2026
//
////////////////////////////////////////////////////////////////////////////

class Program23_3
{
    ////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name :   main
    //  Description :   Displays only directories
    //  Input       :   Directory name
    //  Output      :   Directory names
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
                if(f.isDirectory())
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
//              Docs
//              Images
//
////////////////////////////////////////////////////////////////////////////
