////////////////////////////////////////////////////////////////////////////
//
//  Package / Import Section
//
////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program26_5
//  Description     :   Demonstrate proper file exception handling
//  Author          :   Satyajeet Manohar Ghule
//  Date            :   30/01/2026
//
////////////////////////////////////////////////////////////////////////////

class Program26_5
{
    ////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name :   main
    //  Description :   Handles file related exceptions
    //  Input       :   File name
    //  Output      :   Error / Success message
    //
    ////////////////////////////////////////////////////////////////////////////

    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        try
        {
            System.out.println("Enter file name:");
            String fname = sobj.nextLine();

            FileInputStream fin = new FileInputStream(fname);
            System.out.println("File opened successfully");

            fin.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Error : File not found");
        }
        catch(IOException e)
        {
            System.out.println("Error : Input Output exception");
        }
        finally
        {
            sobj.close();
            System.out.println("Resources closed");
        }
    }
}

////////////////////////////////////////////////////////////////////////////
//
//  Test Case
//
//  Input   :   Demo.txt
//  Output  :   File opened successfully
//
//  Input   :   ABC.txt
//  Output  :   Error : File not found
//
////////////////////////////////////////////////////////////////////////////
