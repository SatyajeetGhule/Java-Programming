////////////////////////////////////////////////////////////////////////////
//
//  Class Name    :    Logic
//  Method Name   :    FindFactorial
//  Description   :    Disaplay on screen Find Factorial of Numbers.
//  Input         :    Integer
//  Output        :    Void
//  Author        :    Satyajeet Manohar Ghule
//  Date          :    30/10/2025
//
////////////////////////////////////////////////////////////////////////////

class Logic
{
    void FindFactorial(int iNo)
    {
        int iCnt = 0, iFact = 0;
        iFact = 1;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            iFact = iFact * iCnt;
        }
        System.out.println(iFact);
    }
}
////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program1_3
//  Method Name     :   main
//  Description     :   Entry point Function for the Application
//
////////////////////////////////////////////////////////////////////////////

class Program1_3
{
    public static void main(String[] args)
    {
        Logic lobj = new Logic();
        lobj.FindFactorial(5);
    }
}
////////////////////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handeld by This Application
//
//  Input   :   5    Output  :      120
//
////////////////////////////////////////////////////////////////////////////