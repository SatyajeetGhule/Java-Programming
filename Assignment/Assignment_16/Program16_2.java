////////////////////////////////////////////////////////////////////////////
//
//  Package / Import Section 
//
////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////
//
//  Function Name :    CountSmall
//  Description   :    Accept String from User and Display Count Small 
//                     Charecter.
//  Input         :    String
//  Output        :    Integer
//  Author        :    Satyajeet Manohar Ghule
//  Date          :    04/12/2025
//
////////////////////////////////////////////////////////////////////////////

class Pattern
{
    int CountSmall(String str)
    {
        int iCnt = 0, iCount = 0;
        
        for(iCnt = 0; iCnt < str.length(); iCnt++)
        {
            char  ch = str.charAt(iCnt);

            if(ch >= 'a' && ch <= 'z')
            {
                iCount++;
            }
        }
        return iCount;
    }
}

////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program16_2
//  Method Name     :   main
//  Description     :   Entry point Function for the Application
//
////////////////////////////////////////////////////////////////////////////

class Program16_2
{
    public static void main(String[] args)
    {
        Pattern pobj = new Pattern();
        String sValue = null;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter a String:");
        sValue = sobj.nextLine();

        iRet = pobj.CountSmall(sValue);
        System.out.println("Small charecter is : "+iRet);

        sobj.close();
    }
}

////////////////////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handeld by This Application
//
//  Input   :   “Marvellous Multi OS”   Output  :   Capital charecter is : 13
//  Input   :   "SatyaJeet Ghule"       Output  :   Capital charecter is : 12
//
////////////////////////////////////////////////////////////////////////////