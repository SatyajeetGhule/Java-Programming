////////////////////////////////////////////////////////////////////////////
//
//  Package / Import Section 
//
////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////
//
//  Function Name :    CheckVowel
//  Description   :    accept string from user and check whether it contains
//                     vowels in it or not.
//  Input         :    String
//  Output        :    Boolean (print String)
//  Author        :    Satyajeet Manohar Ghule
//  Date          :    04/12/2025
//
////////////////////////////////////////////////////////////////////////////

class Pattern
{
    boolean CheckVowel(String str)
    {
        int iCnt = 0;   
        for(iCnt = 0; iCnt < str.length(); iCnt++)
        {
            if((str.charAt(iCnt) =='a') || (str.charAt(iCnt) =='e') || (str.charAt(iCnt) =='i') || (str.charAt(iCnt) =='o') || (str.charAt(iCnt) =='u') ||
               (str.charAt(iCnt) =='A') || (str.charAt(iCnt) =='E') || (str.charAt(iCnt) =='I') || (str.charAt(iCnt) =='O') || (str.charAt(iCnt) =='U'))
            {
                return true;
            }
        }
        return false;
    }
}

////////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Program16_4
//  Method Name     :   main
//  Description     :   Entry point Function for the Application
//
////////////////////////////////////////////////////////////////////////////

class Program16_4
{
    public static void main(String[] args)
    {
        Pattern pobj = new Pattern();
        String sValue = null;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter a String:");
        sValue = sobj.nextLine();

        bRet = pobj.CheckVowel(sValue);
        
        if(bRet == true)
        {
            
        System.out.println("Containce Vowel : ");
        }
        else
        {
            System.out.println("There is no Vowel : ");
        }

        sobj.close();
    }
}

////////////////////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handeld by This Application
//
//  Input   :   “MarvellouS”        Output  :   Containce Vowel
//  Input   :   "SATYAjeet GHule"   Output  :   Containce Vowel
//  Input   :   "Xyz"               Output  :   There is no Vowel
//
////////////////////////////////////////////////////////////////////////////