////////////////////////////////////////////////////////////////////////////
//
//  Package / Import Section
//
////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;
import java.io.File;

////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program21_3
//  Description     :   Create directory if not exists
//  Author          :   Satyajeet Manohar Ghule
//  Date            :   26/01/2026
//
////////////////////////////////////////////////////////////////////////////

class Program21_3
{

    ////////////////////////////////////////////////////////////////////////
    //
    //  Method Name :   main
    //  Description :   Directory creation logic
    //  Input       :   Directory name
    //  Output      :   Directory created status
    //
    ////////////////////////////////////////////////////////////////////////////
    
    public static void main(String[] args)
    {
        String fName = null;

        System.out.println("Enter directory name. :");
        Scanner sobj = new Scanner(System.in);
        fName = sobj.next();

        try
        {
            File fobj = new File(fName);

            if(fobj.mkdir())
            {
                System.out.println("Directory gets Created succesfully.");
            }
            else
            {
                 System.out.println("Directory already exist.");
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
//  Input   :   Programming_Languages
//  Output  :   Directory gets created succesfully.
//
////////////////////////////////////////////////////////////////////////////