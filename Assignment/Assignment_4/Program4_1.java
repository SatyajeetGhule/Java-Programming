////////////////////////////////////////////////////////////////////////////
//
//  Package / Import Section 
//
////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////
//
//  Class Name    :    Logic
//  Method Name   :    CheckLeapYear
//  Description   :    Disaplay on screen and Check whether a given year
//                     is Leap year or Not.
//  Input         :    Integer
//  Output        :    Void
//  Author        :    Satyajeet Manohar Ghule
//  Date          :    31/10/2025
//
////////////////////////////////////////////////////////////////////////////

class Logic
{
    void CheckLeapYear(int iNo)
    {
        if((iNo % 400 == 0) || ((iNo % 4 == 0) && (iNo % 100 != 0)))
        {
            System.out.println(iNo+" Is Leap Year");
        }
        else
        {
            System.out.println(iNo+" Is Not Leap Year");
        }
    }
}
////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program4_1
//  Method Name     :   main
//  Description     :   Entry point Function for the Application
//
////////////////////////////////////////////////////////////////////////////

class Program4_1
{
    public static void main(String[] args)
    {
        int iYear = 0;

        System.out.println("Enter a Year :");
        Scanner sobj = new Scanner(System.in);
        iYear = sobj.nextInt();

        Logic lobj = new Logic();
        lobj.CheckLeapYear(iYear);
        sobj.close();
    }
}
////////////////////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handeld by This Application
//
//  Input   :   82       Output  :    82 Is Not Leap Year
//  Input   :   1900     Output  :    1900 Is Not Leap Year
//  Input   :   2024     Output  :    2024 Is Leap Year
//  Input   :   2000     Output  :    2000 Is Leap 
//
////////////////////////////////////////////////////////////////////////////