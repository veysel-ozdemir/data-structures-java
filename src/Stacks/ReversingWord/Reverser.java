package Stacks.ReversingWord;

class Reverser
{
    private String input; // input string
    private String output;
    
    public Reverser(String in) // constructor
    {
        input = in;
    }
    
    public String doRev() // reverse the string
    {
        int stackSize = input.length(); // get max stack size
        CharStack theStack = new CharStack(stackSize);
        for(int j=0; j<input.length(); j++)
        {
            char ch = input.charAt(j); // get a char from input
            theStack.push(ch); // push it
        }
        output = "";
        while( !theStack.isEmpty() )
        {
            char ch = theStack.pop(); // pop a char,
            output += ch; // append to output
        }
        return output;
    } // end doRev()
} //end class Reverser