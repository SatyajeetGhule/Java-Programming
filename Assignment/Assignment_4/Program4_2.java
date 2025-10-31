////////////////////////////////////////////////////////////////////////////
//
//  Class Name    :    Logic
//  Method Name   :    DisplayGrade
//  Description   :    Disaplay on screen grade of studant basde on marks
//  Input         :    Integer
//  Output        :    Void
//  Author        :    Satyajeet Manohar Ghule
//  Date          :    31/10/2025
//
////////////////////////////////////////////////////////////////////////////

class Logic
{
    void DisplayGrade(int iMarks)
    {
        if((iMarks >= 95) && (iMarks <= 100))
            {
                System.out.println("Grade : A+");
            }
        else if((iMarks >= 90) && (iMarks < 95))
        {            
            System.out.println("Grade : A");
        }
        else if((iMarks <= 90) && (iMarks >= 70) )
        {
            System.out.println("Grade : B+");
        }
        else if((iMarks >= 60) && (iMarks < 70))
        {
            System.out.println("Grade : B");
        }
        else if((iMarks >= 50) && (iMarks < 60))
        {
            System.out.println("Grade : C+");
        }
        else if((iMarks >= 40) && (iMarks < 50))
        {
            System.out.println("Grade : c");
        }
        else
        {
            System.out.println("Grade : Fail");
        }
    }
}
////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program4_2
//  Method Name     :   main
//  Description     :   Entry point Function for the Application
//
////////////////////////////////////////////////////////////////////////////

class Program4_2
{
    public static void main(String[] args)
    {
        Logic lobj = new Logic();
        lobj.DisplayGrade(82);
    }
}
////////////////////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handeld by This Application
//
//  Input   :   82    Output  :     Grade : B+
//
////////////////////////////////////////////////////////////////////////////