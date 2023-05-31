package Hash;

// Handling Collisions - Open Adressing - Linear Probing

class HashApp {

    DataItem[] hashArray;
    int arraySize;
    private static final DataItem nonItem = null;

    public DataItem find(int key) // find item with key
    { // assumes table not full
        int hashVal = hashFunc(key); // hash the key
        // until empty cell or -1
        while (hashArray[hashVal] != null)
        {
            if (hashArray[hashVal].getKey() == key)
                return hashArray[hashVal]; // yes, return item
            ++hashVal; // go to next cell
            hashVal %= arraySize; // wrap around if necessary
        }
        return null; // can’t find item
    } // end find

    public void insert(DataItem item)
    { // assumes table not full
        int key = item.getKey(); // extract key
        int hashVal = hashFunc(key); // hash the key
        // until empty cell or -1
        while (hashArray[hashVal] != null && hashArray[hashVal].iData != -1)
        {
            ++hashVal; // go to next cell
            hashVal %= arraySize; // wrap around if necessary
        }
        hashArray[hashVal] = item; // insert item
    } // end insert

    private int hashFunc(int key) {
        return 0;
    }

    public DataItem delete(int key)
    {
        int hashVal = hashFunc(key); // hash the key
        // until empty cell or -1
        while (hashArray[hashVal] != null)
        {
            if(hashArray[hashVal].getKey() == key)
            {
                DataItem temp = hashArray[hashVal]; // save item
                hashArray[hashVal] = nonItem; // delete item
                return temp; // return item
            }
            ++hashVal; // go to next cell
            hashVal %= arraySize; // wrap around if necessary
        }
        return null; // can’t find item
    } // end delete
    
    public static void main(String[] args) {
        //
    }
}