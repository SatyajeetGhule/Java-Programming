////////////////////////////////////////////////////////////////////////////
//
//  Package / Import Section 
//
////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////
//
//  Class Name    :    Logic
//  Method Name   :    CountDigit
//  Description   :    Given a Number from user and disaplay on screen
//                     Count number of digit.
//  Input         :    Integer
//  Output        :    Void
//  Author        :    Satyajeet Manohar Ghule
//  Date          :    30/10/2025
//
////////////////////////////////////////////////////////////////////////////

class Logic
{
    void CountDigit(int iNo)
    {
        int iCnt = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }
        if(iNo == 0)
        {
            iCnt = 1;
        }
        else
        {
            while (iNo != 0)
            {
                iCnt ++;
                iNo = iNo /10;
            }
        }
        System.out.println(iCnt);
    }
}
////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :  Program1_5
//  Method Name     :   main
//  Description     :   Entry point Function for the Application
//
////////////////////////////////////////////////////////////////////////////

class Program1_5
{
    public static void main(String[] args)
    {
        int iValue = 0;

        System.out.println("Enter a Number :");
        Scanner sobj = new Scanner(System.in);
        iValue = sobj.nextInt();

        Logic lobj = new Logic();
        lobj.CountDigit(iValue);
        sobj.close();
    }
}
////////////////////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handeld by This Application
//
//  Input   :    7865   Output  :   4
//  Input   :    1900   Output  :   4
//  Input   :    0      Output  :   1
//  Input   :    -199   Output  :   3
//
////////////////////////////////////////////////////////////////////////////