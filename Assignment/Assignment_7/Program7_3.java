////////////////////////////////////////////////////////////////////////////
//
//  Package / Import Section 
//
////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////
//
//  Function Name :    Pattern
//  Description   :    Accept Number from user and disaplay number 
//                     up to N number and print * in between each number.
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
        for(int iCnt = 1; iCnt <= iNo; iCnt++)
        {
            System.out.print(iCnt+"\t*\t");  
        }
        System.out.println();
    }
}

////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program7_3
//  Method Name     :   main
//  Description     :   Entry point Function for the Application
//
////////////////////////////////////////////////////////////////////////////

class Program7_3
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
//  Input   :  5    Output  :   1 * 2 * 3 * 4 * 5 *
//  Input   :  3    Output  :   1 * 2 * 3 *
//  Input   :  8    Output  :   1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 *
//
////////////////////////////////////////////////////////////////////////////