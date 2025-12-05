////////////////////////////////////////////////////////////////////////////
//
//  Package / Import Section 
//
////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////
//
//  Function Name :    DisplayASCII
//  Description   :    Display ASCII table. Table contains symbol, Decimal,
//                     Hexadecimal and Octal representation of every member 
//                     from 0 to 255.                     
//  Input         :    Character
//  Output        :    void (print String)
//  Author        :    Satyajeet Manohar Ghule
//  Date          :    04/12/2025
//
////////////////////////////////////////////////////////////////////////////

class Pattern
{
    void DisplayASCII()
    {
        for(int iCnt = 0; iCnt <= 255; iCnt++)
        {
            char ch;
            if(iCnt >= 32 && iCnt <= 126)
            {
                ch = (char)iCnt;   
            }
            else
            {
                ch = ' ';          
            }
            System.out.println(ch + "\t" + iCnt + "\t" + Integer.toHexString(iCnt) + "\t" + Integer.toOctalString(iCnt));
        }
    }
}


////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program15_1
//  Method Name     :   main
//  Description     :   Entry point Function for the Application
//
////////////////////////////////////////////////////////////////////////////

class Program15_1
{
    public static void main(String[] args)
    {
        Pattern pobj = new Pattern();
        
        pobj.DisplayASCII();
    }
}

////////////////////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handeld by This Application
//
//  
//
////////////////////////////////////////////////////////////////////////////
