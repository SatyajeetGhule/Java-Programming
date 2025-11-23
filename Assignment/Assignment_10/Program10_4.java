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
//                     disaplay positive and negative number.
//  Input         :    Integer
//  Output        :    Integer
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

        for(i = 1; i <= iRow; i++)
        {
            for(j = 1, iNo = -1; j <= iCol; j++, iNo--)
            {
                if(i % 2 == 0)
                {      
                    System.out.print(iNo+"\t"); 
                }
                else
                {
                    System.out.print(j+"\t");
                }                
            }
            System.out.println();
        }       
    }
}

////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program10_4
//  Method Name     :   main
//  Description     :   Entry point Function for the Application
//
////////////////////////////////////////////////////////////////////////////

class Program10_4
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
//          Rows    :   3          1    2   3   4
//          Columns :   4         -1   -2  -3  -4
//                                 1    2   3   4
//
//  Input   :                   Output  :
//          Rows    :   6           1   2   3   4   5   6      
//          Columns :   6          -1  -2  -3  -4  -5  -6
//                                  1   2   3   4   5   6
//                                 -1  -2  -3  -4  -5  -6
//                                  1   2   3   4   5   6
//                                 -1  -2  -3  -4  -5  -6
//
////////////////////////////////////////////////////////////////////////////