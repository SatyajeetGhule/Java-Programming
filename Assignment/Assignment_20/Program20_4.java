////////////////////////////////////////////////////////////////////////////
//
//  Package / Import Section
//
////////////////////////////////////////////////////////////////////////////

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program20_4
//  Description     :   Create new file if not existing
//  Author          :   Satyajeet Manohar Ghule
//  Date            :   26/01/2026
//
////////////////////////////////////////////////////////////////////////////

public class Program20_4
{
    ////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name :   main
    //  Description :   File creation logic
    //  Input       :   File name (String)
    //  Output      :   File creation status
    //
    ////////////////////////////////////////////////////////////////////////////
 
    public static void main(String[] args)
    {
        String fName = null;

        System.out.println("Enter the File name.");

        Scanner sobj = new Scanner(System.in);
        fName = sobj.next();

        try
        {            
            File fobj = new File(fName);

            if(fobj.createNewFile())
            {
                System.out.printf("File Created Succesfully.");
            }
            else
            {
                System.out.println("File is already exist.");
            }
        }
        catch(IOException e)
        {
            System.out.println(e);
        }

        sobj.close();
    }
}

////////////////////////////////////////////////////////////////////////////
//
//  Test Cases
//
//  Input   :   Demo.txt
//  Output  :   File Created Succesfully.
//
////////////////////////////////////////////////////////////////////////////


