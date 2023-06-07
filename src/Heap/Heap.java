package Heap;

import java.util.Arrays;

/* 
    ******** FORMULA OF INDEXES *************
    *   Node Index --> N                    *
    *   Parent Index --> (N-1) / 2          *
    *   Left Child Index --> (N * 2) + 1    *
    *   Right Child Index --> (N * 2) + 2   *
    *****************************************
*/
public class Heap {

    static Node[] heapArray;
    int currentSize;
    int maxSize;

    public Heap(int maxSize) {
        this.maxSize = maxSize;
        currentSize = 0;
        heapArray = new Node[maxSize];
    }

    public boolean insert(int key)
    {
        if(currentSize==maxSize) // if array is full,
            return false; // failure
        Node newNode = new Node(key); // make a new node
        heapArray[currentSize] = newNode; // put it at the end
        moveUp(currentSize++); // move it up
        return true; // success
    } // end insert()

    public void moveUp(int index)
    {
        int parent = (index-1) / 2;
        Node bottom = heapArray[index];
        while( index > 0 && heapArray[parent].getKey() < bottom.getKey() )
        {
            heapArray[index] = heapArray[parent]; // move node down
            index = parent; // move index up
            parent = (parent-1) / 2; // parent <- its parent
        } // end while
        heapArray[index] = bottom;
    } // end moveUp()

    public Node remove() // delete item with max key
    { // (assumes non-empty list)
        Node root = heapArray[0];
        heapArray[0] = heapArray[--currentSize];
        moveDown(0); // movedown the root
        return root; // return removed node
    } // end remove()

    public void moveDown(int index)
    {
        int largerChild;
        Node top = heapArray[index]; // save root
        while(index < currentSize/2)// while node has at least one child
        {
            int leftChild = 2*index+1;
            int rightChild = leftChild+1; // or 2*index+2
            // find larger child
            if( rightChild < currentSize && // (rightChild exists?)
                heapArray[leftChild].getKey() < heapArray[rightChild].getKey() )
                largerChild = rightChild;
            else
                largerChild = leftChild;
            // top >= largerChild?
            if(top.getKey() >= heapArray[largerChild].getKey())
                break;
            // shift child up
            heapArray[index] = heapArray[largerChild];
            index = largerChild; // go down
        } // end while
        heapArray[index] = top; // index <-root
    } // end moveDown()

    public static void main(String[] args) {
        int[] unsortedArray = {95, 82, 51, 63, 70, 37, 10, 43, 27, 55, 34, 30};
        int size = unsortedArray.length;
        int[] sortedArray = new int[size];
        Heap theHeap = new Heap(size);
        // The efficiency of the heap data structure leads to a surprisingly simple and very efficient sorting algorithm called heapsort.
        // 1 - Insert all the unordered items into a heap using the insert() method
        for (int i = 0; i < size; i++)
            theHeap.insert(unsortedArray[i]);
        // 2 - Remove the items in descending sorted order
        for (int i = 0; i < size; i++)
            sortedArray[i] = theHeap.remove().getKey();
        System.out.println("Unsorted: \t" + Arrays.toString(unsortedArray));
        System.out.println("Sorted: \t" + Arrays.toString(sortedArray));
    }
}
