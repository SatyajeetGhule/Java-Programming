////////////////////////////////////////////////////////////////////////////
//
//  Class Name    :    Logic
//  Method Name   :    CheckDivisible
//  Description   :    Disaplay on screen and Check whether Number is 
//                     Divided by 5 and 11 or Not
//  Input         :    Integer
//  Output        :    Void
//  Author        :    Satyajeet Manohar Ghule
//  Date          :    31/10/2025
//
////////////////////////////////////////////////////////////////////////////

class Logic
{
    void CheckDivisible(int iNo)
    {
        if((iNo % 5 == 0) && (iNo % 11 == 0))
        {
            System.out.println("Yes "+iNo+" Number is divisible by 5 and 11");
        }
        else
        {
            System.out.println("No "+iNo+" Number is Not Divisible by 5 and 11");
        }
    }
}
////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program4_3
//  Method Name     :   main
//  Description     :   Entry point Function for the Application
//
////////////////////////////////////////////////////////////////////////////

class Program4_3
{
    public static void main(String[] arg)
    {
        Logic lobj = new Logic();
        lobj.CheckDivisible(55);
    }
}
////////////////////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handeld by This Application
//
//  Input   :   55    Output  :     Yes 55 Number is Divisible by 5 and 11.
//
////////////////////////////////////////////////////////////////////////////