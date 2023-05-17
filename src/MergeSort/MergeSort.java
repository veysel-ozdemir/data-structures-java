package MergeSort;

class MergeSort {
    long[] theArray, workSpace;

    // Merging Two Sorted Arrays
    public void merge(int[] arrayA, int sizeA, int[] arrayB, int sizeB, int[] arrayC)
    {
        int A_Index=0, B_Index=0, C_Index=0;
        while(A_Index < sizeA &&B_Index < sizeB) // neither array empty
        {
            if( arrayA[A_Index] < arrayB[B_Index])
                arrayC[C_Index++] = arrayA[A_Index++];
            else
                arrayC[C_Index++] = arrayB[B_Index++];
        }
        while(A_Index < sizeA)
            arrayC[C_Index++] = arrayA[A_Index++];
        while(B_Index < sizeB)
            arrayC[C_Index++] = arrayB[B_Index++];
    }
    // Recirsive Merge Sort
    private void recMergeSort(long[] workSpace, int lowerBound, int upperBound)
    {
        if(lowerBound == upperBound) // if range is 1,
            return; // no use sorting
        else
        {
            int mid = (lowerBound+upperBound) / 2;
            recMergeSort(workSpace, lowerBound, mid);
            recMergeSort(workSpace, mid+1, upperBound);
            merge(workSpace, lowerBound, mid+1, upperBound);
        }
    }
    // Non-Recursive Merge Sort
    private void merge(long[] workSpace, int lowPtr, int highPtr, int upperBound)
    {
        int j = 0;
        int lowerBound = lowPtr;
        int mid = highPtr-1;
        int n = upperBound-lowerBound+1;
        while(lowPtr <= mid && highPtr <= upperBound)
            if( theArray[lowPtr] < theArray[highPtr])
                workSpace[j++] = theArray[lowPtr++];
            else
                workSpace[j++] = theArray[highPtr++];
        while(lowPtr <= mid)
            workSpace[j++] = theArray[lowPtr++];
        while(highPtr <= upperBound)
            workSpace[j++] = theArray[highPtr++];
        for(j=0; j<n;j++) 
            theArray[lowerBound+j] = workSpace[j];
    }
}
