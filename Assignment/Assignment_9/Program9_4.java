////////////////////////////////////////////////////////////////////////////
//
//  Package / Import Section 
//
////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////
//
//  Function Name :    Pattern
//  Description   :    Accept Number for Rows and Column from user and 
//                     disaplay Number.
//  Input         :    Integer
//  Output        :    Integer
//  Author        :    Satyajeet Manohar Ghule
//  Date          :    22/11/2025
//
////////////////////////////////////////////////////////////////////////////

class Pattern
{
    void PatternPrint(int iRow, int iCol)
    {
        int i = 0, j = 0;
        int iNo = 0;
        iNo = iCol;
    for(i = iRow; i >= 1; i--,iNo--)
    {
        for( j = iCol; j >= 1; j--)
        {                
            System.out.print(iNo+"\t");                
        }
            System.out.println();
        }        
    }
}

////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program9_4
//  Method Name     :   main
//  Description     :   Entry point Function for the Application
//
////////////////////////////////////////////////////////////////////////////

class Program9_4
{
    public static void main(String[] args)
    {
        Pattern pobj = new Pattern();
        int iValue1 = 0, iValue2 = 0;
        
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter a number for Rows :");
        iValue1 = sobj.nextInt();

        System.out.println("Enter a number for Columns :");
        iValue2 = sobj.nextInt();

        pobj.PatternPrint(iValue1, iValue2);

        sobj.close();
    }
}

////////////////////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handeld by This Application
//
//  Input   :                   Output  :
//          Rows    :   3          3    3   3   3
//          Columns :   4          2    2   2   2
//                                 1    1   1   1
//
//  Input   :                   Output  :
//          Rows    :   6          6    6   6   6   6   6   
//          Columns :   6          5    5   5   5   5   5
//                                 4    4   4   4   4   4
//                                 3    3   3   3   3   3
//                                 2    2   2   2   2   2
//                                 1    1   1   1   1   1 
//
////////////////////////////////////////////////////////////////////////////