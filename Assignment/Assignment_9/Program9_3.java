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
//                     disaplay ABCD.
//  Input         :    Integer
//  Output        :    Charecter
//  Author        :    Satyajeet Manohar Ghule
//  Date          :    22/11/2025
//
////////////////////////////////////////////////////////////////////////////

class Pattern
{
    void PatternPrint(int iRow, int iCol)
    {
        int i = 0, j = 0;
        char ch = '\0';
        ch = 'A';
        for(i = 1; i <= iRow; i++,ch++)
        {            
            for(j = 1; j <= iCol; j++)
            {                
                System.out.print(ch+"\t");                
            }
            System.out.println();
        }        
    }
}

////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program9_3
//  Method Name     :   main
//  Description     :   Entry point Function for the Application
//
////////////////////////////////////////////////////////////////////////////

class Program9_3
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
//          Rows    :   3           A   A   A   A
//          Columns :   4           B   B   B   B
//                                  C   C   C   C
//
//  Input   :                   Output  :
//          Rows    :   6           A   A   A   A   A   A  
//          Columns :   6           B   B   B   B   B   B
//                                  C   C   C   C   C   C
//                                  D   D   D   D   D   D
//                                  E   E   E   E   E   E
//                                  F   F   F   F   F   F 
//
////////////////////////////////////////////////////////////////////////////