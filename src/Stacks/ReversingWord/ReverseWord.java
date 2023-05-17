package Stacks.ReversingWord;

import java.util.Scanner;

class ReverseWord
{
    public static void main(String[] args)
    {
        String input, output;
        Scanner s = new Scanner(System.in);
        while(true)
        {
            System.out.print("Enter a string: ");
            input = s.nextLine(); // readline a string from keyboard
            if ( input.equals("") ) // quit if [Enter]
                break;
            // make a Reverser
            Reverser theReverser = new Reverser(input);
            output = theReverser.doRev(); // use it
            System.out.println("Reversed: " + output);
        } // end while
        s.close();
    } // end main()
} // end class ReverseWord