////////////////////////////////////////////////////////////////////////////
//
//  Package / Import Section 
//
////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////
//
//  Function Name :    StrCpyToggle
//  Description   :    Accept string from user and copy that characters of
//                     that string into another string by toggling the case.
//  Input         :    String
//  Output        :    String
//  Author        :    Satyajeet Manohar Ghule
//  Date          :    05/12/2025
//
////////////////////////////////////////////////////////////////////////////

class Pattern
{
   String StrCpyToggle(String str)
    {
        StringBuilder newStr = new StringBuilder();

        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            
            if(ch >= 'A' && ch <= 'Z')
            {
                ch = (char)(ch + 32);
            }
            else if(ch >= 'a' && ch <= 'z')
            {
                ch = (char)(ch - 32);
            }
            newStr.append(ch);
        }
        return newStr.toString();
    }
}

////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program19_5
//  Method Name     :   main
//  Description     :   Entry point Function for the Application
//
////////////////////////////////////////////////////////////////////////////

class Program19_5
{
    public static void main(String[] args)
    {
        Pattern pobj = new Pattern();
        String sValue = null;
        String sRet = null;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter a String:");
        sValue = sobj.nextLine();

        sRet = pobj.StrCpyToggle(sValue);
        System.out.println("Old String is : "+sValue);
        System.out.println("String Converted into Toggle case : " +sRet);
        
        sobj.close();
    }
}

////////////////////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handeld by This Application
//
//  Input   :   Satyajeet GHULE     Output  :   sATYAJEET ghule
//  Input   :   MarvelLOUS Python   Output  :   mARVELlous pYTHON
//
////////////////////////////////////////////////////////////////////////////