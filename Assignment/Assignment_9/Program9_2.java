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
        char ch1 = '\0', ch2 = '\0';
        for(i = 1; i <= iRow; i++)
        {            
            for(j = 1, ch1 = 'a', ch2 = 'A'; j <= iCol; j++, ch1++, ch2++)
            {
                if(i % 2 == 0)
                {
                    System.out.print(ch1+"\t");
                }
                else
                {
                    System.out.print(ch2+"\t");
                }
            }
            System.out.println();
        }        
    }
}

////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program9_2
//  Method Name     :   main
//  Description     :   Entry point Function for the Application
//
////////////////////////////////////////////////////////////////////////////

class Program9_2
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
//          Rows    :   3           A   B   C   D
//          Columns :   4           a   b   c   d
//                                  A   B   C   D
//
//  Input   :                   Output  :
//          Rows    :   6           A   B   C   D   E   F  
//          Columns :   6           a   b   c   d   e   f 
//                                  A   B   C   D   E   F 
//                                  a   b   c   d   e   f 
//                                  A   B   C   D   E   F 
//                                  a   b   c   d   e   f 
//
////////////////////////////////////////////////////////////////////////////