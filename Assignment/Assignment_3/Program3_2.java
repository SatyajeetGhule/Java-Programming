////////////////////////////////////////////////////////////////////////////
//
//  Class Name    :    Logic
//  Method Name   :    PrintEvenNumber
//  Description   :    Print all Even number up to N and disaplay on screen
//  Input         :    Integer
//  Output        :    Void
//  Author        :    Satyajeet Manohar Ghule
//  Date          :    31/10/2025
//
////////////////////////////////////////////////////////////////////////////

class Logic
{
    void PrintEvenNumber(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                System.out.println(iCnt);
            }
        }
    }
}
////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program3_2
//  Method Name     :   main
//  Description     :   Entry point Function for the Application
//
////////////////////////////////////////////////////////////////////////////

class Program3_2
{
    public static void main(String[] args)
    {
        Logic lobj = new Logic();
        lobj.PrintEvenNumber(20);
    }
}
////////////////////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handeld by This Application
//
//  Input   :   20    Output  :  2 4 6 8 10 12 14 16 18 20 
//
////////////////////////////////////////////////////////////////////////////