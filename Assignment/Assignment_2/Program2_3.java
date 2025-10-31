////////////////////////////////////////////////////////////////////////////
//
//  Class Name    :    Logic
//  Method Name   :    FindMax
//  Description   :    Disaplay on screen find the Maximum of Two Numbers.
//  Input         :    Integer, Integer
//  Output        :    Void
//  Author        :    Satyajeet Manohar Ghule
//  Date          :    30/10/2025
//
////////////////////////////////////////////////////////////////////////////

class Logic 
{
    void FindMax(int iNo1, int iNo2)
    {
        if(iNo1 >= iNo2)
        {
            System.out.println(iNo1+" Is Maximum Number");
        }
        else 
        {
            System.out.println(iNo2+" Is Maximum Number");
        }
    }
}
////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Programt2_3
//  Method Name     :   main
//  Description     :   Entry point Function for the Application
//
////////////////////////////////////////////////////////////////////////////

class Program2_3
{
    public static void main(String[] args)
    {
        Logic lobj = new Logic();
        lobj.FindMax(20, 15);
    }
}
////////////////////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handeld by This Application
//
//  Input   :   20    Output  : 20 Is Maximum Number
//
////////////////////////////////////////////////////////////////////////////