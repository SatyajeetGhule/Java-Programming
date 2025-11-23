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
//                     disaplay number and *.
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
        
        for(i = 1; i <= iRow; i++)
        {
            for(j = 1; j <= iCol; j++)
            {
                if(i == 1 || j == 1 || i == iRow || j == iCol)
                {
                    System.out.print(j+"\t"); 
                }
                else
                {
                    System.out.print("*\t");
                }
            }
            System.out.println();              
        }
    }       
}


////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program11_5
//  Method Name     :   main
//  Description     :   Entry point Function for the Application
//
////////////////////////////////////////////////////////////////////////////

class Program11_5
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
//          Rows    :   5           1   2   3   4   5         
//          Columns :   4           1   *   *   *   5
//                                  1   *   *   *   5
//                                  1   2   3   4   5         
//
//  Input   :                   Output  :
//          Rows    :   6           1   2   3   4   5   6
//          Columns :   6           1   *   *   *   *   6
//                                  1   *   *   *   *   6
//                                  1   *   *   *   *   6
//                                  1   *   *   *   *   6
//                                  1   2   3   4   5   6
//
////////////////////////////////////////////////////////////////////////////