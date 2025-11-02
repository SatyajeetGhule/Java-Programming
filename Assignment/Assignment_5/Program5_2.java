////////////////////////////////////////////////////////////////////////////
//
//  Class Name    :    Logic
//  Method Name   :    PrintReverse
//  Description   :    Disaplay on screen print N number down to 1 number 
//                     reverse order
//  Input         :    Integer
//  Output        :    Void
//  Author        :    Satyajeet Manohar Ghule
//  Date          :    31/10/2025
//
////////////////////////////////////////////////////////////////////////////

class Logic
{
    void PrintReverse(int iNO)
    {
        int iCnt = 0;

        for(iCnt = iNO; iCnt >= 1; iCnt--)
        {
            System.out.println(iCnt);
        }
    }
}
////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program5_2
//  Method Name     :   main
//  Description     :   Entry point Function for the Application
//
////////////////////////////////////////////////////////////////////////////

class Program5_2
{
    public static void main(String[] args)
    {
        Logic lobj = new Logic();
        lobj.PrintReverse(10);
    }
}
////////////////////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handeld by This Application
//
//  Input   :   10    Output  :     10 9 8 7 6 5 4 3 2 1
//
////////////////////////////////////////////////////////////////////////////