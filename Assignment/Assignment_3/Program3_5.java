////////////////////////////////////////////////////////////////////////////
//
//  Package / Import Section 
//
////////////////////////////////////////////////////////////////////////////

////////////////////////////////////////////////////////////////////////////
//
//  Class Name    :    Logic
//  Method Name   :    CheckSign
//  Description   :    Disaplay on screen and check whether a number is 
//                     positive, negative, or zero.
//  Input         :    Integer
//  Output        :    Void
//  Author        :    Satyajeet Manohar Ghule
//  Date          :    31/10/2025
//
////////////////////////////////////////////////////////////////////////////

class Logic
{
    void CheckSign(int iNo)
    {
        if(iNo >= 1)
        {
            System.out.println("Number is Positive : "+iNo);
        }
        else if(iNo < 0)
        {
            System.out.println("Number is Negative : "+iNo);
        }
        else
        {
            System.out.println("Number is Zero : "+iNo);
        }
    }
}
////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program3_5
//  Method Name     :   main
//  Description     :   Entry point Function for the Application
//
////////////////////////////////////////////////////////////////////////////

class Program3_5
{
    public static void main(String[] args)
    {
        Logic lobj = new Logic();
        lobj.CheckSign(-8);
    }
}
////////////////////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handeld by This Application
//
//  Input   :    -8   Output  : Nimber is Negative : -8
//
////////////////////////////////////////////////////////////////////////////