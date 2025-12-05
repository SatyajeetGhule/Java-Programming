////////////////////////////////////////////////////////////////////////////
//
//  Package / Import Section 
//
////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////
//
//  Function Name :    StrCpyRev
//  Description   :    Accept string from user and copy that characters of
//                     that string into another string in reverse order.
//  Input         :    String
//  Output        :    String
//  Author        :    Satyajeet Manohar Ghule
//  Date          :    05/12/2025
//
////////////////////////////////////////////////////////////////////////////

class Pattern
{
   String StrCpyRev(String str)
    {
        char[] arr = str.toCharArray();
        char[] brr = new char[arr.length];

        int start = 0;
        int end = arr.length - 1;

        while(end >= 0)
        {
            brr[start] = arr[end];
            start++;
            end--;
        }

        return new String(brr);
    }
}

////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program19_1
//  Method Name     :   main
//  Description     :   Entry point Function for the Application
//
////////////////////////////////////////////////////////////////////////////

class Program19_1
{
    public static void main(String[] args)
    {
        Pattern pobj = new Pattern();
        String sValue = null;
        String sRet = null;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter a String:");
        sValue = sobj.nextLine();

        sRet = pobj.StrCpyRev(sValue);
        System.out.println("Copied (Reverse Order) String : " +sRet);
        
        sobj.close();
    }
}

////////////////////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handeld by This Application
//
//  Input   :   Satya   Output  :   aytaS
//  Input   :   ABCD    Output  :   DCBA
//  Input   :   abba   Output  :    abba
//
////////////////////////////////////////////////////////////////////////////
