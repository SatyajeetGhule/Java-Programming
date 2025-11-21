////////////////////////////////////////////////////////////////////////////
//
//  Package / Import Section 
//
////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////
//
//  Function Name :    Pattern
//  Description   :    Accept Number from user and disaplay revers number 
//                     up to 1 and each number in between print #.
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
        for(int iCnt = iNo; iCnt >= 1; iCnt--)
        {
            System.out.print(iCnt+"\t#\t");  
        }
        System.out.println();
    }
}

////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program7_2
//  Method Name     :   main
//  Description     :   Entry point Function for the Application
//
////////////////////////////////////////////////////////////////////////////

class Program7_2
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
//  Input   :  5    Output  :   5 # 4 # 3 # 2 # 1 #
//  Input   :  3    Output  :   3 # 2 # 1 #
//  Input   :  8    Output  :   8 # 7 # 6 # 5 # 4 # 3 # 2 # 1 #
//
////////////////////////////////////////////////////////////////////////////