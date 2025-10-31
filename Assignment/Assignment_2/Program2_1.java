////////////////////////////////////////////////////////////////////////////
//
//  Class Name    :    Logic
//  Method Name   :    SumofDigit
//  Description   :    Disaplay on screen find the sum of digit of a number.
//  Input         :    Integer
//  Output        :    Void
//  Author        :    Satyajeet Manohar Ghule
//  Date          :    30/10/2025
//
////////////////////////////////////////////////////////////////////////////

class Logic
{
    void SumofDigit(int iNo)
    {
        int iDigit = 0, iCnt = 0;

        while(iNo > 0)
        {
            iDigit = iNo % 10;
            
            iCnt  += iDigit;
            iNo /= 10;
        }
        System.out.println(iCnt);    
    }
}
////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program2_1
//  Method Name     :   main
//  Description     :   Entry point Function for the Application
//
////////////////////////////////////////////////////////////////////////////

class Program2_1
{
    public static void main(String[] args)
    {
        Logic lobj = new Logic();
        lobj.SumofDigit(1234);
    }
}
////////////////////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handeld by This Application
//
//  Input   :   1234    Output  :   10
//
////////////////////////////////////////////////////////////////////////////