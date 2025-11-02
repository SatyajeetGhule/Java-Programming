////////////////////////////////////////////////////////////////////////////
//
//  Class Name    :    Logic
//  Method Name   :    CountEvenOddRange
//  Description   :    Disaplay on screen and print count even and odd numbers 
//                     are present between 1 to N number.
//  Input         :    Integer
//  Output        :    Void
//  Author        :    Satyajeet Manohar Ghule
//  Date          :    01/10/2025
//
////////////////////////////////////////////////////////////////////////////

class Logic
{
    void CountEvenOddRange(int iNo)
    {
        int iEven = 0, iOdd = 0, iCnt = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                iEven++;
            }
            if(iCnt % 2 != 0)
            {
                iOdd++;
            }
        }
        System.out.println("Between 1 to "+iNo);
        System.out.println("Total Even Numbers is : "+iEven);
        System.out.println("Total Odd Numbers is : "+iOdd);
    }
}
////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program6_2
//  Method Name     :   main
//  Description     :   Entry point Function for the Application
//
////////////////////////////////////////////////////////////////////////////

class Program6_2
{
    public static void main(String[] args)
    {
        Logic lobj = new Logic();
        lobj.CountEvenOddRange(50);
    }
}
////////////////////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handeld by This Application
//
//  Input   :   50  Output  :   Between 1 to 50
//                              Total Even Numbers is : 25
//                              Total Odd Numbers is : 25
//
////////////////////////////////////////////////////////////////////////////