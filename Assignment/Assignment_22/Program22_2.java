////////////////////////////////////////////////////////////////////////////
//
//  Package / Import Section
//
////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program22_2
//  Description     :   Write all file names into Marvellous.txt
//  Author          :   Satyajeet Manohar Ghule
//  Date            :   26/01/2026
//
////////////////////////////////////////////////////////////////////////////

class Program22_2
{
    ////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name :   main
    //  Description :   Writes file names into file
    //  Input       :   Directory name
    //  Output      :   Marvellous.txt created
    //
    ////////////////////////////////////////////////////////////////////////////

    public static void main(String args[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter directory name:");
        String dname = sobj.nextLine();

        File dobj = new File(dname);
        FileOutputStream fout = new FileOutputStream("Marvellous.txt");

        if(dobj.isDirectory())
        {
            File arr[] = dobj.listFiles();

            for(File f : arr)
            {
                fout.write((f.getName() + "\n").getBytes());
            }

            System.out.println("File names written successfully");
        }
        else
        {
            System.out.println("Invalid directory");
        }

        fout.close();
        sobj.close();
    }
}

////////////////////////////////////////////////////////////////////////////
//
//  Test Cases
//
//  Input   :   D:\\JavaPrograms
//  Output  :   Marvellous.txt created with file names
//
////////////////////////////////////////////////////////////////////////////
