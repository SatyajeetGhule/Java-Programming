////////////////////////////////////////////////////////////////////////////
//
//  Package / Import Section 
//
////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////
//
//  Function Name :    strlwrx
//  Description   :    Accept string from user and convert it into lower case.
//  Input         :    String
//  Output        :    void (print String)
//  Author        :    Satyajeet Manohar Ghule
//  Date          :    04/12/2025
//
////////////////////////////////////////////////////////////////////////////

class Pattern
{
    void strlwrX(String str)
    {
        StringBuilder sbobj = new StringBuilder(str);

        for(int iCnt = 0; iCnt < sbobj.length(); iCnt++)
        {
            char ch = sbobj.charAt(iCnt);

            if(ch >= 'A' && ch <= 'Z')
            {
                ch = (char)(ch + 32);
                sbobj.setCharAt(iCnt, ch);
            }
        }
        System.out.println("Output : " + sbobj.toString());     
    }
}

////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program17_1
//  Method Name     :   main
//  Description     :   Entry point Function for the Application
//
////////////////////////////////////////////////////////////////////////////

class Program17_1
{
    public static void main(String[] args)
    {
        Pattern pobj = new Pattern();
        String sValue = null;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter a String:");
        sValue = sobj.nextLine();

        pobj.strlwrX(sValue);
        sobj.close();
    }
}

////////////////////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handeld by This Application
//
//  Input   :   MARVELLOUS       Output  :   marvellous
//  Input   :   Xyz              Output  :   xyz
//
////////////////////////////////////////////////////////////////////////////
