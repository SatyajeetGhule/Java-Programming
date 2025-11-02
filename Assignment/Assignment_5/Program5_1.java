////////////////////////////////////////////////////////////////////////////
//
//  Class Name    :    Logic
//  Method Name   :    SumEvenNumber
//  Description   :    Disaplay on screen and print the sum of all even 
//                     numbers up to N
//  Input         :    Integer
//  Output        :    Void
//  Author        :    Satyajeet Manohar Ghule
//  Date          :    31/10/2025
//
////////////////////////////////////////////////////////////////////////////

class Logic
{
    void SumEvenNumber(int iNo)
    {
        int iCnt = 0, iSum = 0;
        
        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                iSum = iSum + iCnt;
            }
        }
        System.out.println(iSum);
    }
}
////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program5_1
//  Method Name     :   main
//  Description     :   Entry point Function for the Application
//
////////////////////////////////////////////////////////////////////////////

class Program5_1
{
    public static void main(String[] agr)
    {
        Logic lobj = new Logic();
        lobj.SumEvenNumber(10);
    }    
}
////////////////////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handeld by This Application
//
//  Input   :   10    Output  :     30
//
////////////////////////////////////////////////////////////////////////////