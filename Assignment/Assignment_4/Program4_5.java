////////////////////////////////////////////////////////////////////////////
//
//  Package / Import Section 
//
////////////////////////////////////////////////////////////////////////////

////////////////////////////////////////////////////////////////////////////
//
//  Class Name    :    Logic
//  Method Name   :    CalculatePower
//  Description   :    Disaplay on screen and calculate the power of a number
//  Input         :    Integer
//  Output        :    Void
//  Author        :    Satyajeet Manohar Ghule
//  Date          :    31/10/2025
//
////////////////////////////////////////////////////////////////////////////

class Logic
{
    void CalculatePower(int base, int exp)
    {
        int iResult = 0;
        iResult = 1;

        for(int iCnt = 1; iCnt <= exp; iCnt++)
        {
            iResult = iResult * base;
        }
        System.out.println(iResult);
    }
}
////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program4_5
//  Method Name     :   main
//  Description     :   Entry point Function for the Application
//
////////////////////////////////////////////////////////////////////////////

class Program4_5
{
    public static void main(String[] args)
    {
        Logic lobj = new Logic();
        lobj.CalculatePower(2, 5);
    }
}
////////////////////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handeld by This Application
//
//  Input   :   2, 5    Output  :   35
//
////////////////////////////////////////////////////////////////////////////