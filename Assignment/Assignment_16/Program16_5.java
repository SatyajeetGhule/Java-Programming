////////////////////////////////////////////////////////////////////////////
//
//  Package / Import Section 
//
////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////
//
//  Function Name :    Reverse
//  Description   :    which accept string from user and display it in
//                     reverse order.
//  Input         :    String
//  Output        :    void (print String)
//  Author        :    Satyajeet Manohar Ghule
//  Date          :    04/12/2025
//
////////////////////////////////////////////////////////////////////////////

class Pattern
{
    void Reverse(String str)
    {
        int start = 0;
        int end = str.length() - 1;

        while(end >= start)
        {
            System.out.print(str.charAt(end));
            end--;
        }        
    }
}

////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program16_5
//  Method Name     :   main
//  Description     :   Entry point Function for the Application
//
////////////////////////////////////////////////////////////////////////////

class Program16_5
{
    public static void main(String[] args)
    {
        Pattern pobj = new Pattern();
        String sValue = null;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter a String:");
        sValue = sobj.nextLine();

        pobj.Reverse(sValue);
        
        sobj.close();
    }
}

////////////////////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handeld by This Application
//
//  Input   :   “MarvellouS”        Output  :   “SuollevraM”
//  Input   :   "Xyz"               Output  :   "zyX"
//
////////////////////////////////////////////////////////////////////////////