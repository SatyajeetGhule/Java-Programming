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
    //  Method Name :   AddColumn
    //  Description :   Accept matrix and display addition of elements From 
    //                  each column.
    //  Input       :   Accept Integer Number from user
    //  Output      :   Returns Addition of each Column
    //
    ////////////////////////////////////////////////////////////////////////////

    public void AddColumn()
    {
        
        for(int j = 0; j < iCol; j++)
        {   
            int iSum= 0;
            for(int i = 0; i < iRow; i++)
            {
                iSum = iSum + Arr[i][j];
            }
            System.out.println("Sum of column " + (j+ 1) + " is: " + iSum);
        }
    }
}

////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program28_4
//  Description     :   Accept matrix and display addition of elements From 
    //                  each column.
//  Author          :   Satyajeet Manohar Ghule
//  Date            :   22/02/2026
//
////////////////////////////////////////////////////////////////////////////

class Program28_4
{
    ////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name :   main
    //  Description :   Entry point of application
    //                  Creates Matrix object
    //                  Accepts input
    //                  Displays Addition of each Column
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

        // Addition of each Column
        mobj.AddColumn();

        sobj.close();
    }
}

////////////////////////////////////////////////////////////////////////////
//
//  Test Case
//
//  Input:
//  35  69
//  15  15
//  
//  
//  Output:
//  Sum of column 1 is: 50
//  Sum of column 2 is: 84
//
////////////////////////////////////////////////////////////////////////////