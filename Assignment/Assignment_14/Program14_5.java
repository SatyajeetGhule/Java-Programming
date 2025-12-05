////////////////////////////////////////////////////////////////////////////
//
//  Package / Import Section 
//
////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////
//
//  Function Name :    DisplaySchedule
//  Description   :    Accept charecter from user and depends on division
//                     display exam timing
//  Input         :    Character
//  Output        :    void (print String)
//  Author        :    Satyajeet Manohar Ghule
//  Date          :    04/12/2025
//
////////////////////////////////////////////////////////////////////////////

class Pattern
{
    void DisplaySchedule(char ch)
    {
        if(ch >= 'a' && ch <= 'z')
        {
            ch = (char)(ch - 32);
        }
        switch(ch)
        {
            case 'A'  :
                System.out.println("Your Exam at 7 AM");
                break;
            case 'B'  :
                System.out.println("Your Exam at 80 AM");
                break;
            case 'C' :
                System.out.println("Your Exam at 9:20 AM");
                break;
            case 'D' :
                System.out.println("Your Exam at 10:30 AM");
                break;
            default :
                System.out.println("Invalid Input...");
                break;
        }
    }
}


////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program14_5
//  Method Name     :   main
//  Description     :   Entry point Function for the Application
//
////////////////////////////////////////////////////////////////////////////

class Program14_5
{
    public static void main(String[] args)
    {
        Pattern pobj = new Pattern();
        char cValue = '\0';

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Your Division like (A, B, C, D):");
        cValue = sobj.next().charAt(cValue);

        pobj.DisplaySchedule(cValue);

        sobj.close();

    }
}

////////////////////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handeld by This Application
//
//  Input   :  a   Output  :  Your Exam at 7 AM.
//  Input   :  D   Output  :  Your Exam at 10:30 AM.
//  Input   :  g   Output  :  Invalid Input.
//  Input   :  5   Output  :  Invalid Input.
//
////////////////////////////////////////////////////////////////////////////