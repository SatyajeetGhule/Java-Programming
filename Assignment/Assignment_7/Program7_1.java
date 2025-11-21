////////////////////////////////////////////////////////////////////////////
//
//  Package / Import Section 
//
////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////
//
//  Function Name :    Pattern
//  Description   :    Accept Number from user and disaplay ABCD Patten.
//  Input         :    Integer
//  Output        :    Charecter
//  Author        :    Satyajeet Manohar Ghule
//  Date          :    21/11/2025
//
////////////////////////////////////////////////////////////////////////////

class Pattern
{
    void PatternPrint(int iNo)
    {
        for(char cCnt = 'A'; cCnt <= ('A'+iNo)-1; cCnt++)
        {
            System.out.print(cCnt+"\t");  
        }
        System.out.println();
    }
}

////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program7_1
//  Method Name     :   main
//  Description     :   Entry point Function for the Application
//
////////////////////////////////////////////////////////////////////////////

class Program7_1
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
//  Input   :  5    Output  :   A B C D E
//  Input   :  3    Output  :   A B C
//  Input   :  8    Output  :   A B C D E F G H
//
////////////////////////////////////////////////////////////////////////////
