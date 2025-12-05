////////////////////////////////////////////////////////////////////////////
//
//  Package / Import Section 
//
////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////
//
//  Function Name :    StrRevX
//  Description   :    Accept string from user and reverse that string in place.
//  Input         :    String
//  Output        :    String
//  Author        :    Satyajeet Manohar Ghule
//  Date          :    05/12/2025
//
////////////////////////////////////////////////////////////////////////////

class Pattern
{
    void StrRevX(String str)
    {
        char[] arr = str.toCharArray();
        int start = 0;
        int end = arr.length - 1;

        while(start < end)
        {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        System.out.println("Reversed String : " + new String(arr));           
    }
}

////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program18_5
//  Method Name     :   main
//  Description     :   Entry point Function for the Application
//
////////////////////////////////////////////////////////////////////////////

class Program18_5
{
    public static void main(String[] args)
    {
        Pattern pobj = new Pattern();
        String sValue = null;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter a String:");
        sValue = sobj.nextLine();

        pobj.StrRevX(sValue);
        
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