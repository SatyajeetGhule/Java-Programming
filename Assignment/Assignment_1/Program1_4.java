////////////////////////////////////////////////////////////////////////////
//
//  Class Name    :    Logic
//  Method Name   :    ReverseNumber
//  Description   :    Disaplay on screen Reverse N Number.
//  Input         :    Integer
//  Output        :    Void
//  Author        :    Satyajeet Manohar Ghule
//  Date          :    30/10/2025
//
////////////////////////////////////////////////////////////////////////////

class Logic {
    void ReverseNumber(int iNo)
    {
        int iRevs = 0;

        while (iNo != 0)
        {
            iRevs = iNo % 10;
            if (iRevs != 0)
            {
                System.out.print(iRevs);
            }
            iNo = iNo / 10;
        }
    }
}
////////////////////////////////////////////////////////////////////////////
//
// Class Name : Program1_4
// Method Name : main
// Description : Entry point Function for the Application
//
////////////////////////////////////////////////////////////////////////////

class Program1_4
{
    public static void main(String[] args)
    {
        Logic lobj = new Logic();
        lobj.ReverseNumber(1234);
    }
}
////////////////////////////////////////////////////////////////////////////
//
// Test Cases Successfully Handeld by This Application
//
// Input :   1234    Output :   4321
//
////////////////////////////////////////////////////////////////////////////