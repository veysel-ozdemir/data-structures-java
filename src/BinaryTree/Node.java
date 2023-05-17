package BinaryTree;

class Node
{
    int iData; // data used as key value
    Node leftChild; // this node’s left child
    Node rightChild; // this node’s right child

    public void displayNode()
    {
        System.out.print("{" + iData + "} ");
    }
}