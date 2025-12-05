////////////////////////////////////////////////////////////////////////////
//
//  Package / Import Section 
//
////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////
//
//  Function Name :    Display
//  Description   :    Accept charecter from user, if charecter small display
//                     corresponding capital and if capital display small.
//  Input         :    Character
//  Output        :    void (print String)
//  Author        :    Satyajeet Manohar Ghule
//  Date          :    04/12/2025
//
////////////////////////////////////////////////////////////////////////////

class Pattern
{
    void Display(char ch)
    {
        if(ch >= 'A' && ch <= 'Z')
        {
            ch = (char)(ch + 32);
        }
        else if(ch >= 'a' && ch <= 'z')
        {
            ch = (char)(ch - 32);
        }
        System.out.println(ch);    
    }
}

////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program15_2
//  Method Name     :   main
//  Description     :   Entry point Function for the Application
//
////////////////////////////////////////////////////////////////////////////

class Program15_2
{
    public static void main(String[] args)
    {
        Pattern pobj = new Pattern();
        char cValue = '\0';

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
//  Input   :   s   Output  :   S
//  Input   :   A   Output  :   a
//  Input   :   %   Output  :   %
//  Input   :   5   Output  :   5
//
////////////////////////////////////////////////////////////////////////////