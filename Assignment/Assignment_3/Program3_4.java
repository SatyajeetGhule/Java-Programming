////////////////////////////////////////////////////////////////////////////
//
//  Package / Import Section 
//
////////////////////////////////////////////////////////////////////////////

////////////////////////////////////////////////////////////////////////////
//
//  Class Name    :    Logic
//  Method Name   :    SumEvenOddDigit
//  Description   :    Disaplay on screen and Sum of all Even and Odd digit
//                     separately in a Numbers
//  Input         :    Integer
//  Output        :    Void
//  Author        :    Satyajeet Manohar Ghule
//  Date          :    31/10/2025
//
////////////////////////////////////////////////////////////////////////////

class Logic
{
    void SumEvenOddDigit(int iNo)
    {
        int SumEven = 0, SumOdd = 0;
        int iDigit = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if((iDigit % 2) == 0)
            {
                SumEven += iDigit;
            }
            if((iDigit %  2) != 0)
            {
                SumOdd += iDigit;
            }
            iNo = iNo / 10;
        }
        System.out.println("Sum of all Even Number is : "+SumEven);
        System.out.println("Sum of all Odd Number is : "+SumOdd);
    }
}
////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program3_4
//  Method Name     :   main
//  Description     :   Entry point Function for the Application
//
////////////////////////////////////////////////////////////////////////////

class Program3_4
{
    public static void main(String[] args)
    {
        Logic lobj = new Logic();
        lobj.SumEvenOddDigit(123456);
    }
}
////////////////////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handeld by This Application
//
//  Input   :   123456    Output  :     Sum of all Even Number is : 12   
//                                      Sum of all Odd Numner is : 9
//
////////////////////////////////////////////////////////////////////////////