////////////////////////////////////////////////////////////////////////////
//
//  Package / Import Section
//
////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program22_3
//  Description     :   Write data of all files into Marvellous.txt
//  Author          :   Satyajeet Manohar Ghule
//  Date            :   26/01/2026
//
////////////////////////////////////////////////////////////////////////////

class Program22_3
{
    ////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name :   main
    //  Description :   Writes file data into one file
    //  Input       :   Directory name
    //  Output      :   Combined file data
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
                if(f.isFile())
                {
                    FileInputStream fin = new FileInputStream(f);
                    int ch;
                    while((ch = fin.read()) != -1)
                    {
                        fout.write(ch);
                    }
                    fin.close();
                }
            }

            System.out.println("All file data written successfully");
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
//  Input   :   c:/users/satya/onedrive/desktop/ppa/c++_programming
//  Output  :   Marvellous.txt contains combined data
//
////////////////////////////////////////////////////////////////////////////
