////////////////////////////////////////////////////////////////////////////
//
//  Package / Import Section 
//
////////////////////////////////////////////////////////////////////////////

////////////////////////////////////////////////////////////////////////////
//
//  Class Name    :    Logic
//  Method Name   :    ProductofDigit
//  Description   :    Disaplay on screen and print calculate Product
//                     of Digit a number.
//  Input         :    Integer
//  Output        :    Void
//  Author        :    Satyajeet Manohar Ghule
//  Date          :    01/10/2025
//
////////////////////////////////////////////////////////////////////////////

class Logic
{
    void ProductofDigit(int iNo)
    {
        int iDigit = 0, iMulti = 0, iTemp = 0;
        iTemp = iNo;
        iMulti = 1;

        while (iNo > 0)
        {
            iDigit = iNo % 10;

            iMulti *= iDigit;
            iNo = iNo / 10; 
        }
        System.out.println(iTemp+", Product of all Digit is : "+iMulti);
    }
}
////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program6_1
//  Method Name     :   main
//  Description     :   Entry point Function for the Application
//
////////////////////////////////////////////////////////////////////////////

class Program6_1
{
    public static void main(String[] args)
    {
        Logic lobj = new Logic();
        lobj.ProductofDigit(234);
    }
}
////////////////////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handeld by This Application
//
//  Input   :    234   Output  : 234, Product of all Digits is : 24
//
////////////////////////////////////////////////////////////////////////////