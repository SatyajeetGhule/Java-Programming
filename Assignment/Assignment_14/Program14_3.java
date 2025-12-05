////////////////////////////////////////////////////////////////////////////
//
//  Package / Import Section 
//
////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////
//
//  Function Name :    CheckDigit
//  Description   :    Accept character from user and check whether it is
//                     Digit or not.
//  Input         :    Character
//  Output        :    Boolean (print String)
//  Author        :    Satyajeet Manohar Ghule
//  Date          :    04/12/2025
//
////////////////////////////////////////////////////////////////////////////

class Pattern
{
    boolean CheckDigit(char ch)
    {
        if(ch >= '0' && ch <= '9')
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
//  Class Name      :   Program14_3
//  Method Name     :   main
//  Description     :   Entry point Function for the Application
//
////////////////////////////////////////////////////////////////////////////

class Program14_3
{
    public static void main(String[] args)
    {
        Pattern pobj = new Pattern();
        char cValue = '\0';
        boolean bRet = false;
        
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter a Digit :");
        cValue = sobj.next().charAt(cValue);

        bRet = pobj.CheckDigit(cValue);

        if(bRet == true)
        {
            System.out.println(cValue+" It is a Digit");
        }
        else if(bRet == false)
        {
            System.out.println(cValue+" It is not a Digit");
        }

        sobj.close();

    }
}

////////////////////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handeld by This Application
//
//  Input   :  3   Output  :  3 It is a Digit
//  Input   :  S   Output  :  S It is not a Digit
//  Input   :  $   Output  :  $ It is not a Digit
//
////////////////////////////////////////////////////////////////////////////