package AdvancedSorting.QuickSort.Partition;

class Array
{
    private long[] theArray; // ref to array theArray
    private int nElems; // number of data items
    public Array(int max) // constructor
    {
        theArray = new long[max]; // create the array
        nElems = 0; // no items yet
    }
        public void insert(long value) // put element into array
    {
        theArray[nElems++] = value; // insert it & then increment size
    }
    public int size() // return number of items
    {
        return nElems;
    }
    public void display() // displays array contents
    {
        System.out.print("Array = ");
        for(int j=0; j<nElems; j++) // for each element,
            System.out.print(theArray[j] + " "); // display it
        System.out.println();
    }
    public int partitionIt(int left, int right, long pivot)
    {
        int leftPtr = left-1; // right of first elem
        int rightPtr = right + 1; // left of pivot
        while(true)
        {
            // find bigger item
            while(leftPtr < right && theArray[++leftPtr] < pivot); // (nop)
            // find smaller item
            while(rightPtr > left && theArray[--rightPtr] > pivot); // (nop)
            if (leftPtr >= rightPtr) // if pointers cross,
                break; // partition done
            else // not crossed, so
                swap(leftPtr, rightPtr); // swap elements
        } // end while(true)
        return leftPtr; // return partition
    } // end partitionIt()
    public void swap(int dex1, int dex2)// swap two elements
    {
        long temp;
        temp = theArray[dex1]; // A into temp
        theArray[dex1] = theArray[dex2]; // B into A
        theArray[dex2] = temp; // temp into B
    } // end swap()

    
    public void recQuickSort(int left, int right)
    {
        if(right-left <= 0) // if size <= 1,
            return; // already sorted
        else // size is 2 or larger
        {
            long pivot = theArray[right]; // rightmost item
            // partition range
            int partition = partition(left, right, pivot);
            recQuickSort(left, partition-1); // sort left side
            recQuickSort(partition+1, right); // sort right side
        }
    } // end recQuickSort()
    public int partition(int left, int right, long pivot)
    {
        int leftPtr = left-1; // left (after ++)
        int rightPtr = right; // right-1 (after--)
        while(true)
        {
            // find bigger item
            while( theArray[++leftPtr] < pivot ); // (nop)
            // find smaller item
            while(rightPtr > 0 && theArray[--rightPtr] > pivot); // (nop)
            if (leftPtr >= rightPtr) // if pointers cross,
                break; // partition done
            else // not crossed, so
                swap(leftPtr, rightPtr); // swap elements
        } // end while(true)
        swap(leftPtr, right); // restore pivot
        return leftPtr; // return pivot location
    } // end partition()
} // end class Array