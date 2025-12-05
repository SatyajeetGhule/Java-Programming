////////////////////////////////////////////////////////////////////////////
//
//  Package / Import Section 
//
////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////
//
//  Function Name :    CheckAlphabet
//  Description   :    Accept character from user and check whether it is   
//                     alphabet or not.
//  Input         :    Character
//  Output        :    Boolean (print String)
//  Author        :    Satyajeet Manohar Ghule
//  Date          :    04/12/2025
//
////////////////////////////////////////////////////////////////////////////

class Pattern
{
    boolean CheckAlphabet(char ch)
    {
        if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
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
//  Class Name      :   Program14_1
//  Method Name     :   main
//  Description     :   Entry point Function for the Application
//
////////////////////////////////////////////////////////////////////////////

class Program14_1
{
    public static void main(String[] args)
    {
        Pattern pobj = new Pattern();
        char cValue = '\0';
        boolean bRet = false;
        
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter a Character :");
        cValue = sobj.next().charAt(cValue);

        bRet = pobj.CheckAlphabet(cValue);

        if(bRet == true)
        {
            System.out.println(cValue+" It is an Alphabet ");
        }
        else
        {
            System.out.println(cValue+" It is not an Alphabet ");
        }

            sobj.close();
        }
}

////////////////////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handeld by This Application
//
//  Input   :   A  Output  :  A It is an Alphabet
//  Input   :   z  Output  :  z It is an Alphabet
//  Input   :   5  Output  :  5 It is not an Alphabet
//  Input   :   %  Output  :  % It is not an Alphabet
//
////////////////////////////////////////////////////////////////////////////
