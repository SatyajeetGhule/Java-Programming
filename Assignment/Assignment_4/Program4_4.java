////////////////////////////////////////////////////////////////////////////
//
//  Class Name    :    Logic
//  Method Name   :    PrintDigit
//  Description   :    Disaplay on screen and print each digit of a number
//                     Separately.
//  Input         :    Integer
//  Output        :    Void
//  Author        :    Satyajeet Manohar Ghule
//  Date          :    31/10/2025
//
////////////////////////////////////////////////////////////////////////////

class Logic
{
    void PrintDigit(int iNo)
    {
        int iDigit = 0, iRevers = 0;
        while(iNo != 0)
        {
            iDigit = iNo % 10;            
            iRevers = iRevers * 10 + iDigit;
            iNo = iNo / 10;
        }

        while (iRevers != 0)
        {
            iDigit = iRevers % 10;
            System.out.print(iDigit+"\t");
            iRevers = iRevers / 10;            
        }
    }
}
////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program4_4
//  Method Name     :   main
//  Description     :   Entry point Function for the Application
//
////////////////////////////////////////////////////////////////////////////

class Program4_4
{
    public static void main(String[] arg)
    {
        Logic lobj = new Logic();
        lobj.PrintDigit(9876);
    }
}
////////////////////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handeld by This Application
//
//  Input   :   9876    Output  : 9 8 7 6
//
////////////////////////////////////////////////////////////////////////////