package AdvancedSorting.QuickSort.MedianOfThree;

class QuickSortApp
{
    public static void main(String[] args)
    {
        int maxSize = 16; // array size
        Array arr; // reference to array
        arr = new Array(maxSize); // create the array
        for(int j=0; j<maxSize; j++) // fill array with
        { // random numbers
            long n = (int)(java.lang.Math.random()*99);
            arr.insert(n);
        }
        arr.display(); // display items
        arr.quickSort(); // quicksort them
        arr.display(); // display them again
    } // end main()
} // end class QuickSortApp