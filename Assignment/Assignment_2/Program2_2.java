////////////////////////////////////////////////////////////////////////////
//
//  Class Name    :    Logic
//  Method Name   :    CheckPolindrome
//  Description   :    Disaplay on screen check the number is Polindrome or Not.
//  Input         :    Integer
//  Output        :    Void
//  Author        :    Satyajeet Manohar Ghule
//  Date          :    30/10/2025
//
////////////////////////////////////////////////////////////////////////////

class Logic
{
    void CheckPolindrome(int iNo)
    {
        int iRevers = 0, iDigit = 0;
        int temp = 0;
        temp = iNo;
        while(iNo > 0)
        {
            iDigit = iNo % 10;
            iRevers = iRevers * 10 + iDigit;
            iNo /= 10;
        }
        if(temp == iRevers)
        {
            System.out.println("This Number is Plindrome");
        }
        else
        {
            System.out.println("This Number is Not Polindrome");
        }
    }
}
////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program2_2
//  Method Name     :   main
//  Description     :   Entry point Function for the Application
//
////////////////////////////////////////////////////////////////////////////
class Program2_2
{
    public static void main(String[] args)
    {
        Logic lobj = new Logic();
        lobj.CheckPolindrome(121);
    }
}
////////////////////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handeld by This Application
//
//  Input   : 121      Output  : This Number is Polindrome
//
////////////////////////////////////////////////////////////////////////////