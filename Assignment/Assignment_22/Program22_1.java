////////////////////////////////////////////////////////////////////////////
//
//  Package / Import Section
//
////////////////////////////////////////////////////////////////////////////

import java.io.File;
import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program22_1
//  Description     :   Display only regular files from directory
//  Author          :   Satyajeet Manohar Ghule
//  Date            :   26/01/2026
//
////////////////////////////////////////////////////////////////////////////

class Program22_1
{
    ////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name :   main
    //  Description :   Displays regular files
    //  Input       :   Directory name
    //  Output      :   Names of regular files
    //
    ////////////////////////////////////////////////////////////////////////////

    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter directory name:");
        String dname = sobj.nextLine();

        File dobj = new File(dname);

        if(dobj.isDirectory())
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
//  Test Cases
//
//  Input   :   c:/users/satya/onedrive/desktop
//  Output  :   Demo.java
//              Test.txt ...
//
////////////////////////////////////////////////////////////////////////////
