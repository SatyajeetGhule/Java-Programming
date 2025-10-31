////////////////////////////////////////////////////////////////////////////
//
//  Class Name    :    Logic
//  Method Name   :    PrintOddNumber
//  Description   :    Print all Odd number up to N and disaplay on screen
//  Input         :    Integer
//  Output        :    Void
//  Author        :    Satyajeet Manohar Ghule
//  Date          :    31/10/2025
//
////////////////////////////////////////////////////////////////////////////

class Logic
{
    void PrintOddNumber(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <=  iNo; iCnt++)
        {
            if(iCnt % 2 != 0)
            {
                System.out.println(iCnt);
            }
        }
    }
}
////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program3_3
//  Method Name     :   main
//  Description     :   Entry point Function for the Application
//
////////////////////////////////////////////////////////////////////////////

class Program3_3
{
    public static void main(String[] args)
    {
        Logic lobj = new Logic();
        lobj.PrintOddNumber(20);
    }
}
////////////////////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handeld by This Application
//
//  Input   :    20   Output  : 1 3 5 7 9 11 13 15 17 19
//
////////////////////////////////////////////////////////////////////////////