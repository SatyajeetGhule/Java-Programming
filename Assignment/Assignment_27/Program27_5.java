////////////////////////////////////////////////////////////////////////////
//
//  Package / Import Section
//
////////////////////////////////////////////////////////////////////////////

import java.io.*;

////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program27_5
//  Description     :   Read first 1 KB data from Combined.bin
//  Author          :   Satyajeet Manohar Ghule
//  Date            :   30/01/2026
//
////////////////////////////////////////////////////////////////////////////

class Program27_5
{
    ////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name :   main
    //  Description :   Reads first 1024 bytes
    //  Input       :   Combined.bin
    //  Output      :   Output1KB.bin
    //
    ////////////////////////////////////////////////////////////////////////////

    public static void main(String args[]) throws Exception
    {
        FileInputStream fin = new FileInputStream("Combined.bin");
        FileOutputStream fout = new FileOutputStream("Output1KB.bin");

        byte buffer[] = new byte[1024];
        int bytesRead = fin.read(buffer);

        fout.write(buffer, 0, bytesRead);

        fin.close();
        fout.close();

        System.out.println("First 1KB data written to Output1KB.bin");
    }
}

////////////////////////////////////////////////////////////////////////////
//
//  Test Case
//
//  Input   :   Combined.bin
//  Output  :   Output1KB.bin created
//
////////////////////////////////////////////////////////////////////////////
