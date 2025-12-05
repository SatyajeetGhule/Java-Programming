////////////////////////////////////////////////////////////////////////////
//
//  Package / Import Section 
//
////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////
//
//  Function Name :    CheckSmall
//  Description   :    Accept character from user and check whether it is
//                     check small case or not.
//  Input         :    Character
//  Output        :    Boolean (print String)
//  Author        :    Satyajeet Manohar Ghule
//  Date          :    04/12/2025
//
////////////////////////////////////////////////////////////////////////////

class Pattern
{
    boolean CheckSamll(char ch)
    {
        if(ch >= 'a' && ch <= 'z')
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
//  Class Name      :   Program14_4
//  Method Name     :   main
//  Description     :   Entry point Function for the Application
//
////////////////////////////////////////////////////////////////////////////

class Program14_4
{
    public static void main(String[] args)
    {
        Pattern pobj = new Pattern();
        char cValue = '\0';
        boolean bRet = false;
        
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter a Character :");
        cValue = sobj.next().charAt(cValue);

        bRet = pobj.CheckSamll(cValue);

        if(bRet == true)
        {
            System.out.println(cValue+" It is Small Character");
        }
        else if(bRet == false)
        {
            System.out.println(cValue+" It is not Small Character");
        }

        sobj.close();

    }
}

////////////////////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handeld by This Application
//
//  Input   :  A   Output  :  A It is not Small Character
//  Input   :  s   Output  :  s It is Small Charecter
//  Input   :  0   Output  :  0 It is not Small Charecter
//
////////////////////////////////////////////////////////////////////////////