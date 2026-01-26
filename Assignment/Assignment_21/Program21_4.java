////////////////////////////////////////////////////////////////////////////
//
//  Package / Import Section
//
////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;
import java.io.FileInputStream;

////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program21_4
//  Description     :   Calculate checksum of file
//  Author          :   Satyajeet Manohar Ghule
//  Date            :   26/01/2026
//
////////////////////////////////////////////////////////////////////////////

class Program21_4
{
    
    ////////////////////////////////////////////////////////////////////////
    //
    //  Method Name :   main
    //  Description :   Calculates checksum by summing byte values
    //  Input       :   File name
    //  Output      :   Checksum value
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
            FileInputStream finobj = new FileInputStream(fName);

            int ch = 0;
            long checkSum = 0;

            while((ch = finobj.read()) != -1)
            {
                checkSum = checkSum + ch;
            }
            System.out.println("checkSum of file is : "+checkSum);
            finobj.close();
        }
        catch(Exception e)
        {
            System.out.printf("Exception is : "+e);
        }
        sobj.close();
    }
}
////////////////////////////////////////////////////////////////////////////
//
//  Test Cases
//
//  Input   :   Program21_1.java
//  Output  :   checkSum of file is : 133912.
//
////////////////////////////////////////////////////////////////////////////