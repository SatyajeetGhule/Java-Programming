////////////////////////////////////////////////////////////////////////////
//
//  Class NAme    :    Logic 
//  Method Name   :    CalculateSum
//  Description   :    disaplay on screen calculate sum of first N natural number .
//  Input         :    Integer
//  Output        :    Void 
//  Author        :    Satyajeet Manohar Ghule
//  Date          :    30/10/2025
//
////////////////////////////////////////////////////////////////////////////

class Logic
{
    void CalculateSum(int iNo)
    {
        int iCnt = 0, iSum = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            iSum = iSum + iCnt;
        }
        System.out.println(iSum);
    }
}
////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program1_1
//  Method Name     :   main
//  Description     :   Entry point Function for the Application
//
////////////////////////////////////////////////////////////////////////////

class Program1_1
{
    public static void main(String[] args)
    {
        
        Logic lobj = new Logic();

        lobj.CalculateSum(10);
    }
}
////////////////////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handeld by This Application
//
//  Input   :   10    Output  :     55
//
////////////////////////////////////////////////////////////////////////////