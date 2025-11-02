////////////////////////////////////////////////////////////////////////////
//
//  Package / Import Section 
//
////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;
////////////////////////////////////////////////////////////////////////////
//
//  Class Name    :    Logic
//  Method Name   :    FindLargestDigit
//  Description   :    Givena a Number from user and Disaplay on screen find 
//                     a largest digit in that number.
//  Input         :    Integer
//  Output        :    Void
//  Author        :    Satyajeet Manohar Ghule
//  Date          :    01/10/2025
//
////////////////////////////////////////////////////////////////////////////

class Logic
{
    void FindLargestDigit(int iNo)
    {
        int iDigit = 0, iMax = 0, iTemp = 0;
        iTemp = iNo;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            
            if(iDigit > iMax)
            {
                iMax = iDigit;
            }
            iNo = iNo / 10;            
        }
        System.out.println(iTemp+", In that number Largest Digit is : "+iMax);
    }
}
////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program5_4
//  Method Name     :   main
//  Description     :   Entry point Function for the Application
//
////////////////////////////////////////////////////////////////////////////

class Program5_4
{
    public static void main(String[] args)
    {
        int iValue = 0;

        System.out.println("Enter a number :");
        Scanner sobj = new Scanner(System.in);

        iValue = sobj.nextInt();

        Logic lobj = new Logic();
        lobj.FindLargestDigit(iValue);
        sobj.close();
    }
}
////////////////////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handeld by This Application
//
//  Input   :   45938   Output  :  45938, In that Number Largest digit is : 9
//  Input   :   83429   Output  :  83429, In that number Largest digit is : 9
//  Input   :   32546   Output  :  32546. In that number Largest digit is : 6
//
////////////////////////////////////////////////////////////////////////////