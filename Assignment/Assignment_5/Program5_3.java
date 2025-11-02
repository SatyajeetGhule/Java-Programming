////////////////////////////////////////////////////////////////////////////
//
//  Package / Import Section 
//
////////////////////////////////////////////////////////////////////////////

////////////////////////////////////////////////////////////////////////////
//
//  Class Name    :    Logic
//  Method Name   :    CheckPerfect
//  Description   :    Disaplay on screen print check whether number is 
//                     perfect or Not.
//  Input         :    Integer
//  Output        :    Void
//  Author        :    Satyajeet Manohar Ghule
//  Date          :    01/10/2025
//
////////////////////////////////////////////////////////////////////////////

class Logic
{
    void CheckPerfect(int iNo)
    {
        int iSum = 0;

        for(int iCnt = 1; iCnt <= (iNo/2); iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                iSum = iSum + iCnt;
            }
        }
        if(iSum == iNo)
        {
            System.out.println(iNo+" : Is Perfect Number");
        }
        else
        {
            System.out.println(iNo+" : Is Not Perfect Number");
        }
    }
}
////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program5_3
//  Method Name     :   main
//  Description     :   Entry point Function for the Application
//
////////////////////////////////////////////////////////////////////////////

class Program5_3
{
    public static void main(String[] args)
    {
        Logic lobj = new Logic();
        lobj.CheckPerfect(6);
    }
}
////////////////////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handeld by This Application
//
//  Input   :   6   Output  :   6 : Is Perfect Number
//
////////////////////////////////////////////////////////////////////////////