////////////////////////////////////////////////////////////////////////////
//
//  Package / Import Section
//
////////////////////////////////////////////////////////////////////////////

import java.io.FileOutputStream;
import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program20_3
//  Description     :   Append data at end of file
//  Author          :   Satyajeet Manohar Ghule
//  Date            :   26/01/2026
//
////////////////////////////////////////////////////////////////////////////

class Program20_3
{
    ////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name :   main
    //  Description :   Writes data in append mode
    //  Input       :   File name (String)
    //  Output      :   Data written message
    //
    ////////////////////////////////////////////////////////////////////////////

    public static void main(String args[]) throws Exception
    {
        String fName = null;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter file name:");
        fName = sobj.nextLine();

        FileOutputStream foutobj = new FileOutputStream(fName, true);

        String data = "\nJava File Handling";

        foutobj.write(data.getBytes());

        System.out.println("Data written successfully");

        foutobj.close();
        sobj.close();
    }
}

////////////////////////////////////////////////////////////////////////////
//
//  Test Cases
//
//  Input   :   demo.txt
//  Output  :   Data written successfully
//
////////////////////////////////////////////////////////////////////////////
