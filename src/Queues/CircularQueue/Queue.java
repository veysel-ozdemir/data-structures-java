package Queues.CircularQueue;

public class Queue
{
    private int maxSize;
    private int[] queArray;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int s) // constructor
    {
        maxSize = s;
        queArray = new int[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(int j)// put item at rear of queue
    {
        if(rear == maxSize-1)
            rear = -1; // deal with wraparound
        // increment rear and insert
        queArray[++rear] = j;
        nItems++; // one more item
    }

    public int remove() // take item from front of queue
    {
        // get value and incr front
        int temp = queArray[front++];
        if(front == maxSize) // deal with wraparound
            front = 0;
        nItems--; // one less item
        return temp;
    }

    public int peekFront()
    {
        return queArray[front];
    }

    public boolean isEmpty() // true if queue is empty
    {
        return (nItems==0);
    }

    public boolean isFull() // true if queue is full
    {
        return (nItems==maxSize);
    }

    public int size() // number of items in queue
    {
        return nItems;
    }

    public void display() // display
    {
        for(int i = front; i < maxSize; i++)
        {
            System.out.print(queArray[i]+" ");

            if(i == maxSize-1)
                i = -1;
            else if(i == rear)
                break;
        }
        System.out.println();
    }
} // end class Queue