package Stacks.DelimiterMatching;

class BracketChecker
{
    private String input; // input string

    public BracketChecker(String in) // constructor
    {
        input = in;
    }

    public void check()
    {
        int stackSize = input.length();// get max stack size
        MyStack theStack = new MyStack(stackSize);// make stack
        for(int j=0; j<input.length(); j++)// get chars in turn
        {
            char ch = input.charAt(j); // get char
            switch(ch)
            {
                case '{': case '[': case '(': // opening symbols
                    theStack.push(ch); // push them
                    break;
                case '}': case ']': case ')': // closing symbols
                    if( !theStack.isEmpty() ) // if stack not empty,
                    {
                        char chx = theStack.pop(); // pop and check
                        if( (ch=='}' && chx!='{') ||
                            (ch==']' && chx!='[') || 
                            (ch==')' && chx!='(') )
                                System.out.println("Error: "+ch+" at "+j);
                    }else // prematurely empty
                        System.out.println("Error: "+ch+" at "+j);
                    break;
                default: // no action on other characters
                    break;
            } // end switch
        } // end for
        // at this point, all characters have been processed
        if( !theStack.isEmpty() )
            System.out.println("Error: missing right delimiter");
    } // end check()
} // end class BracketChecker