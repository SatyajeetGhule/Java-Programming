////////////////////////////////////////////////////////////////////////////
//
//  Package / Import Section 
//
////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////
//
//  Function Name :    StrCpy
//  Description   :    Accept string from user and copy that characters of
//                     that string into another string by removing all white
//                     spaces.
//  Input         :    String
//  Output        :    String
//  Author        :    Satyajeet Manohar Ghule
//  Date          :    05/12/2025
//
////////////////////////////////////////////////////////////////////////////

class Pattern
{
   String StrCpyRev(String str)
    {
        StringBuilder newStr = new StringBuilder();

        int iCnt = 0;
        for(iCnt = 0; iCnt < str.length(); iCnt++)
        {
            if(str.charAt(iCnt) != ' ')
            {
                newStr.append(str.charAt(iCnt));
            }
        }
        return newStr.toString();
    }
}

////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program19_2
//  Method Name     :   main
//  Description     :   Entry point Function for the Application
//
////////////////////////////////////////////////////////////////////////////

class Program19_2
{
    public static void main(String[] args)
    {
        Pattern pobj = new Pattern();
        String sValue = null;
        String sRet = null;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter a String:");
        sValue = sobj.nextLine();

        sRet = pobj.StrCpyRev(sValue);
        System.out.println("Copied (without white spaces) String : " +sRet);
        
        sobj.close();
    }
}

////////////////////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handeld by This Application
//
//  Input   :   Satyajeet Ghule     Output  :   SatyajeetGhule
//  Input   :   Marvellous Python   Output  :   MarvellousPython
//
////////////////////////////////////////////////////////////////////////////