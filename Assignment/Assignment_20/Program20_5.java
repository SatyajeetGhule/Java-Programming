////////////////////////////////////////////////////////////////////////////
//
//  Package / Import Section
//
////////////////////////////////////////////////////////////////////////////   

import java.io.File;
import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program20_5
//  Description     :   Display all files from Directory
//  Author          :   Satyajeet Manohar Ghule
//  Date            :   26/01/2026
//
////////////////////////////////////////////////////////////////////////////

class Program20_5
{
    ////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name :   main
    //  Description :   Lists files from directory
    //  Input       :   Directory name (String)
    //  Output      :   File names
    //
    ////////////////////////////////////////////////////////////////////////////
    
    public static void main(String[] args)
    {
        String fName = null;

        System.out.println("Enter a directory name.");
        Scanner sobj = new Scanner(System.in);
        fName = sobj.next();

        File fobj = new File(fName);

        try
        {
            if(fobj.isDirectory())
            {
                String arr[] = fobj.list();

                for(String name : arr)
                {
                    System.out.println(name);
                }
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
//  Input   :   C:/users/satya/desktop/ppa
//  Output  :   c_prgramming
//              c++_programming
//              java_programming
//
////////////////////////////////////////////////////////////////////////////