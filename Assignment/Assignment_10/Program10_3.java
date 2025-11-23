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
//                     disaplay 'abcd' and number.
//  Input         :    Integer
//  Output        :    Integer and Charecter
//  Author        :    Satyajeet Manohar Ghule
//  Date          :    23/11/2025
//
////////////////////////////////////////////////////////////////////////////

class Pattern
{
    void PatternPrint(int iRow, int iCol)
    {
        int i = 0, j = 0;
        int iNo = 0;
        char ch = '\0';
        for(i = 1; i <= iRow; i++)
        {
            for(j = 1, ch = 'a'; j <= iCol; j++, ch++)
            {
                if(i % 2 == 0)
                {      
                    System.out.print(j+"\t"); 
                }
                else
                {
                    System.out.print(ch+"\t");
                }                
            }
            System.out.println();
        }       
    }
}

////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program10_3
//  Method Name     :   main
//  Description     :   Entry point Function for the Application
//
////////////////////////////////////////////////////////////////////////////

class Program10_3
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
//          Rows    :   3           a   b   c   d
//          Columns :   4           1   2   3   4
//                                  a   b   c   d
//
//  Input   :                   Output  :
//          Rows    :   6           a   b   c   d   e   f      
//          Columns :   6           1   2   3   4   5   6
//                                  a   b   c   d   e   f
//                                  1   2   3   4   5   6
//                                  a   b   c   d   e   f
//                                  1   2   3   4   5   6 
//
////////////////////////////////////////////////////////////////////////////