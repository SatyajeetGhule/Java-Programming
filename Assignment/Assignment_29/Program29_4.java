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
    //  Method Name :   ChkIdentity
    //  Description :   Accept matrix and check whether the matrix is identity 
    //                  matrix or not.
    //  Input       :   Accept Integer Number from user
    //  Output      :   Returns Check Matrix or not
    //
    ////////////////////////////////////////////////////////////////////////////

    public boolean ChkIdentity()
    {
        if(iRow != iCol)
        {
            return false;
        }

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                if(i == j)   // Diagonal elements
                {
                    if(Arr[i][j] != 1)
                    {
                        return false;
                    }
                }
                else         // Non-diagonal elements
                {
                    if(Arr[i][j] != 0)
                    {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}

////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program29_4
//  Description     :   Accept matrix and check whether the matrix is identity 
//                      matrix or not.
//  Author          :   Satyajeet Manohar Ghule
//  Date            :   23/02/2026
//
////////////////////////////////////////////////////////////////////////////

class Program29_4
{
    ////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name :   main
    //  Description :   Entry point of application
    //                  Creates Matrix object
    //                  Accepts input
    //                  Displays Check Matrix or not
    //
    ////////////////////////////////////////////////////////////////////////////

    public static void main(String args[])
    {
        boolean bRet = false;
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

        // Check MAtrix or not
        bRet = mobj.ChkIdentity();
        if(bRet == true)
        {
            System.out.println("Given matrix IS an Identity Matrix");
        }
        else
        {
            System.out.println("Given matrix IS Not an Identity Matrix");
        }

        sobj.close();
    }
}

////////////////////////////////////////////////////////////////////////////
//
//  Test Case
//
//  Input:
//  1 0 0 0
//  0 1 0 0
//  0 0 1 0
//  0 0 0 1 
//  
//  
//  Output:
//  After Reverse Column
//  Given matrix IS an Identity Matrix
//
////////////////////////////////////////////////////////////////////////////