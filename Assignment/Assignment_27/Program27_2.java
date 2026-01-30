////////////////////////////////////////////////////////////////////////////
//
//  Package / Import Section
//
////////////////////////////////////////////////////////////////////////////

import java.io.*;

////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program27_2
//  Description     :   Compare normal vs buffered stream performance
//  Author          :   Satyajeet Manohar Ghule
//  Date            :   30/01/2026
//
////////////////////////////////////////////////////////////////////////////

class Program27_2
{
    ////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name :   main
    //  Description :   Displays time required for copying
    //  Input       :   None (file names hardcoded)
    //  Output      :   Time comparison
    //
    ////////////////////////////////////////////////////////////////////////////

    public static void main(String args[]) throws Exception
    {
        long start, end;

        // Normal Streams
        start = System.currentTimeMillis();

        FileInputStream fin = new FileInputStream("Demo.txt");
        FileOutputStream fout = new FileOutputStream("NormalCopy.txt");

        int ch;
        while((ch = fin.read()) != -1)
        {
            fout.write(ch);
        }

        fin.close();
        fout.close();

        end = System.currentTimeMillis();
        System.out.println("Normal stream time : " + (end - start) + " ms");

        // Buffered Streams
        start = System.currentTimeMillis();

        BufferedInputStream bin = new BufferedInputStream(new FileInputStream("Demo.txt"));
        BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream("BufferedCopy.txt"));

        while((ch = bin.read()) != -1)
        {
            bout.write(ch);
        }

        bin.close();
        bout.close();

        end = System.currentTimeMillis();
        System.out.println("Buffered stream time : " + (end - start) + " ms");
    }
}

////////////////////////////////////////////////////////////////////////////
//
//  Test Case
//
//  Input   :   Demo.txt
//  Output  :
//              Normal stream time : 120 ms
//              Buffered stream time : 15 ms
//
////////////////////////////////////////////////////////////////////////////
