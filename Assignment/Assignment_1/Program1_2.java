////////////////////////////////////////////////////////////////////////////
//
//  Class Name    :    Logic
//  Method Name   :    CheckEvenOdd
//  Description   :    disaplay on screen check N number is Even or Odd.
//  Input         :    Integer
//  Output        :    Void
//  Author        :    Satyajeet Manohar Ghule
//  Date          :    30/10/2025
//
////////////////////////////////////////////////////////////////////////////

class Logic
{
    void CheckEvenOdd(int iNo)
    {
        if((iNo % 2) == 0)
        {
            System.out.println(iNo+" Number is : Even Number");
        }
        else
        {
            System.out.println(iNo+" Number is : Odd Number");
        }
    }
}
////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program1_2
//  Method Name     :   main
//  Description     :   Entry point Function for the Application
//
////////////////////////////////////////////////////////////////////////////

class Program1_2
{
    public static void main(String[] args)
    {
        Logic lobj = new Logic();
        lobj.CheckEvenOdd(7);
    }
}
////////////////////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handeld by This Application
//
//  Input   :   7    Output  :  "7 Number is : Odd Number"
//
////////////////////////////////////////////////////////////////////////////