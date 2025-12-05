////////////////////////////////////////////////////////////////////////////
//
//  Package / Import Section 
//
////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////
//
//  Function Name :    CheckCapital
//  Description   :    Accept charecter from user and check whether it is    
//                     chapital or not.
//  Input         :    Charecter
//  Output        :    Charecter ( print String)
//  Author        :    Satyajeet Manohar Ghule
//  Date          :    04/12/2025
//
////////////////////////////////////////////////////////////////////////////

class Pattern
{
    boolean CheckCapital(char ch)
    {
        if(ch >= 'A' && ch <= 'Z')
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
//  Class Name      :   Program14_2
//  Method Name     :   main
//  Description     :   Entry point Function for the Application
//
////////////////////////////////////////////////////////////////////////////

class Program14_2
{
    public static void main(String[] args)
    {
        Pattern pobj = new Pattern();
        char cValue = '\0';
        boolean bRet = false;
        
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter a Character :");
        cValue = sobj.next().charAt(cValue);

        bRet = pobj.CheckCapital(cValue);

        if(bRet == true)
        {
            System.out.println(cValue+" It is Capital Character");
        }
        else if(bRet == false)
        {
            System.out.println(cValue+" It is not Capital Charecter");
        }

        sobj.close();

    }
}

////////////////////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handeld by This Application
//
//  Input   :   S  Output  :  S It is Capital Character
//  Input   :   @  Output  :  @ It is not Capital Charecter
//  Input   :   3  Output  :  3 It is not Capital Charecter
//
////////////////////////////////////////////////////////////////////////////