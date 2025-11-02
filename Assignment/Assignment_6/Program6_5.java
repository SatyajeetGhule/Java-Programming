////////////////////////////////////////////////////////////////////////////
//
//  Class Name    :    Logic
//  Method Name   :    PrintDivisibleBy2and3
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
    void PrintDivisibleBy2and3(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if((iCnt % 2 == 0) && (iCnt % 3 == 0))
            {
                System.out.print(iCnt+"\t");
            }
        }
    }
}

////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program6_5
//  Method Name     :   main
//  Description     :   Entry point Function for the Application
//
////////////////////////////////////////////////////////////////////////////
class Program6_5
{
    public static void main(String[] args)
    {
        Logic lobj = new Logic();
        lobj.PrintDivisibleBy2and3(30);
    }
}
////////////////////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handeld by This Application
//
//  Input   :   30    Output  :  6 12 18 24 30
//
////////////////////////////////////////////////////////////////////////////
