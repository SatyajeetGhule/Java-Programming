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
        iNo = 1;
        for(i = 1; i <= iRow; i++)
        {
        for( j = 1; j <= iCol; j++,iNo++)
        {                
            System.out.print(iNo+"\t");                
        }
            System.out.println();
        }        
    }
}

////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program9_5
//  Method Name     :   main
//  Description     :   Entry point Function for the Application
//
////////////////////////////////////////////////////////////////////////////

class Program9_5
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
//          Rows    :   3           1    2   3   4
//          Columns :   4           5    6   7   8
//                                  9    10  11  12
//
//  Input   :                   Output  :
//          Rows    :   6           1   2   3   4   5   6       
//          Columns :   6           7   8   9   10  11  12
//                                  13  14  15  16  17  18
//                                  19  20  21  22  23  24
//                                  25  26  27  28  29  30
//                                  31  32  33  34  35  36 
//
////////////////////////////////////////////////////////////////////////////