////////////////////////////////////////////////////////////////////////////
//
//  Package / Import Section
//
////////////////////////////////////////////////////////////////////////////

import java.io.File;
import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program21_5
//  Description     :   Display file names and their sizes
//  Author          :   Satyajeet Manohar Ghule
//  Date            :   26/01/2026
//
////////////////////////////////////////////////////////////////////////////

class Program21_5
{
    ////////////////////////////////////////////////////////////////////////
    //
    //  Method Name :   main
    //  Description :   Lists file names and sizes
    //  Input       :   Directory name
    //  Output      :   File name with size
    //
    ////////////////////////////////////////////////////////////////////////////
    
    public static void main(String[] args)
    {
        String dName = null;

        System.out.println("Enter directory name. :");
        Scanner sobj = new Scanner(System.in);
        dName = sobj.next();

        try
        {
            File fobj = new File(dName);

            if(fobj.isDirectory())
            {
                File arr[] = fobj.listFiles();

                for(File f : arr)
                {
                    System.out.println(f.getName() + " : " + f.length() + " bytes");
                }
            }
            else
            {
                System.out.println("Invalid directory");
            }
        }
        catch(Exception e)
        {
            System.out.println("Exception is : "+e);
        }
        sobj.close();
    }
}

////////////////////////////////////////////////////////////////////////////
//
//  Test Cases
//
//  Input   :   c:/users/satya/onedrive/desktop/ppa/c_Programming
//  Output  :   First.cpp           :   244 bytes
//              Dynamic_Demo.cpp    :   518 bytes
//              ....
//
////////////////////////////////////////////////////////////////////////////
