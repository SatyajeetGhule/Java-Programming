////////////////////////////////////////////////////////////////////////////
//
//  Class Name    :    Logic
//  Method Name   :    CheckPrime
//  Description   :    Check Number is Prime or Not and disaplay on screen
//  Input         :    Integer
//  Output        :    Void
//  Author        :    Satyajeet Manohar Ghule
//  Date          :    31/10/2025
//
////////////////////////////////////////////////////////////////////////////

class Logic
{
    void CheckPrime(int iNo)
    {
        if(iNo <= 1)
        {
            System.out.println(iNo+" Number is Not Prime");
        }
        int iFreqancy = 0;
        for(int iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                iFreqancy++;
            }
        }
        if (iFreqancy == 2)
        {
            System.out.println(iNo+" Is Prime Number");   
        }
        else
        {
            System.out.println(iNo+" Is Not Prime Number");
        }
    }
}
////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program3_1
//  Method Name     :   main
//  Description     :   Entry point Function for the Application
//
////////////////////////////////////////////////////////////////////////////

class Program3_1
{
    public static void main(String[] args)
    {
        Logic lobj = new Logic();
        lobj.CheckPrime(11);
    }
}
////////////////////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handeld by This Application
//
//  Input   :    11   Output  :     11 Is Not Prime Number
//
////////////////////////////////////////////////////////////////////////////