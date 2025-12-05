////////////////////////////////////////////////////////////////////////////
//
//  Package / Import Section 
//
////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////
//
//  Function Name :    CheckSpecial
//  Description   :    Accept charecter from user and check whether it is 
//                     special symbol or not (!, @, #, $, %, ^, &, *).                     
//  Input         :    Character
//  Output        :    Boolean
//  Author        :    Satyajeet Manohar Ghule
//  Date          :    04/12/2025
//
////////////////////////////////////////////////////////////////////////////

class Pattern
{
    boolean CheckSpecial(char ch)
{
    if((ch == '!') || (ch == '@') || (ch == '#') || (ch == '$') || (ch == '%') || (ch == '^') || (ch == '&') || (ch == '*'))
    {
        return true;
    }
    else
    {
        return false;
    }
}
}

////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program15_4
//  Method Name     :   main
//  Description     :   Entry point Function for the Application
//
////////////////////////////////////////////////////////////////////////////

class Program15_4
{
    public static void main(String[] args)
    {
        Pattern pobj = new Pattern();
        char cValue = '\0';
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter a Character:");
        cValue = sobj.next().charAt(cValue);

        bRet = pobj.CheckSpecial(cValue);

        if (bRet == true)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}

////////////////////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handeld by This Application
//
//  Input   :   @  Output  :  True
//  Input   :   8  Output  :  False
//  Input   :   A  Output  :  False
//
////////////////////////////////////////////////////////////////////////////