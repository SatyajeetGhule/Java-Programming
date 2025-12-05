////////////////////////////////////////////////////////////////////////////
//
//  Package / Import Section 
//
////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////
//
//  Function Name :    CountChar
//  Description   :    Accept string from user and accept one character.
//                     Return frequency of that character.
//  Input         :    String, Charecter
//  Output        :    Integer
//  Author        :    Satyajeet Manohar Ghule
//  Date          :    04/12/2025
//
////////////////////////////////////////////////////////////////////////////

class Pattern
{
    int CheckChar(String str, char ch)
    {
        int iCnt = 0, iCount = 0;
        for(iCnt = 0; iCnt < str.length(); iCnt++)
        {
            if(str.charAt(iCnt) == ch)
            {
               iCount++;
            }            
        }
        return iCount;             
    }
}

////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program18_2
//  Method Name     :   main
//  Description     :   Entry point Function for the Application
//
////////////////////////////////////////////////////////////////////////////

class Program18_2
{
    public static void main(String[] args)
    {
        Pattern pobj = new Pattern();
        String sValue = null;
        char cValue = '\0';
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter a String:");
        sValue = sobj.nextLine();

        System.out.println("Enter a Charecter:");
        cValue = sobj.next().charAt(cValue);

        iRet = pobj.CheckChar(sValue, cValue);
        
        System.out.println("Frequency of "+cValue+" Charecter is : "+iRet);
        
        sobj.close();
    }
}

////////////////////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handeld by This Application
//
//  Input   :                           Output  :    
//          Enter a String :                   Frequency of M Charecter is : 
//            Marvellous Multi OS                 2                        
//          
//          Enter a Charecter :
//              M
//
//  Input   :                           Output  :
//          Enter a String :                   Frequency of W Charecter is : 
//            Marvellous Multi OS                 0
//          
//          Enter a Charecter :
//              W
//
////////////////////////////////////////////////////////////////////////////