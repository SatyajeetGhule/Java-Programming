////////////////////////////////////////////////////////////////////////////
//
//  Class Name    :    Logic
//  Method Name   :    printTable
//  Description   :    Given a Number from user and disaplay on screen
//                     print Multiplication Number of Table.
//  Input         :    Integer
//  Output        :    Void
//  Author        :    Satyajeet Manohar Ghule
//  Date          :    31/10/2025
//
////////////////////////////////////////////////////////////////////////////

class Logic
{
    void printTable(int iNo)
    {
        int iCnt = 0, table = 0;
        table = 1;
        for(iCnt = 1; iCnt <= 10; iCnt++)
        {
            table = iCnt * iNo;
            System.out.println(table);
        }
    }
}
////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program2_5
//  Method Name     :   main
//  Description     :   Entry point Function for the Application
//
////////////////////////////////////////////////////////////////////////////

class Program2_5
{
    public static void main(String[] args)
    {
        Logic lobj = new Logic();
        lobj.printTable(5);
    }
}
////////////////////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handeld by This Application
//
//  Input   :       Output  :
//  Input   :       Output  :
//  Input   :       Output  :
//  Input   :       Output  :
//
////////////////////////////////////////////////////////////////////////////