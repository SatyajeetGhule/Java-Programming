////////////////////////////////////////////////////////////////////////////
//
//  Package / Import Section
//
////////////////////////////////////////////////////////////////////////////

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program21_1
//  Description     :   Copy data from source file into destination file
//  Author          :   Satyajeet Manohar Ghule
//  Date            :   26/01/2026
//
////////////////////////////////////////////////////////////////////////////

class Program21_1
{
    ////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name :   main
    //  Description :   Copies data from one file to another
    //  Input       :   Source file name, Destination file name
    //  Output      :   File copied message
    //
    ////////////////////////////////////////////////////////////////////////////
    
    public static void main(String[] args)
    {
        String surName = null, desName = null;

        System.out.println("Enter the source file name :");
        Scanner sobj = new Scanner(System.in);
        surName = sobj.next();

        System.out.println("Enter the destination name :");
        desName = sobj.next();

        try
        {
            FileInputStream finobj = new FileInputStream(surName);
            FileOutputStream foutobj = new FileOutputStream(desName);

            int ch = 0;

            while((ch = finobj.read()) != -1)
            {
                foutobj.write(ch);
            }
            finobj.close();
            foutobj.close();
        }
        catch(Exception e)
        {
            System.out.println("Exception is :"+e);
        }

        sobj.close();
    }   
}
////////////////////////////////////////////////////////////////////////////
//
//  Test Cases
//
//  Input   :   source.txt  dest.txt
//  Output  :   File copied successfully
//
////////////////////////////////////////////////////////////////////////////
