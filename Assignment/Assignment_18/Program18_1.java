////////////////////////////////////////////////////////////////////////////
//
//  Package / Import Section 
//
////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////
//
//  Function Name :    CheckChar
//  Description   :    accept string from user and accept one character.
//                     Check whether that character is present in string or not.
//  Input         :    String, Charecter
//  Output        :    Boolean (Print String)
//  Author        :    Satyajeet Manohar Ghule
//  Date          :    04/12/2025
//
////////////////////////////////////////////////////////////////////////////

class Pattern
{
    boolean CheckChar(String str, char ch)
    {
        int iCnt = 0;
        for(iCnt = 0; iCnt < str.length(); iCnt++)
        {
            if(str.charAt(iCnt) == ch)
            {
                return true;
            }            
        }
        return false;             
    }
}

////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program18_1
//  Method Name     :   main
//  Description     :   Entry point Function for the Application
//
////////////////////////////////////////////////////////////////////////////

class Program18_1
{
    public static void main(String[] args)
    {
        Pattern pobj = new Pattern();
        String sValue = null;
        char cValue = '\0';
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter a String:");
        sValue = sobj.nextLine();

        System.out.println("Enter a Charecter:");
        cValue = sobj.next().charAt(cValue);

        bRet = pobj.CheckChar(sValue, cValue);
        if(bRet == true)
        {
            System.out.println("Charecter Found : "+cValue);
        }
        else
        {
            System.out.println("Charecter not Found : "+cValue);
        }
        sobj.close();
    }
}

////////////////////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handeld by This Application
//
//  Input   :                           Output  :    
//          Enter a String :                    Charecter Found : 2 
//            Satyajeet123                                          
//          
//          Enter a Charecter :
//              2
//
//  Input   :                           Output  :
//          Enter a String :                    Charecter not Found : Z 
//            Satyajeet                                          
//          
//          Enter a Charecter :
//              Z
//
////////////////////////////////////////////////////////////////////////////
