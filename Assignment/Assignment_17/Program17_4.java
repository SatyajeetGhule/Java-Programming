////////////////////////////////////////////////////////////////////////////
//
//  Package / Import Section 
//
////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////
//
//  Function Name :    DisplayDigit
//  Description   :    accept string from user and display only digits
//                     from that string.
//  Input         :    String
//  Output        :    void (print String)
//  Author        :    Satyajeet Manohar Ghule
//  Date          :    04/12/2025
//
////////////////////////////////////////////////////////////////////////////

class Pattern
{
    void DisplayDigit(String str)
    {
        for(int iCnt = 0; iCnt < str.length(); iCnt++)
        {
            char ch = str.charAt(iCnt);

            if(ch >= '0' && ch <= '9')
            {
                System.out.print(ch);
            }            
        }             
    }
}

////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program17_4
//  Method Name     :   main
//  Description     :   Entry point Function for the Application
//
////////////////////////////////////////////////////////////////////////////

class Program17_4
{
    public static void main(String[] args)
    {
        Pattern pobj = new Pattern();
        String sValue = null;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter a String:");
        sValue = sobj.nextLine();

        pobj.DisplayDigit(sValue);
        sobj.close();
    }
}

////////////////////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handeld by This Application
//
//  Input   :   MarvellouS123           Output  :   123
//  Input   :   X1y2z3                  Output  :   123
//
////////////////////////////////////////////////////////////////////////////