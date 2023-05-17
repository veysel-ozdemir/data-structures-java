package BinaryTree;

class TreeApp
{
    public static void main(String[] args)
    {
        Tree theTree = new Tree(); // make a tree
        theTree.insert(50); // insert 3 nodes
        theTree.insert(25);
        theTree.insert(75);
        int key = 25;
        Node found = theTree.find(key); // find node with specified key
        if(found != null)
            System.out.println("Found the node with key " + key);
        else
            System.out.println("Could not find node with key " + key);
    } // end main()
} // end class TreeApp