////////////////////////////////////////////////////////////////////////////
//
//  Package / Import Section 
//
////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////
//
//  Function Name :    DisplayDigit
//  Description   :    Accept string from user and count number of white spaces
//  Input         :    String
//  Output        :    Integer
//  Author        :    Satyajeet Manohar Ghule
//  Date          :    04/12/2025
//
////////////////////////////////////////////////////////////////////////////

class Pattern
{
    int DisplayDigit(String str)
    {
        int iCnt = 0, iCount = 0;
        for(iCnt = 0; iCnt < str.length(); iCnt++)
        {
            
            if(str.charAt(iCnt) == ' ')
            {
                iCount++;
            }            
        }
        return iCount;             
    }
}

////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program17_5
//  Method Name     :   main
//  Description     :   Entry point Function for the Application
//
////////////////////////////////////////////////////////////////////////////

class Program17_5
{
    public static void main(String[] args)
    {
        Pattern pobj = new Pattern();
        String sValue = null;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter a String:");
        sValue = sobj.nextLine();

        iRet = pobj.DisplayDigit(sValue);
        System.out.println("Count total Spaces in String is : "+iRet);
        sobj.close();
    }
}

////////////////////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handeld by This Application
//
//  Input   :   Demo 123 xyz           Output  :   2
//  Input   :   X1y2z3                 Output  :   0
//
////////////////////////////////////////////////////////////////////////////