////////////////////////////////////////////////////////////////////////////
//
//  Package / Import Section 
//
////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////
//
//  Function Name :    Difference
//  Description   :    Accept String from user.return difference between
//                     frequency of small characters and frequency of
//                     capital characters.
//  Input         :    String
//  Output        :    Charecter
//  Author        :    Satyajeet Manohar Ghule
//  Date          :    04/12/2025
//
////////////////////////////////////////////////////////////////////////////

class Pattern
{
    int Difference(String str)
    {
        int iCnt = 0, iSmall = 0, iCapital = 0;
        
        for(iCnt = 0; iCnt < str.length(); iCnt++)
        {
            char  ch = str.charAt(iCnt);

            if(ch >= 'a' && ch <= 'z')
            {
                iSmall++;
            }
            else if(ch >= 'A' && ch <= 'Z')
            {
                iCapital++;
            }
        }
        return iSmall - iCapital;
    }
}

////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program16_3
//  Method Name     :   main
//  Description     :   Entry point Function for the Application
//
////////////////////////////////////////////////////////////////////////////

class Program16_3
{
    public static void main(String[] args)
    {
        Pattern pobj = new Pattern();
        String sValue = null;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter a String:");
        sValue = sobj.nextLine();

        iRet = pobj.Difference(sValue);
        System.out.println("Difference is : "+iRet);

        sobj.close();
    }
}

////////////////////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handeld by This Application
//
//  Input   :   “MarvellouS”        Output  :   Difference is : 6 
//  Input   :   "SATYAjeet GHule"   Output  :   Difference is : 0
//
////////////////////////////////////////////////////////////////////////////