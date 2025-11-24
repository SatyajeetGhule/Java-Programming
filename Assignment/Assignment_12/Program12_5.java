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
//                     disaplay number.
//  Input         :    Integer
//  Output        :    Integer
//  Author        :    Satyajeet Manohar Ghule
//  Date          :    24/11/2025
//
////////////////////////////////////////////////////////////////////////////

class Pattern
{
    void PatternPrint(int iRow, int iCol)
    {
        int i = 0, j = 0;
        
        if(iRow != iCol)
        {
            System.out.println("Invalid Input...\n");
            System.out.println("Row Number and Column number should be same...\n");
            return;
        }
        for(i = 1; i <= iRow; i++)
        {
            for(j = 1; j <= iCol; j++)
            {
                if(i == j || (i < j))
                {
                    System.out.print(j+"\t");
                }
                else
                {
                    System.out.print("\t");
                }
            }
            System.out.println();              
        }
    }       
}


////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program12_5
//  Method Name     :   main
//  Description     :   Entry point Function for the Application
//
////////////////////////////////////////////////////////////////////////////

class Program12_5
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
//          Rows    :   4           1   2   3   4      
//          Columns :   4               2   3   4
//                                          3   4
//                                              4
//                                          
//
//  Input   :                   Output  :
//          Rows    :   6           1   2   3   4   5   6
//          Columns :   6               2   3   4   5   6
//                                          3   4   5   6
//                                              4   5   6
//                                                  5   6
//                                                      6
//
////////////////////////////////////////////////////////////////////////////