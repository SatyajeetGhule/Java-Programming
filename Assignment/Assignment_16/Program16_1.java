////////////////////////////////////////////////////////////////////////////
//
//  Package / Import Section 
//
////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////
//
//  Function Name :    CountCapital
//  Description   :    Accept String from user and count number of capital
//                     charecter.
//  Input         :    String (Array)
//  Output        :    Integer
//  Author        :    Satyajeet Manohar Ghule
//  Date          :    04/12/2025
//
////////////////////////////////////////////////////////////////////////////

class Pattern
{
    int CountCapital(String str)
    {
        int iCnt = 0, iCount = 0;
        
        for(iCnt = 0; iCnt < str.length(); iCnt++)
        {
            char  ch = str.charAt(iCnt);

            if(ch >= 'A' && ch <= 'Z')
            {
                iCount++;
            }
        }
        return iCount;
    }
}

////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program16_1
//  Method Name     :   main
//  Description     :   Entry point Function for the Application
//
////////////////////////////////////////////////////////////////////////////

class Program16_1
{
    public static void main(String[] args)
    {
        Pattern pobj = new Pattern();
        String sValue = null;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter a String:");
        sValue = sobj.nextLine();

        iRet = pobj.CountCapital(sValue);
        System.out.println("Capital charecter is : "+iRet);

        sobj.close();
    }
}

////////////////////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handeld by This Application
//
//  Input   :   “Marvellous Multi OS”   Output  :   Capital charecter is : 4
//  Input   :   "SatyaJeet Ghule"       Output  :   Capital charecter is : 3
//
////////////////////////////////////////////////////////////////////////////
