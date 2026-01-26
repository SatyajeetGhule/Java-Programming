////////////////////////////////////////////////////////////////////////////
//
//  Package / Import Section
//
////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program22_5
//  Description     :   Write file name, size and data into Marvellous.txt
//  Author          :   Satyajeet Manohar Ghule
//  Date            :   26/01/2026
//
////////////////////////////////////////////////////////////////////////////

class Program22_5
{
    ////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name :   main
    //  Description :   Writes file name, size and data
    //  Input       :   Directory name
    //  Output      :   Detailed file information
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
                    fout.write(("\nFile Name : " + f.getName() + "\n").getBytes());
                    fout.write(("File Size : " + f.length() + " bytes\n").getBytes());

                    FileInputStream fin = new FileInputStream(f);
                    int ch;
                    while((ch = fin.read()) != -1)
                    {
                        fout.write(ch);
                    }
                    fin.close();
                }
            }

            System.out.println("File name, size and data written successfully");
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
//  Input   :   c:/users/satya/onedrive/desktop
//  Output  :   Marvellous.txt with file name, size and data
//
////////////////////////////////////////////////////////////////////////////
