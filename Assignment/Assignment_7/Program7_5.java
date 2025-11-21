////////////////////////////////////////////////////////////////////////////
//
//  Package / Import Section 
//
////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////
//
//  Function Name :    Pattern
//  Description   :    Accept Number from user and disaplay table of number
//                     number 2 and print up to N number .
//  Input         :    Integer
//  Output        :    Integer
//  Author        :    Satyajeet Manohar Ghule
//  Date          :    21/11/2025
//
////////////////////////////////////////////////////////////////////////////

class Pattern
{
    void PatternPrint(int iNo)
    {
        int ans = 0;
        for(int iCnt = 1; iCnt <= iNo; iCnt++)
        {            
            ans = iCnt * 2;
            System.out.print(ans+"\t");  
        }
        System.out.println();
    }
}

////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program7_5
//  Method Name     :   main
//  Description     :   Entry point Function for the Application
//
////////////////////////////////////////////////////////////////////////////

class Program7_5
{
    public static void main(String[] args)
    {
        Pattern pobj = new Pattern();
        int iValue = 0;
        
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter a number of Frequency :");
        iValue = sobj.nextInt();

        pobj.PatternPrint(iValue);

        sobj.close();
    }
}

////////////////////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handeld by This Application
//
//  Input   :  5    Output  :   2 4 6 8 10
//  Input   :  3    Output  :   2 4 6
//  Input   :  8    Output  :   2 4 6 8 10 12 14 16
//
////////////////////////////////////////////////////////////////////////////