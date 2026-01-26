////////////////////////////////////////////////////////////////////////////
//
//  Package / Import Section
//
////////////////////////////////////////////////////////////////////////////

import java.io.FileInputStream;
import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program20_2
//  Description     :   Display contents of given file
//  Author          :   Satyajeet Manohar Ghule
//  Date            :   26/01/2026
//
////////////////////////////////////////////////////////////////////////////

class Program20_2
{
    ////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name :   main
    //  Description :   Reads file data and prints it
    //  Input       :   File name (String)
    //  Output      :   File contents
    //
    ////////////////////////////////////////////////////////////////////////////

    public static void main(String args[]) throws Exception
    {
        String fName = null;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter file name:");
        fName = sobj.nextLine();

        FileInputStream finobj = new FileInputStream(fName);

        int ch = 0;
        while((ch = finobj.read()) != -1)
        {
            System.out.print((char)ch);
        }

        finobj.close();
        sobj.close();
    }
}

////////////////////////////////////////////////////////////////////////////
//
//  Test Cases
//
//  Input   :   data.txt
//  Output  :   Hello World
//
////////////////////////////////////////////////////////////////////////////

