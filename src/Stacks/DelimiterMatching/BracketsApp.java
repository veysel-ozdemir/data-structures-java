package Stacks.DelimiterMatching;

import java.util.Scanner;

class BracketsApp
{
    public static void main(String[] args)
    {
        String input;
        while(true)
        {
            System.out.print( "Enter string containing delimiters: ");
            Scanner s = new Scanner(System.in);
            input = s.nextLine(); // read a string from keyboard
            if ( input.equals("") ) // quit if [Enter]
                break;
            // make a BracketChecker
            BracketChecker theChecker = new BracketChecker(input);
            theChecker.check(); // check brackets
            s.close();
        } // end while
    } // end main()
} // end class BracketsApp