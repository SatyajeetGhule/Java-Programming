////////////////////////////////////////////////////////////////////////////
//
//  Package / Import Section 
//
////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////
//
//  Function Name :    Display
//  Description   :    Accept charecter from user. If it is capital then 
//                     display all the characters from the input characters 
//                     till Z. If input character is small then print all
//                     the characters in reverse order till a. In other cases
//                     return directly.                     
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
        char c = '\0';
        if(ch >= 'A' && ch <= 'Z')
        {
            for(c = ch; c <= 'Z'; c++)
            {
                System.out.print(c+"\t");
            }
        }
        else if(ch >= 'a' && ch <= 'z')
        {
            for(c = ch; c >= 'a'; c--)
            {
                System.out.print(c+"\t");
            }
        } 
    }
}

////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program15_3
//  Method Name     :   main
//  Description     :   Entry point Function for the Application
//
////////////////////////////////////////////////////////////////////////////

class Program15_3
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
//  Input   :   V  Output  :  v W X Y Z
//  Input   :   h  Output  :  h g f e d c b a
//  Input   :   4  Output  :  terminate code
//
////////////////////////////////////////////////////////////////////////////