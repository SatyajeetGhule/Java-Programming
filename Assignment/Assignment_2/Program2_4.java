////////////////////////////////////////////////////////////////////////////
//
//  Class Name    :    Logic
//  Method Name   :    FindMin
//  Description   :    Given a Number from user and disaplay on screen
//                     Find the Minimum of three Numbers.
//  Input         :    Integer, Integer, Integer
//  Output        :    Void
//  Author        :    Satyajeet Manohar Ghule
//  Date          :    30/10/2025
//
////////////////////////////////////////////////////////////////////////////

class Logic
{
    void FindMin(int iNo1, int iNo2, int iNo3)
    {
        if( iNo1 <= iNo2 && iNo1 <= iNo3)
        {
            System.out.println(iNo1+" Is Minimum Mumber");
        }
        else if(iNo2 <= iNo1 && iNo2 <= iNo3)
        {
            System.out.println(iNo2+" Is Minimum Number");
        }
        else
        {
            System.out.println(iNo3+" Is Minimum Number");
        }
    }
}
////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program2_4
//  Method Name     :   main
//  Description     :   Entry point Function for the Application
//
////////////////////////////////////////////////////////////////////////////

class Program2_4
{
    public static void main(String[] args)
    {
        Logic lobj = new Logic();
        lobj.FindMin(3, 7, 2);
    }
}
////////////////////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handeld by This Application
//
//  Input   :   3 7 2    Output  :  2 Is Minimun Number
//
////////////////////////////////////////////////////////////////////////////