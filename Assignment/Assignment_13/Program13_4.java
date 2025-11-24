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
//                     disaplay '#', '$', and'*'.
//  Input         :    Integer
//  Output        :    Character
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
                if((i + j == (iCol+1)) || (i == 1) || (j == 1) || (j == iRow) || (i == iCol))
                {
                    System.out.print("*\t");
                }
                else if(i + j < iCol + 1)
                {
                    System.out.print("#\t");
                }
                else
                {
                    System.out.print("$\t");
                }
            }
            System.out.println();              
        }
    }       
}


////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program13_4
//  Method Name     :   main
//  Description     :   Entry point Function for the Application
//
////////////////////////////////////////////////////////////////////////////

class Program13_4
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
//          Rows    :   4           *   *   *   *      
//          Columns :   4           *   #   *   *
//                                  *   *   $   *
//                                  *   *   *   *
//                                          
//
//  Input   :                   Output  :
//          Rows    :   6           *   *   *   *   *   *
//          Columns :   6           *   #   #   #   *   *
//                                  *   #   #   *   $   *
//                                  *   #   *   $   $   *
//                                  *   *   $   $   $   *
//                                  *   *   *   *   *   *
//
////////////////////////////////////////////////////////////////////////////