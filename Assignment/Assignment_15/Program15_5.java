////////////////////////////////////////////////////////////////////////////
//
//  Package / Import Section 
//
////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////
//
//  Function Name :    Display
//  Description   :    Accept character from user and display its ASCII 
//                     value in decimal, octal and hexadecimal format.                     
//  Input         :    Character
//  Output        :    Charecter
//  Author        :    Satyajeet Manohar Ghule
//  Date          :    04/12/2025
//
////////////////////////////////////////////////////////////////////////////

class Pattern
{
    void Display(char ch)
    {
        int ascii = 0;
        if((ch >= 'a' && ch <= 'z') || ( ch >= 65 && ch <= 90))
        {
            ascii = (char)(ch - 32);
            System.out.println("Decimal : " + ascii);
        System.out.println("Octal : 0" + Integer.toOctalString(ascii));
        System.out.println("Hexadecimal : 0X" + Integer.toHexString(ascii).toUpperCase());
        }
    }
}

////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program15_5
//  Method Name     :   main
//  Description     :   Entry point Function for the Application
//
////////////////////////////////////////////////////////////////////////////

class Program15_5
{
    public static void main(String[] args)
    {
        Pattern pobj = new Pattern();
        char cValue = '\0';
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter a Character:");
        cValue = sobj.next().charAt(cValue);

        pobj.Display(cValue);

    }
}

////////////////////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handeld by This Application
//
//  Input   :   A   Output  :    Decimal : 65
//                               Octal : 0101
//                               Hrxadecimal : 0X41
//
//  Input   :   s   Output  :    Decimal : 83
//                               Octal : 0123
//                               Hrxadecimal : 0X53
//
//  Input   :   4   Output  :    Terminate code
//
////////////////////////////////////////////////////////////////////////////