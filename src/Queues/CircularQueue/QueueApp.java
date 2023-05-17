package Queues.CircularQueue;

class QueueApp
{
    public static void main(String[] args)
    {
        Queue theQueue = new Queue(5); // queue holds 5 items
        // insert 4 items
        theQueue.insert(10); theQueue.insert(20); theQueue.insert(30); theQueue.insert(40);
        // remove 3 items (10, 20, 30)
        theQueue.remove(); theQueue.remove(); theQueue.remove();
        // insert 4 more items
        theQueue.insert(50); theQueue.insert(60); // (wraps around)
        theQueue.insert(70); theQueue.insert(80);

        theQueue.display();

        /*while( !theQueue.isEmpty() ) // remove and display
        { // all items
            long n = theQueue.remove(); // (40, 50, 60, 70, 80)
            System.out.print(n);
            System.out.print(" ");
        }*/
        System.out.println("");
    } // end main()
} // end class QueueApp