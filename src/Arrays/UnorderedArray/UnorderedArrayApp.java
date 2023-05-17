package Arrays.UnorderedArray;

class UnorderedArrayApp {
    public static void main(String[] args)
    {
        int maxSize = 100; // array size
        UnorderedArray arr; // reference to array
        arr = new UnorderedArray(maxSize); // create the array
        // inser 10 items
        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);

        arr.display(); // display items

        int searchKey = 35; // search for item

        if(arr.find(searchKey)){
            System.out.println("Found " + searchKey);
        } else {
            System.out.println("Can't find " + searchKey);
        }
        // delete 3 items
        arr.delete(00);
        arr.delete(55);
        arr.delete(99);

        arr.display(); // display items again
    }
}
