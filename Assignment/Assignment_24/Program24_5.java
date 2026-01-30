////////////////////////////////////////////////////////////////////////////
//
//  Package / Import Section
//
////////////////////////////////////////////////////////////////////////////

import java.io.File;
import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program24_5
//  Description     :   Check existence of path
//  Author          :   Satyajeet Manohar Ghule
//  Date            :   30/01/2026
//
////////////////////////////////////////////////////////////////////////////

class Program24_5
{
    ////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name :   main
    //  Description :   Checks path type
    //  Input       :   File or directory path
    //  Output      :   File / Directory status
    //
    ////////////////////////////////////////////////////////////////////////////

    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter path:");
        String path = sobj.nextLine();

        File fobj = new File(path);

        if(fobj.exists())
        {
            if(fobj.isFile())
            {
                System.out.println("Path exists and it is a file");
            }
            else if(fobj.isDirectory())
            {
                System.out.println("Path exists and it is a directory");
            }
        }
        else
        {
            System.out.println("Path does not exist");
        }

        sobj.close();
    }
}

////////////////////////////////////////////////////////////////////////////
//
//  Test Case
//
//  Input   :   C:\TestFolder
//  Output  :   Path exists and it is a directory
//
////////////////////////////////////////////////////////////////////////////
