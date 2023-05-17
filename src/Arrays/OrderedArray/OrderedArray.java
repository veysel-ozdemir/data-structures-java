package Arrays.OrderedArray;

class OrderedArray {
    private long[] a; // ref to array a
    private int nElems; // number of data items


    public OrderedArray(int max) // constructor
    {
        a = new long[max]; // create array
        nElems = 0;
    }

    public int size()
    {
        return nElems;
    }

    public int find(long searchKey) // binary search
    {
        int lowerBound = 0;
        int upperBound = nElems - 1;
        int currentIndex;

        while(true)
        {
            currentIndex = (lowerBound + upperBound) / 2;

            if(a[currentIndex] == searchKey)
            {
                return currentIndex; // found it
            } else if(lowerBound > upperBound) {
                return -1; // can't find it
            } else { // divide range
                if(a[currentIndex] < searchKey) {
                    lowerBound = currentIndex + 1; // it's in upper half
                } else {
                    upperBound = currentIndex - 1; // it's in lower half
                }
            }
        }
    }

    public void insert(long value) // put element into array
    {
        int j;
        for(j = 0; j < nElems; j++) // find where it goes
        {
            if(a[j] > value) // (linear search)
            {
                break;
            }
        }
        for(int k = nElems; k > j; k--) // move bigger ones up
        {
            a[k] = a[k-1];
        }
        a[j] = value; // insert it
        nElems++; // increment size
    }

    public boolean delete(long value)
    {
        int j = find(value);
        if(j == -1) // can't find it
        {
            return false;
        } else // found it
        { // move bigger ones down
            for(int k = j; k < nElems; k++)
            {
                a[k] = a[k+1];
            }
            nElems--; // decrement size
            return true;
        }
    }

    public void display()
    {
        for(int j = 0; j < nElems; j++)
        {
            System.out.print(a[j] + " ");
        }
        System.out.println();
    }
}
