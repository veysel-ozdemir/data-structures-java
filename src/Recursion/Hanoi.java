package Recursion;

class Hanoi {
    public static void main(String[] args) {
        int nDisks = 3;
        Towers_Of_Hanoi(nDisks, 'A', 'B', 'C');
    }

    public static void Towers_Of_Hanoi(int topN, char from, char inter, char to)
    {
        if (topN==1)
            System.out.println("Disk 1 from " + from + " to "+ to);
        else
        {
            Towers_Of_Hanoi(topN-1, from, to, inter); // from-->inter
            System.out.println("Disk " + topN + " from " + from + " to "+ to);
            Towers_Of_Hanoi(topN-1, inter, from, to); // inter-->to
        }
    }
}