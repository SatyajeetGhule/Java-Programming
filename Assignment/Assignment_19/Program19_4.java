////////////////////////////////////////////////////////////////////////////
//
//  Package / Import Section 
//
////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////
//
//  Function Name :    StrCpySmall
//  Description   :    Accept string from user and copy that characters of
//                     that string into another string by converting all capital
//                     characters into small case.
//  Input         :    String
//  Output        :    String
//  Author        :    Satyajeet Manohar Ghule
//  Date          :    05/12/2025
//
////////////////////////////////////////////////////////////////////////////

class Pattern
{
   String StrCpySmall(String str)
    {
        StringBuilder newStr = new StringBuilder();

        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            
            if(ch >= 'A' && ch <= 'Z')
            {
                ch = (char)(ch + 32);
            }
            newStr.append(ch);
        }
        return newStr.toString();
    }
}

////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program19_4
//  Method Name     :   main
//  Description     :   Entry point Function for the Application
//
////////////////////////////////////////////////////////////////////////////

class Program19_4
{
    public static void main(String[] args)
    {
        Pattern pobj = new Pattern();
        String sValue = null;
        String sRet = null;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter a String:");
        sValue = sobj.nextLine();

        sRet = pobj.StrCpySmall(sValue);
        System.out.println("Old String is : "+sValue);
        System.out.println("String Converted into Small case : " +sRet);
        
        sobj.close();
    }
}

////////////////////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handeld by This Application
//
//  Input   :   Satyajeet Ghule     Output  :   satyajeet ghule
//  Input   :   Marvellous Python   Output  :   marvellous python
//
////////////////////////////////////////////////////////////////////////////