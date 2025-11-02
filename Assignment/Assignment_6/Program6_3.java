////////////////////////////////////////////////////////////////////////////
//
//  Package / Import Section 
//
////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;
////////////////////////////////////////////////////////////////////////////
//
//  Class Name    :    Logic
//  Method Name   :    DisplayFactors
//  Description   :    Given a number from user and Disaplay on screen print 
//                     all factors that number.
//  Input         :    Integer
//  Output        :    Void
//  Author        :    Satyajeet Manohar Ghule
//  Date          :    01/10/2025
//
////////////////////////////////////////////////////////////////////////////

class Logic
{
    void DisplayFactors(int iNo)
    {
        int iCnt = 0;
        if(iNo <= 0)
        {
            iNo = -iNo;
        }

        for(iCnt = 1; iCnt <= (iNo/2); iCnt++)
        {
            if(iNo % iCnt == 0)
            System.out.print(iCnt+"\t");
        }
    }
}
////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program6_3
//  Method Name     :   main
//  Description     :   Entry point Function for the Application
//
////////////////////////////////////////////////////////////////////////////

class Program6_3
{
    public static void main(String[] args)
    {
        int iValue = 0;

        System.out.println("Enter a number :");
        Scanner sobj = new Scanner(System.in);
        iValue = sobj.nextInt();

        Logic lobj = new Logic();
        lobj.DisplayFactors(iValue);
        sobj.close();
    }
}
////////////////////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handeld by This Application
//
//  Input   :   12   Output  :  1 2 3 4 6
//  Input   :   15   Output  :  1 3 5
//  Input   :  -12   Output  :  1 2 3 4 6
//
////////////////////////////////////////////////////////////////////////////