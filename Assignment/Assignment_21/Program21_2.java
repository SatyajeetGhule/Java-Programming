////////////////////////////////////////////////////////////////////////////
//
//  Package / Import Section
//
////////////////////////////////////////////////////////////////////////////

import java.io.File;
import java.util.Scanner;


////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program21_2
//  Description     :   Check whether given file is regular file or not
//  Author          :   Satyajeet Manohar Ghule
//  Date            :   26/01/2026
//
////////////////////////////////////////////////////////////////////////////

class Program21_2
{

    ////////////////////////////////////////////////////////////////////////
    //
    //  Method Name :   main
    //  Description :   Checks regular file
    //  Input       :   File name
    //  Output      :   Regular file / Not a regular file
    //
    ////////////////////////////////////////////////////////////////////////////
    
    public static void main(String[] args)
    {
        String fName = null;

        System.out.println("Enter file name. :");
        Scanner sobj = new Scanner(System.in);
        fName = sobj.next();

        try
        {    
            File fobj = new File(fName);

            if(fobj.isFile())
            {
                System.out.println("It is REGULAR file.");
            }
            else
            {
                System.out.println("It is not REGULAR file.");
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
//  Input   :   Program21_1.java
//  Output  :   It is REGULAR file..
//
////////////////////////////////////////////////////////////////////////////