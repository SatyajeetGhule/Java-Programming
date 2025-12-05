////////////////////////////////////////////////////////////////////////////
//
//  Package / Import Section 
//
////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////
//
//  Function Name :    lastChar
//  Description   :    Accept string from user and accept one character.
//                     Return index of last occurrence of that character.
//  Input         :    String, Character
//  Output        :    Integer
//  Author        :    Satyajeet Manohar Ghule
//  Date          :    04/12/2025
//
////////////////////////////////////////////////////////////////////////////

class Pattern
{
    int lastChar(String str, char ch)
    {
        int iCnt = 0, iCount = 0;
        for(iCnt = 0; iCnt < str.length(); iCnt++)
        {
            if(str.charAt(iCnt) == ch)
            {
               iCount = iCnt;
            }            
        }
        return iCount;             
    }
}

////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program18_4
//  Method Name     :   main
//  Description     :   Entry point Function for the Application
//
////////////////////////////////////////////////////////////////////////////

class Program18_4
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

        iRet = pobj.lastChar(sValue, cValue);
        
        System.out.println("Last Index of "+cValue+" Charecter is : "+iRet);
        
        sobj.close();
    }
}

////////////////////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handeld by This Application
//
//  Input   :                           Output  :    
//          Enter a String :                   Index of 'M' Charecter is : 
//            Satyajeet                           4                         
//          
//          Enter a Charecter :
//              a
//
//  Input   :                           Output  :
//          Enter a String :                   Index of 'W' Charecter is : 
//            Marvellous Multi OS                 -1
//          
//          Enter a Charecter :
//              W
//
//  Input   :                           Output  :
//          Enter a String :                   Index of 'e' Charecter is : 
//            Marvellous Multi OS                 4
//          
//          Enter a Charecter :
//              e
//
////////////////////////////////////////////////////////////////////////////