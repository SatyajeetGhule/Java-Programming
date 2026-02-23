////////////////////////////////////////////////////////////////////////////
//
//  Package / Import Section
//  Description : Imports required Java classes
//
////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Matrix
//  Description     :   This class performs all matrix related operations
//                      1) Accept matrix elements
//                      2) Display matrix
//                      3) Add diagonal elements
//
////////////////////////////////////////////////////////////////////////////

class Matrix
{
    public int Arr[][];     // 2D array to store matrix elements
    public int iRow;        // Number of rows
    public int iCol;        // Number of columns

    ////////////////////////////////////////////////////////////////////////////
    //
    //  Constructor Name :   Matrix
    //  Description      :   Allocates memory for matrix dynamically
    //  Input            :   Number of rows and columns
    //
    ////////////////////////////////////////////////////////////////////////////

    public Matrix(int a, int b)
    {
        this.iRow = a;
        this.iCol = b;

        // Allocate memory for matrix
        Arr = new int[iRow][iCol];
    }

    ////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name :   Accept
    //  Description :   Accepts matrix elements from user
    //  Input       :   Scanner object
    //  Output      :   Fills matrix with user input
    //
    ////////////////////////////////////////////////////////////////////////////

    public void Accept(Scanner sobj)
    {
        int i = 0, j = 0;

        if(iRow != iCol)
        {
            System.out.println("Please Enter the Same Number for Row as will as Column");
            return;
        }
        System.out.println("Enter the elements of matrix:");
        for(i = 0; i < iRow; i++)
        {
            System.out.println("Enter elements of Row " + (i + 1));
            for(j = 0; j < iCol; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }
    }

    ////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name :   Display
    //  Description :   Displays matrix elements
    //  Input       :   --
    //  Output      :   Prints matrix on screen
    //
    ////////////////////////////////////////////////////////////////////////////

    public void Display()
    {
        int i = 0, j = 0;

        System.out.println("Matrix elements are:");
        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                System.out.print(Arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    ////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name :   ReverseRow
    //  Description :   Accept matrix and reverse the contents of each row.
    //  Input       :   Accept Integer Number from user
    //  Output      :   Returns Reversw Row contents
    //
    ////////////////////////////////////////////////////////////////////////////

    public void ReverseRow()
    {
        System.out.println("After Reverse Row contents");

        for(int i = 0; i < iRow; i++)
            {
            for(int j = iCol-1; j >= 0; j--)
            {
                System.out.print(Arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}

////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program29_2
//  Description     :   Accept matrix and reverse the contents of each row.
//  Author          :   Satyajeet Manohar Ghule
//  Date            :   23/02/2026
//
////////////////////////////////////////////////////////////////////////////

class Program29_2
{
    ////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name :   main
    //  Description :   Entry point of application
    //                  Creates Matrix object
    //                  Accepts input
    //                  Displays Reverse Row contents
    //
    ////////////////////////////////////////////////////////////////////////////

    public static void main(String args[])
    {
        //int iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of rows and columns:");
        int row = sobj.nextInt();
        int col = sobj.nextInt();

        // Create Matrix object
        Matrix mobj = new Matrix(row, col);
        
        // Accept matrix elements
        mobj.Accept(sobj);

        // Display matrix
        mobj.Display();

        // Reversw Row contents
        mobj.ReverseRow();

        sobj.close();
    }
}

////////////////////////////////////////////////////////////////////////////
//
//  Test Case
//
//  Input:
//  1   2   3   4
//  5   6   7   8
//  9   10  11  12
//  13  14  15  16
//  
//  
//  Output:
//  After Swaping value
//  Matrix elements are:
//  4       3       2       1
//  8       7       6       5
//  12      11      10      9
//  16      15      14      13
//
////////////////////////////////////////////////////////////////////////////