////////////////////////////////////////////////////////////////////////////
//
//  Package / Import Section 
//
////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;
////////////////////////////////////////////////////////////////////////////
//
//  Class Name    :    Logic
//  Method Name   :    CountFactors
//  Description   :    Given a number from user and Disaplay on screen count 
//                     total number of factors that given number.
//  Input         :    Integer
//  Output        :    Void
//  Author        :    Satyajeet Manohar Ghule
//  Date          :    01/10/2025
//
////////////////////////////////////////////////////////////////////////////

class Logic
{
    void CountFactors(int iNo)
    {
        int iCnt = 0, iFactCount = 0;

        if(iNo <= 0)
        {
            iNo = -iNo;
        }
        for(iCnt = 1; iCnt <= (iNo/2); iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                iFactCount++;                
            }
        }
        System.out.println("Total Factors Counted is : "+iFactCount);
    }
}
////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program6_4
//  Method Name     :   main
//  Description     :   Entry point Function for the Application
//
////////////////////////////////////////////////////////////////////////////

class Program6_4
{
    public static void main(String[] args)
    {
        int iValue = 0;

        System.out.println("Enter a number :");
        Scanner sobj = new Scanner(System.in);
        iValue = sobj.nextInt();

        Logic lobj = new Logic();
        lobj.CountFactors(iValue);
        sobj.close();
    }
}
////////////////////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handeld by This Application
//
//  Input   :   20    Output  :  5
//  Input   :   12    Output  :  5
//  Input   :  -15    Output  :  3
//
////////////////////////////////////////////////////////////////////////////