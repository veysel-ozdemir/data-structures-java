package Arrays.OrderedArray;

class OrderedArrayApp {
    public static void main(String[] args)
    {
        int maxSize = 100;
        OrderedArray arr = new OrderedArray(maxSize);

        arr.insert(77); arr.insert(99); arr.insert(44); arr.insert(55);
        arr.insert(22); arr.insert(88); arr.insert(11);
        arr.insert(00); arr.insert(66); arr.insert(33);

        int searchKey = 55;

        if(arr.find(searchKey) != -1) {
            System.out.println("Found " + searchKey);
        } else {
            System.out.println("Can't find " + searchKey);
        }

        arr.display();
        System.out.println("Size: " + arr.size());
        arr.delete(00); arr.delete(55); arr.delete(99);
        arr.display();
        System.out.println("Size: " + arr.size());
    }
}