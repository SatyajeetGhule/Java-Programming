////////////////////////////////////////////////////////////////////////////
//
//  Package / Import Section 
//
////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;
////////////////////////////////////////////////////////////////////////////
//
//  Class Name    :    Logic
//  Method Name   :    FindSmallestDigit
//  Description   :    Given a number from user  and Disaplay on screen  
//                     Find the Smallest digit in that number 
//  Input         :    Integer
//  Output        :    Void
//  Author        :    Satyajeet Manohar Ghule
//  Date          :    01/10/2025
//
////////////////////////////////////////////////////////////////////////////

class Logic
{
    void FindSmallestDigit(int iNo)
    {
        int iDigit = 0, iMin = 0, iTemp = 0;
        iMin = 9;
        iTemp = iNo;
        if(iNo <= 0)
        {
            iNo = -iNo;
        }
        while(iNo > 0)
        {
            iDigit = iNo % 10;

            if(iDigit < iMin)
            {
                iMin = iDigit;
            }
            iNo = iNo / 10;
        }
        System.out.println(iTemp+", In That Number Smallest Digit is : "+iMin);
    }
}
////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program5_5
//  Method Name     :   main
//  Description     :   Entry point Function for the Application
//
////////////////////////////////////////////////////////////////////////////

class Program5_5
{
    public static void main(String[] args)
    {
        int iValue = 0;

        System.out.println("Enter a Number :");
        Scanner sobj = new Scanner(System.in);
        iValue = sobj.nextInt();

        Logic lobj = new Logic();
        lobj.FindSmallestDigit(iValue);
        sobj.close();
    }
}
////////////////////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handeld by This Application
//
//  Input   :   45872  Output  :  45872, In that number Smallest digit is : 2
//  Input   :   52150  Output  :  52150. In that number smallest digit is : 0
//  Input   :   -2541  Output  :  -2541, In that number smallest digit is : 1
//
////////////////////////////////////////////////////////////////////////////
