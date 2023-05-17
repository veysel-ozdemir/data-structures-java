package AdvancedSorting.QuickSort.Partition;

class PartitionApp
{
    public static void main(String[] args)
    {
        int maxSize = 16; // array size
        Array arr; // reference to array
        arr = new Array(maxSize); // create the array
        for(int j=0; j<maxSize; j++) // fill array with random numbers
        { 
            long n = (int)(java.lang.Math.random()*199);
            arr.insert(n);
        }
        arr.display(); // display unsorted array
        int size = arr.size();
        /*
        // choosing pivot manually
        long pivot = 99;
        System.out.print("Pivot is " + pivot);
        int partDex = arr.partitionIt(0, size-1, pivot); // partition array
        System.out.println(", Partition is at index " + partDex);
        arr.display(); // display partitioned array
        */
        // choosing pivot automatically as the rightmost element
        arr.recQuickSort(0, size-1);
        arr.display(); // display partitioned array
    } // end main()
}